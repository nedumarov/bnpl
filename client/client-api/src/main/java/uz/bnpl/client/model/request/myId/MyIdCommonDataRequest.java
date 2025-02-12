package uz.bnpl.client.model.request.myId;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record MyIdCommonDataRequest(
        @NotNull @Size(min = 14, max = 14, message = "State PIN length must be exactly 14 digits") String pinfl,
        @JsonFormat(pattern = "dd-MM-yyyy") LocalDate lastUpdateAddress,
        @JsonFormat(pattern = "dd.MM.yyyy") LocalDate lastUpdatePassData,
        @NotNull String gender,
        String citizenshipId,
        @NotNull @JsonFormat(pattern = "dd.MM.yyyy") LocalDate birthDate,
        String nationalityId,
        String citizenship,
        String lastName,
        String birthPlace,
        String sdkHash,
        String middleName,
        String birthCountryIdCbu,
        String birthCountry,
        String nationality,
        String firstNameEn,
        String nationalityIdCbu,
        String citizenshipIdCbu,
        String lastNameEn,
        String birthCountryId,
        String firstName
) {
}
