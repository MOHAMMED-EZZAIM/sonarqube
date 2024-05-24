package org.sid.safarent.service.facade.appartementService;


import org.sid.safarent.bean.appartementBean.CategoriesAppartement;

import java.util.List;
public interface CategoriesAppartementService {
    int save(CategoriesAppartement categoriesAppartement);
    List<CategoriesAppartement> findAll();

    int update(String libelle, String libelleNew);

    CategoriesAppartement findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
}
