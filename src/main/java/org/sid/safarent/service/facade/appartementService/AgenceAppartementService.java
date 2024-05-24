package org.sid.safarent.service.facade.appartementService;


import org.sid.safarent.bean.appartementBean.AgenceAppartement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AgenceAppartementService {
    int save(AgenceAppartement agenceAppartement);
    List<AgenceAppartement> findAll();
    int update(AgenceAppartement propAppartemenet);
    AgenceAppartement findByIceAgApp(Long iceAgApp);
    @Transactional
    int deleteByIceAgApp(Long iceAgApp);

    AgenceAppartement findByUsername(String username);

}
