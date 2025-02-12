package uz.bnpl.client.service.mapper;

import org.springframework.stereotype.Component;
import uz.bnpl.client.entity.Address;
import uz.bnpl.client.model.request.myId.MyIdPermanentRegistrationRequest;
import uz.bnpl.client.model.request.myId.MyIdTemporaryRegistrationRequest;

@Component
public class AddressMapper {

    public Address toEntity(MyIdTemporaryRegistrationRequest myIdTemporaryRegistrationRequest) {
        return Address.builder()
                .build();
    }

    public Address toEntity(MyIdPermanentRegistrationRequest myIdTemporaryRegistrationRequest) {
        return Address.builder()
                .build();
    }


}
