package uz.bnpl.client.model.dto;

import uz.bnpl.client.constant.RegistrationType;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;

public record ClientRegistrationDto(Long id,
                                    OffsetDateTime createdAt,
                                    OffsetDateTime updatedAt,
                                    ClientInfoDto client,
                                    AddressDto address,
                                    RegistrationType registrationType,
                                    LocalDate registrationDate,
                                    LocalDate registrationEndDate) implements Serializable {
}