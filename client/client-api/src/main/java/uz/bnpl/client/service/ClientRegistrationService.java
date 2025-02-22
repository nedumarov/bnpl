package uz.bnpl.client.service;

import uz.bnpl.client.model.clientregistration.ClientRegistrationCreateRequest;
import uz.bnpl.client.model.clientregistration.ClientRegistrationsCreateRequest;

public interface ClientRegistrationService {
    ClientRegistrationCreateRequest<?> registerClient(ClientRegistrationsCreateRequest clientRegistrationDto);
}
