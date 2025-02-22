package uz.bnpl.client.model.request.myId;

import java.time.LocalDate;

public record MyIdPermanentRegistrationRequest(
	String country,
	String address,
	LocalDate registrationDate,
	String district,
	String regionIdCbu,
	String regionId,
	String countryIdCbu,
	String districtIdCbu,
	String districtId,
	String region,
	String cadastre,
	String countryId
) {
}
