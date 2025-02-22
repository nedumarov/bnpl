package uz.bnpl.client.service.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import uz.bnpl.client.entity.Address;
import uz.bnpl.client.entity.ClientInfo;
import uz.bnpl.client.entity.ClientRegistration;
import uz.bnpl.client.model.dto.ClientRegistrationDto;

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

}
