package org.sid.safarent.service.facade.communService;


import org.sid.safarent.bean.communBean.Facture;

import java.util.List;

public interface FactureService {
    int save(Facture facture);
    Facture findByRef(String ref);
    List<Facture> findAll();
    int deleteByRef(String ref);

    int update(Facture facture);
}
