package uz.bnpl.client.model.request.myId;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
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
