package uz.bnpl.client.model.dto;

import uz.bnpl.client.constant.DocType;

import java.io.Serializable;
import java.time.OffsetDateTime;

public record ClientDocumentDto(Long id, OffsetDateTime createdAt,
                                OffsetDateTime updatedAt,
                                DocType docType,
                                String docSeries,
                                String docNumber,
                                String docIssuer,
                                OffsetDateTime docIssueDate,
                                OffsetDateTime docExpireDate,
                                ClientInfoDto client) implements Serializable {
}