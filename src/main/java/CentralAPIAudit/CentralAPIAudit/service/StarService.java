package CentralAPIAudit.CentralAPIAudit.service;


import CentralAPIAudit.CentralAPIAudit.model.StarEntity;
import CentralAPIAudit.CentralAPIAudit.repo.StarRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class StarService  implements ServiceLogic {

    @Autowired
    private  StarRepo starRepo;

//    public StarService(StarRepo starRepo) {
//        this.starRepo = starRepo;
//    }


//    public void saveall(StarEntity starEntity) {
//         starRepo.save(starEntity);
//    }


    @Override
    public StarEntity saveEntity(StarEntity starEntity) {
        return starRepo.save(starEntity);
    }
}
