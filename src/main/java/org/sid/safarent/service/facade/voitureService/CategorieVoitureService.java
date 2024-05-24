package org.sid.safarent.service.facade.voitureService;


import org.sid.safarent.bean.voitureBean.CategorieVoiture;

import java.util.List;
public interface CategorieVoitureService {

    int save(CategorieVoiture categorieVoiture);

    int update(String libelle, String libelleNew);

    CategorieVoiture findByLibelle(String libelle);


    List<CategorieVoiture> findAll();

    int deleteByLibelle(String libelle);
}
