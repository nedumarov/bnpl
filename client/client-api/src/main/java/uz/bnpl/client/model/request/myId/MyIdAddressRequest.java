package uz.bnpl.client.model.request.myId;

public record MyIdAddressRequest(
	Object temporaryAddress,
	MyIdPermanentRegistrationRequest permanentRegistration,
	MyIdTemporaryRegistrationRequest temporaryRegistration,
	String permanentAddress
) {
}
