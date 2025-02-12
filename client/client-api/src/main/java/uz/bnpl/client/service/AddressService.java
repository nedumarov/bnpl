package uz.bnpl.client.service;

import uz.bnpl.client.model.dto.AddressDto;
import uz.bnpl.client.model.request.myId.MyIdAddressRequest;

import java.util.List;

public interface AddressService {

    List<AddressDto> createAddress(MyIdAddressRequest myIdAddressRequest);

}
