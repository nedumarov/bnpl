package uz.bnpl.client.model.request.myId;

public record MyIdTemporaryRegistrationRequest(
	String country,
	String address,
	String regionId,
	String districtIdCbu,
	String dateTill,
	String cadastre,
	String district,
	String regionIdCbu,
	String countryIdCbu,
	String districtId,
	String region,
	String countryId,
	String dateFrom
) {
}
