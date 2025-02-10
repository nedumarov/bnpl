package uz.bnpl.client.model.request.myId;

public record MyIdProfileRequest(
	MyIdCommonDataRequest commonData,
	String authenticationMethod,
	MyIdDocDataRequest docData,
	MyIdAddressRequest address,
	MyIdContactsRequest contacts
) {
}
