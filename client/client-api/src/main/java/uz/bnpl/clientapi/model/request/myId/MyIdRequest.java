package uz.bnpl.clientapi.model.request.myId;

public record MyIdRequest(
	String comparisonValue,
	String responseId,
	MyIdProfileRequest profile,
	String resultCode,
	String resultNote
) {
}
