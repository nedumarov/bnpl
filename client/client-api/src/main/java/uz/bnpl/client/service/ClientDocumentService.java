package uz.bnpl.client.service;

import uz.bnpl.client.constant.DocType;
import uz.bnpl.client.model.dto.ClientDocumentDto;
import uz.bnpl.client.model.request.myId.MyIdDocDataRequest;

public interface ClientDocumentService {
    public ClientDocumentDto createClientDocument(MyIdDocDataRequest myIdDocDataRequest, DocType docType);
}
