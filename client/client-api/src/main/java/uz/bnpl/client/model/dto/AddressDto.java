package uz.bnpl.client.model.dto;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Builder
@Getter
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
                         String districtIdCbu,
                         Boolean isCurrent) implements Serializable {
}