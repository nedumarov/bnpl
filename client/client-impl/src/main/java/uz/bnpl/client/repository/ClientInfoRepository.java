package uz.bnpl.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import uz.bnpl.client.entity.ClientInfo;

@Repository
public interface ClientInfoRepository extends JpaRepository<ClientInfo, Long>, JpaSpecificationExecutor<ClientInfo> {
}