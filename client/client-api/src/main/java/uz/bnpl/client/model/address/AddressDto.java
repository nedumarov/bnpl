package uz.bnpl.client.model.address;

import lombok.Builder;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Builder
public record AddressDto(Long id,
                         OffsetDateTime createdAt,
                         OffsetDateTime updatedAt,
                         String region,
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