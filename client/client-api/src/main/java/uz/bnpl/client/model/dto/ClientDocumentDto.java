package uz.bnpl.client.model.dto;

import lombok.Builder;
import uz.bnpl.client.constant.DocType;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Builder
public record ClientDocumentDto(Long id, OffsetDateTime createdAt,
                                OffsetDateTime updatedAt,
                                DocType docType,
                                String docSeries,
                                String docNumber,
                                String docIssuer,
                                LocalDate docIssueDate,
                                LocalDate docExpireDate,
                                ClientInfoDto client) implements Serializable {
}