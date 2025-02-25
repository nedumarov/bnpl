package uz.bnpl.client.service.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import uz.bnpl.client.entity.Address;
import uz.bnpl.client.entity.ClientInfo;
import uz.bnpl.client.entity.ClientRegistration;
import uz.bnpl.client.model.address.AddressDto;
import uz.bnpl.client.model.clientregistration.ClientRegistrationCreateRequest;
import uz.bnpl.client.model.clientregistration.ClientRegistrationDto;
import uz.bnpl.client.model.clientregistration.PermanentRegistrationDetails;
import uz.bnpl.client.model.clientregistration.TemporaryRegistrationDetails;

@Component
@RequiredArgsConstructor
public class ClientRegMapper {

    private final ClientInfoMapper clientInfoMapper;
    private final AddressMapper addressMapper;

    public ClientRegistration toEntity(ClientRegistrationDto registrationDto) {
        ClientInfo clientInfo = clientInfoMapper.toEntityFromDto(registrationDto.client());
        Address address = addressMapper.toEntityFromDto(registrationDto.address());

        return ClientRegistration.builder()
                .registrationType(registrationDto.registrationType())
                .registrationDate(registrationDto.registrationDate())
                .registrationEndDate(registrationDto.registrationEndDate())
                .address(address)
                .client(clientInfo)
                .build();
    }

    public ClientRegistrationDto toDto(ClientRegistration registration) {
        return ClientRegistrationDto.builder()
                .registrationType(registration.getRegistrationType())
                .registrationDate(registration.getRegistrationDate())
                .registrationEndDate(registration.getRegistrationEndDate())
                .address(addressMapper.toDto(registration.getAddress()))
                .client(clientInfoMapper.toDto(registration.getClient()))
                .build();
    }

    public ClientRegistrationDto toDtoFromPermanent(ClientRegistrationCreateRequest<PermanentRegistrationDetails> permanentRegistration, AddressDto addressDto) {
        return ClientRegistrationDto.builder()
                .address(addressDto)
                .registrationType(permanentRegistration.registrationDetails().registrationType())
                .registrationDate(permanentRegistration.registrationDetails().registrationDate())
                .build();
    }

    // Метод для создания ClientRegistrationDto из временной регистрации
    public ClientRegistrationDto toDtoFromTemporary(ClientRegistrationCreateRequest<TemporaryRegistrationDetails> temporaryRegistration, AddressDto addressDto) {
        return ClientRegistrationDto.builder()
                .address(addressDto)
                .registrationType(temporaryRegistration.registrationDetails().registrationType())
                .registrationDate(temporaryRegistration.registrationDetails().registrationDate())
                .registrationEndDate(temporaryRegistration.registrationDetails().registrationEndDate())
                .build();
    }
}
