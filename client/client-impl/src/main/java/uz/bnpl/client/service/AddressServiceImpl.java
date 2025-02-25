package uz.bnpl.client.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import uz.bnpl.client.entity.Address;
import uz.bnpl.client.exception.ApplicationException;
import uz.bnpl.client.exception.cause.ApplicationExceptionCause;
import uz.bnpl.client.model.address.AddressCreateRequest;
import uz.bnpl.client.model.address.AddressDto;
import uz.bnpl.client.model.dto.PermanentAddressDto;
import uz.bnpl.client.model.dto.TemporaryAddressDto;
import uz.bnpl.client.model.request.myId.MyIdAddressRequest;
import uz.bnpl.client.repository.AddressRepository;
import uz.bnpl.client.service.mapper.AddressMapper;

import java.util.List;
import java.util.Objects;

@Log4j2
@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressMapper addressMapper;
    private final AddressRepository addressRepository;

    @Override
    public List<AddressDto> createAddress(AddressCreateRequest myIdAddressRequest) {

        PermanentAddressDto permanentAddressDto = null;
        TemporaryAddressDto temporaryAddressDto = null;

        if (Objects.nonNull(myIdAddressRequest.permanentAddress())) {
            Address permanentAddress = saveAddress(addressMapper.toEntity(myIdAddressRequest.permanentRegistration()));
            permanentAddressDto = addressMapper.toPermanentDto(permanentAddress);
        }

        if (Objects.nonNull(myIdAddressRequest.temporaryAddress())) {
            Address temporaryAddress = saveAddress(addressMapper.toEntity(myIdAddressRequest.temporaryRegistration()));
            temporaryAddressDto = addressMapper.toTemporaryDto(temporaryAddress);

        }



        return List.of(addressMapper.fromPermanentToDto(permanentAddressDto), addressMapper.fromTemporaryToDto(temporaryAddressDto))
                .stream()
                .filter(Objects::nonNull)
                .toList();
    }

    private Address saveAddress(Address address) {
        if (addressRepository.existsByCadastre(address.getCadastre())) {
            throw new ApplicationException(ApplicationExceptionCause.ADDRESS_EXISTS);
        }

        return addressRepository.save(address);
    }

}
