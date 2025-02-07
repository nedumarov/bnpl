package uz.bnpl.clientapi.model.request.myId;

public record MyIdProfileRequest(
	MyIdCommonDataRequest commonData,
	String authenticationMethod,
	MyIdDocDataRequest docData,
	MyIdAddressRequest address,
	MyIdContactsRequest contacts
) {
}
