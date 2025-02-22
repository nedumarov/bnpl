package uz.bnpl.client.model.clientregistration;

import uz.bnpl.client.constant.RegistrationType;

public record ClientRegistrationUpdateRequest(Long addressId,
                                              Long clientId,
                                              RegistrationType registrationType) {
}
