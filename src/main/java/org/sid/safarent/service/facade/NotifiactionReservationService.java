package org.sid.safarent.service.facade;


import org.sid.safarent.bean.notification.NotificationReservation;

import java.util.List;

public interface NotifiactionReservationService {
    public NotificationReservation findByCode(String code);
    public int deleteByCode(String code);

    List<NotificationReservation> findAll();

    int save(NotificationReservation notificationReservation);

    int update(NotificationReservation notificationReservation);

    List<NotificationReservation> findNotificationReservationByCinPropAppartement(Long cinProprApp);


    List<NotificationReservation> findNotificationReservationByCinClient(String cinClient);

    List<NotificationReservation> findByIceAgence(Long iceAgence);
}
