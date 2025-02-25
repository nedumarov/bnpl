package uz.bnpl.client.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import uz.bnpl.client.entity.Address;
import uz.bnpl.client.entity.ClientRegistration;
import uz.bnpl.client.exception.ApplicationException;
import uz.bnpl.client.model.address.AddressCreateRequest;
import uz.bnpl.client.model.address.AddressDto;
import uz.bnpl.client.model.clientregistration.*;
import uz.bnpl.client.repository.AddressRepository;
import uz.bnpl.client.repository.ClientRegistrationRepository;
import uz.bnpl.client.service.mapper.AddressMapper;
import uz.bnpl.client.service.mapper.ClientRegMapper;

import java.util.Objects;

@Log4j2
@Service
@RequiredArgsConstructor
public class ClientRegistrationImpl implements ClientRegistrationService {


    private final ClientRegistrationRepository clientRegistrationRepository;
    private final ClientRegMapper clientRegistrationMapper;
    private final AddressService addressService;
    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    @Override
    public ClientRegistrationCreateRequest<?> registerClient(ClientRegistrationsCreateRequest clientRegistrationDto) {
        // TODO check registration request and address is not null
        // TODO check if address exists. If exists then retrieve
        // Address service sends dto -> Client registration service maps dto into entity

        AddressDto permanentAddressDto;
        AddressDto temporaryAddressDto;

        if (Objects.isNull(clientRegistrationDto)) {
            throw new IllegalArgumentException("clientRegistrationDto must not be null");
        }

        ClientRegistrationCreateRequest<PermanentRegistrationDetails> permanentRegistration =
                clientRegistrationDto.permanentRegistration();
        ClientRegistrationCreateRequest<TemporaryRegistrationDetails> temporaryRegistration =
                clientRegistrationDto.temporaryRegistration();

        if (Objects.nonNull(permanentRegistration)) {
            AddressCreateRequest permanentAddressRequest = permanentRegistration.addresses();


            if (addressRepository.existsByCadastre(permanentRegistration.addresses().cadastre())) {
                log.info("address already exists with cadastre {}", permanentRegistration.addresses().cadastre());
                Address existingAddress = addressRepository.findByCadastre(permanentAddressRequest.cadastre());
                permanentAddressDto = addressMapper.toDto(existingAddress);
            } else {
                permanentAddressDto = addressService.createAddress(permanentAddressRequest);
                log.info("address is created");
            }

            ClientRegistrationDto registrationDto = clientRegistrationMapper.toDtoFromPermanent(permanentRegistration, permanentAddressDto);

            ClientRegistration clientRegistration = clientRegistrationMapper.toEntity(registrationDto);
            clientRegistrationRepository.save(clientRegistration);
            log.info("Сохранена постоянная регистрация клиента для адреса с кадастром {}", permanentAddressRequest.cadastre());
        }

        if (Objects.nonNull(temporaryRegistration)) {
            AddressCreateRequest temporaryAddressRequest = temporaryRegistration.addresses();


            if (addressRepository.existsByCadastre(temporaryAddressRequest.cadastre())){
                log.info("address exists");
                Address existingAddress = addressRepository.findByCadastre(temporaryAddressRequest.cadastre());
                temporaryAddressDto = addressMapper.toDto(existingAddress);
            }else {
                temporaryAddressDto = addressService.createAddress(temporaryAddressRequest);
                log.info("создфн временный адрес");
            }

            ClientRegistrationDto registrationDto =
                    clientRegistrationMapper.toDtoFromTemporary(temporaryRegistration,temporaryAddressDto);

            ClientRegistration clientRegistration = clientRegistrationMapper.toEntity(registrationDto);
            clientRegistrationRepository.save(clientRegistration);
        }

        return null;
    }
}
