package uz.bnpl.client.model.request.myId;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record MyIdAddressRequest(
	String temporaryAddress,
	MyIdPermanentRegistrationRequest permanentRegistration,
	MyIdTemporaryRegistrationRequest temporaryRegistration,
	String permanentAddress
) {
}
