package uz.bnpl.clientimpl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import uz.bnpl.clientimpl.entity.ClientInfo;

@Repository
public interface ClientInfoRepository extends JpaRepository<ClientInfo, Long>, JpaSpecificationExecutor<ClientInfo> {
}