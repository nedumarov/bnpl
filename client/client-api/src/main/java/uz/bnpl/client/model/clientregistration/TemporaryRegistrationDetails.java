package uz.bnpl.client.model.clientregistration;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import uz.bnpl.client.constant.RegistrationType;

import java.time.LocalDate;

public record TemporaryRegistrationDetails(
        @JsonFormat(pattern = "yyyy,MM.dd")
        @Schema(description = "Date  of temporary registration start",
                example = "2025.01.05")
        LocalDate registrationDate,

        @Schema(description = "Registration type like PERMANENT or TEMPORARY",
                requiredMode = Schema.RequiredMode.REQUIRED,
                defaultValue = "TEMPORARY",
                example = "TEMPORARY")
        RegistrationType registrationType,

        @JsonFormat(pattern = "yyyy,MM.dd")
        @Schema(description = "Date of temporary registration end",
                example = "2025.03.01")
        LocalDate registrationEndDate) {
}
