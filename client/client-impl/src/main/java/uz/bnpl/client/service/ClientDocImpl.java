package uz.bnpl.client.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.bnpl.client.constant.DocType;
import uz.bnpl.client.entity.ClientDocument;
import uz.bnpl.client.model.dto.ClientDocumentDto;
import uz.bnpl.client.model.request.myId.MyIdDocDataRequest;
import uz.bnpl.client.repository.ClientDocumentRepository;
import uz.bnpl.client.service.mapper.ClientDocMapper;

@Service
@RequiredArgsConstructor
public class ClientDocImpl implements ClientDocumentService {

    private final ClientDocumentRepository clientDocumentRepository;
    private final ClientDocMapper clientDocMapper;


    @Override
    public ClientDocumentDto createClientDocument(MyIdDocDataRequest myIdDocDataRequest, DocType docType) {

        ClientDocument clientDocument = clientDocumentRepository.save(clientDocMapper.toEntity(myIdDocDataRequest, docType));

        return clientDocMapper.toDto(clientDocument,docType);
    }
}
