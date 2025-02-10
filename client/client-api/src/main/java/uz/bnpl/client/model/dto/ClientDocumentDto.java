package uz.bnpl.client.model.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;

public record ClientDocumentDto(Long id, OffsetDateTime createdAt,
                                OffsetDateTime updatedAt,
                                String docType,
                                String docSeries,
                                String docNumber,
                                String docIssuer,
                                OffsetDateTime docIssueDate,
                                OffsetDateTime docExpireDate,
                                ClientInfoDto client) implements Serializable {
}