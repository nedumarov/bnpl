package uz.bnpl.client.model.clientregistration;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

public record ClientRegistrationsCreateRequest(
        @Schema(description = "Permanent address details")
        ClientRegistrationCreateRequest<PermanentRegistrationDetails> permanentRegistration,

        @Schema(description = "Temporary address details")
        ClientRegistrationCreateRequest<TemporaryRegistrationDetails> temporaryRegistration) {
}
