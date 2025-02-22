package uz.bnpl.client.model.request.myId;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.LocalDate;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record MyIdDocDataRequest(
	String issuedBy,
	String docTypeIdCbu,
	String issuedById,
	String docTypeId,
	LocalDate issuedDate,
	LocalDate expiryDate,
	String docType,
	String passData
) {
}
