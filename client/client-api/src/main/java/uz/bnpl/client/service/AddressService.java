package uz.bnpl.client.service;

import uz.bnpl.client.model.address.AddressCreateRequest;
import uz.bnpl.client.model.address.AddressDto;
import uz.bnpl.client.model.request.myId.MyIdAddressRequest;

import java.util.List;

public interface AddressService {

    AddressDto createAddress(AddressCreateRequest addressCreateRequest);

}
