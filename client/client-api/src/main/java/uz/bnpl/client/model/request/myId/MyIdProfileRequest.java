package uz.bnpl.client.model.request.myId;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record MyIdProfileRequest(
        MyIdCommonDataRequest commonData,
        MyIdDocDataRequest docData,
        MyIdAddressRequest address,
        MyIdContactsRequest contacts
) {
}
