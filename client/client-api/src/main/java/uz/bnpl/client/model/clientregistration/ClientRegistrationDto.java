package uz.bnpl.client.model.clientregistration;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import uz.bnpl.client.constant.RegistrationType;
import uz.bnpl.client.model.address.AddressDto;
import uz.bnpl.client.model.dto.ClientInfoDto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public record ClientRegistrationDto(Long id,
                                    OffsetDateTime createdAt,
                                    OffsetDateTime updatedAt,
                                    ClientInfoDto client,
                                    AddressDto address,
                                    RegistrationType registrationType,
                                    @JsonFormat(pattern = "yyyy.MM.dd") LocalDate registrationDate,
                                    @JsonFormat(pattern = "yyyy.MM.dd") LocalDate registrationEndDate) implements Serializable {
}