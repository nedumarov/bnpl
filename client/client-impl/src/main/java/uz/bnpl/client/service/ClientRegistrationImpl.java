package uz.bnpl.client.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.bnpl.client.entity.ClientRegistration;
import uz.bnpl.client.model.clientregistration.ClientRegistrationCreateRequest;
import uz.bnpl.client.model.clientregistration.ClientRegistrationDto;
import uz.bnpl.client.model.clientregistration.ClientRegistrationsCreateRequest;
import uz.bnpl.client.repository.ClientRegistrationRepository;
import uz.bnpl.client.service.mapper.AddressMapper;
import uz.bnpl.client.service.mapper.ClientInfoMapper;
import uz.bnpl.client.service.mapper.ClientRegMapper;


@Service
@RequiredArgsConstructor
public class ClientRegistrationImpl implements ClientRegistrationService {

    private final ClientRegistrationRepository clientRegistrationRepository;
    private final ClientRegMapper clientRegistrationMapper;
    private final AddressService addressService;

    @Override
    public ClientRegistrationCreateRequest<?> registerClient(ClientRegistrationsCreateRequest clientRegistrationDto) {
        // TODO check registration request and address is not null
        // TODO check if address exists. If exists then retrieve
        // Address service sends dto -> Client registration service maps dto into entity

        if () {

        }
        return null;
    }
}
