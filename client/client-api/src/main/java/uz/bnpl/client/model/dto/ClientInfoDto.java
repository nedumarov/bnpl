package uz.bnpl.client.model.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;

public record ClientInfoDto(Long id,
                            OffsetDateTime createdAt,
                            OffsetDateTime updatedAt,
                            String preferableLanguage,
                            String firstName,
                            String lastName,
                            String patronymic,
                            LocalDate birthDate,
                            String pin,
                            String sex) implements Serializable {
}