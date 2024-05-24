package org.sid.safarent.service.facade.appartementService;


import org.sid.safarent.bean.appartementBean.Appartement;

import java.util.List;

public interface AppartementService {
    int save(Appartement appartement);

    List<Appartement> findAll();
    Appartement findByCode(String code);
    int deleteByCode(String code);


    int update(Appartement appartementNv);

    List<Appartement> findByCategoriesAppartementLibelle(String libelle);

    List<Appartement> findByAgenceAppartementIceAgApp(Long iceAgApp);

    List<Appartement> findByAdresse(String adresse);

    List<Appartement> findByLoyerMensuelLessThanEqual(double mont);
}
