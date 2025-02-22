package uz.bnpl.client.model.dto;

import lombok.Builder;

@Builder
public record PermanentAddressDto(String country,
                                  String address,
                                  String registrationDate,
                                  String district,
                                  String regionIdCbu,
                                  String regionId,
                                  String countryIdCbu,
                                  String districtIdCbu,
                                  String districtId,
                                  String region,
                                  String cadastre,
                                  String countryId) {
}
