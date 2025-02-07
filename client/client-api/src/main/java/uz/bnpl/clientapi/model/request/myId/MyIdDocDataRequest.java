package uz.bnpl.clientapi.model.request.myId;

public record MyIdDocDataRequest(
	String issuedBy,
	String docTypeIdCbu,
	String issuedById,
	String docTypeId,
	String issuedDate,
	String expiryDate,
	String docType,
	String passData
) {
}
