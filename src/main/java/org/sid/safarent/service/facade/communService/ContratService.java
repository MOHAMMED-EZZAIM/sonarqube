package org.sid.safarent.service.facade.communService;


import org.sid.safarent.bean.communBean.Contrat;

import java.util.List;

public interface ContratService {
    int save(Contrat contrat);


    Contrat findByNumContrat(int numContrat);
    List<Contrat> findAll();
    int deleteByNumContrat(int numContrat);
    int update(Contrat contrat);
}
