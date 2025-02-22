package uz.bnpl.client.model.clientregistration;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import uz.bnpl.client.constant.RegistrationType;

import java.time.LocalDate;

public record PermanentRegistrationDetails(

        @JsonFormat(pattern = "yyyy,MM.dd")
        @Schema(description = "Date of registration",
                example = "2025.01.05")
        LocalDate registrationDate,

        @Schema(description = "Registration type like PERMANENT or TEMPORARY",
                requiredMode = Schema.RequiredMode.REQUIRED,
                defaultValue = "PERMANENT",
                example = "PERMANENT")
        RegistrationType registrationType) {
}
