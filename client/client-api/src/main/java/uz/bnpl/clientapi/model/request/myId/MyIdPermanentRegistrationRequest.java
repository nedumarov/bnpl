package uz.bnpl.clientapi.model.request.myId;

public record MyIdPermanentRegistrationRequest(
	String country,
	String address,
	String registrationDate,
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
