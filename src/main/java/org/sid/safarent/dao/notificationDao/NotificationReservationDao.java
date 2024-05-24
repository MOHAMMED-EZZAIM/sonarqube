package org.sid.safarent.dao.notificationDao;

import org.sid.safarent.bean.notification.NotificationReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationReservationDao extends JpaRepository<NotificationReservation,Long> {

     NotificationReservation findByCode(String code);
     int deleteByCode(String code);
     List<NotificationReservation> findNotificationReservationByCinClient(String cinClient);
     List<NotificationReservation> findNotificationReservationByCinPropAppartement(Long cinProprApp);
     List<NotificationReservation> findByIceAgence(Long iceAgence);
}
