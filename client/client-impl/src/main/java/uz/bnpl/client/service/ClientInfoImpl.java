package uz.bnpl.client.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import uz.bnpl.client.constant.Language;
import uz.bnpl.client.entity.ClientInfo;
import uz.bnpl.client.exception.ApplicationException;
import uz.bnpl.client.exception.cause.ApplicationExceptionCause;
import uz.bnpl.client.model.dto.ClientInfoDto;
import uz.bnpl.client.model.request.myId.MyIdProfileRequest;
import uz.bnpl.client.repository.ClientInfoRepository;
import uz.bnpl.client.service.mapper.ClientInfoMapper;

@Log4j2
@Service
@RequiredArgsConstructor
public class ClientInfoImpl implements ClientInfoService {

    private final ClientInfoMapper clientInfoMapper;
    private final ClientInfoRepository clientInfoRepository;

    // AddressService
    // RegistrationService
    // DocumentService

    @Override
    public ClientInfoDto create(MyIdProfileRequest myIdProfileRequest, Language language) {
        if (clientInfoRepository.existsByPin(myIdProfileRequest.commonData().pinfl())) {
            throw new ApplicationException(ApplicationExceptionCause.CLIENT_EXISTS);
        }

        ClientInfo clientInfo = clientInfoRepository.save(clientInfoMapper.toEntity(myIdProfileRequest.commonData(), language));

        // Save address
        // Save registration
        // Documents

        return clientInfoMapper.toDto();
    }
}
