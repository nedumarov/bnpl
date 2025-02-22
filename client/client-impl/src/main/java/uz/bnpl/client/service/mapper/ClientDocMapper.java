package uz.bnpl.client.service.mapper;

import org.springframework.stereotype.Component;
import uz.bnpl.client.constant.DocType;
import uz.bnpl.client.entity.ClientDocument;
import uz.bnpl.client.model.dto.ClientDocumentDto;
import uz.bnpl.client.model.request.myId.MyIdDocDataRequest;

@Component
public class ClientDocMapper {

    public ClientDocument toEntity(MyIdDocDataRequest myIdDocDataRequest,DocType docType) {
        return ClientDocument.builder()
                .docIssueDate(myIdDocDataRequest.issuedDate())
                .docExpireDate(myIdDocDataRequest.expiryDate())
                .docIssuer(myIdDocDataRequest.issuedBy())
                .docSeries(myIdDocDataRequest.docTypeId())
                .docNumber(myIdDocDataRequest.docTypeId())
                .docType(docType.toString())
                .build();
    }

    public ClientDocumentDto toDto(ClientDocument clientDocument, DocType docType) {
        return ClientDocumentDto.builder()
                .docSeries(clientDocument.getDocSeries())
                .docType(docType)
                .docIssuer(clientDocument.getDocIssuer())
                .docIssueDate(clientDocument.getDocIssueDate())
                .docExpireDate(clientDocument.getDocExpireDate())
                .docNumber(clientDocument.getDocNumber())
                .build();
    }
}
