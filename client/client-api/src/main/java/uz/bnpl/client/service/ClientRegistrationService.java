package uz.bnpl.client.service;

import uz.bnpl.client.model.dto.ClientRegistrationDto;
import uz.bnpl.client.model.request.myId.MyIdProfileRequest;

public interface ClientRegistrationService {
    public ClientRegistrationDto registerClient(ClientRegistrationDto clientRegistrationDto);
}
