package uz.bnpl.client.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.bnpl.client.entity.ClientRegistration;
import uz.bnpl.client.model.dto.ClientRegistrationDto;
import uz.bnpl.client.model.request.myId.MyIdProfileRequest;
import uz.bnpl.client.repository.ClientRegistrationRepository;
import uz.bnpl.client.service.mapper.AddressMapper;
import uz.bnpl.client.service.mapper.ClientInfoMapper;
import uz.bnpl.client.service.mapper.ClientRegMapper;


@Service
@RequiredArgsConstructor
public class ClientRegistrationImpl implements ClientRegistrationService {

    private final AddressMapper addressMapper;
    private final ClientInfoMapper clientInfoMapper;
    private final ClientRegistrationRepository clientRegistrationRepository;
    private final ClientRegMapper clientRegMapper;

    @Override
    public ClientRegistrationDto registerClient(ClientRegistrationDto clientRegistrationDto) {

        ClientRegistration clientRegistration =
                clientRegistrationRepository.save(clientRegMapper.toEntity(clientRegistrationDto));
        return registerClient(clientRegMapper)
    }
}
