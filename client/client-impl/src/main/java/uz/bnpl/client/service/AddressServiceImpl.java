package uz.bnpl.client.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import uz.bnpl.client.entity.Address;
import uz.bnpl.client.exception.ApplicationException;
import uz.bnpl.client.exception.cause.ApplicationExceptionCause;
import uz.bnpl.client.model.dto.AddressDto;
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
    public List<AddressDto> createAddress(MyIdAddressRequest myIdAddressRequest) {

        Address permanentAddress;
        Address temporaryAddress;

        if (Objects.nonNull(myIdAddressRequest.permanentAddress())) {
            permanentAddress = saveAddress(addressMapper.toEntity(myIdAddressRequest.permanentRegistration()));
        }

        if (Objects.nonNull(myIdAddressRequest.temporaryAddress())) {
            temporaryAddress = saveAddress(addressMapper.toEntity(myIdAddressRequest.temporaryRegistration()));
        }

        return List.of(permanentAddressDto, temporaryAddressDto)
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
