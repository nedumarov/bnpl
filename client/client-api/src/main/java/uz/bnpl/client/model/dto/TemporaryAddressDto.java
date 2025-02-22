package uz.bnpl.client.model.dto;

import lombok.Builder;

@Builder
public record TemporaryAddressDto(String country,
                                  String address,
                                  String regionId,
                                  String districtIdCbu,
                                  String dateTill,
                                  String cadastre,
                                  String district,
                                  String regionIdCbu,
                                  String countryIdCbu,
                                  String districtId,
                                  String region,
                                  String countryId,
                                  String dateFrom) {
}
