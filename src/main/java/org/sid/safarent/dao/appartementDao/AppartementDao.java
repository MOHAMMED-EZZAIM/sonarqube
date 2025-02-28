package org.sid.safarent.dao.appartementDao;


import org.sid.safarent.bean.appartementBean.Appartement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppartementDao extends JpaRepository<Appartement,Long> {
   Appartement findByCode(String code);
   int deleteByCode(String code);

   List<Appartement> findByCategoriesAppartementLibelle(String libelle);

   List<Appartement> findByAgenceAppartementIceAgApp(Long iceAgApp);
   List<Appartement> findByAdresse(String adresse);
   List<Appartement> findByLoyerMensuelLessThanEqual(double mont);
}


