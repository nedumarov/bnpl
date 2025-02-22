package uz.bnpl.client.model.address;

import java.io.Serializable;

public record AddressCreateRequest(String region,
                                   String address,
                                   String country,
                                   String cadastre,
                                   String district,
                                   String regionId,
                                   String countryId,
                                   String districtId,
                                   String regionIdCbu,
                                   String countryIdCbu,
                                   String districtIdCbu) implements Serializable {
}
