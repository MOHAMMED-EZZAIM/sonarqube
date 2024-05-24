package org.sid.safarent.service.facade.communService;


import org.sid.safarent.bean.communBean.Paiement;

import java.util.List;

;

public interface PaiementService {

    int save(Paiement paiement);


    List<Paiement> findAll();

    int update(Paiement paiement);

    Paiement findByRef(String ref);

    int deleteByRef(String ref);


}
