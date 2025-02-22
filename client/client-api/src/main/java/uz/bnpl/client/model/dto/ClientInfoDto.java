package uz.bnpl.client.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import uz.bnpl.client.constant.Language;
import uz.bnpl.client.constant.Sex;
import uz.bnpl.client.model.address.AddressDto;
import uz.bnpl.client.model.clientregistration.ClientRegistrationDto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

@Builder
public record ClientInfoDto(@JsonIgnore Long id,
                            OffsetDateTime createdAt,
                            @JsonIgnore OffsetDateTime updatedAt,
                            Language preferableLanguage,
                            String firstName,
                            String lastName,
                            String patronymic,
                            LocalDate birthDate,
                            String pin,
                            List<ClientDocumentDto> clientDocuments,
                            List<AddressDto> addresses,
                            List<ClientRegistrationDto> registrations,
                            Sex sex) implements Serializable {
}