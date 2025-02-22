package uz.bnpl.client.model.clientregistration;

import uz.bnpl.client.model.address.AddressCreateRequest;

public record ClientRegistrationCreateRequest<T>(AddressCreateRequest addresses,
                                                 T registrationDetails
) {
}
