package CentralAPIAudit.CentralAPIAudit.repo;

import CentralAPIAudit.CentralAPIAudit.model.StarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarRepo extends JpaRepository<StarEntity,Long> {

}
