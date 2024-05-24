package org.sid.safarent.dao.communDao;
import org.sid.safarent.bean.communBean.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationDao extends JpaRepository<Reservation,Long > {
    Reservation findByRef(String ref);

    int deleteByRef(String ref);

    Reservation findByVoitureMatricule(String matricule);
    Reservation findByAppartementCode(String code);


    List<Reservation> findAllByClientCin(String cin);

    Reservation findByLocationsRef(String ref);
    List<Reservation> findReservationByVoitureMatricule(String matricule);
    List<Reservation> findReservationByAppartementCode(String code);


}
