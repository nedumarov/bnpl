package uz.bnpl.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import uz.bnpl.client.entity.ClientDocument;

@Repository
public interface ClientDocumentRepository extends JpaRepository<ClientDocument, Long>, JpaSpecificationExecutor<ClientDocument> {
}