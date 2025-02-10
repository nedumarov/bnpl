package uz.bnpl.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import uz.bnpl.client.entity.ClientRegistration;

@Repository
public interface ClientRegistrationRepository extends JpaRepository<ClientRegistration, Long>, JpaSpecificationExecutor<ClientRegistration> {
}