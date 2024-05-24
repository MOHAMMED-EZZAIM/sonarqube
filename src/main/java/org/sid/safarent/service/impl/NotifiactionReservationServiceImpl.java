package org.sid.safarent.service.impl;

import org.sid.safarent.bean.notification.NotificationReservation;
import org.sid.safarent.dao.notificationDao.NotificationReservationDao;
import org.sid.safarent.service.facade.NotifiactionReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotifiactionReservationServiceImpl implements NotifiactionReservationService {
   @Autowired
    private NotificationReservationDao notificationReservationDao;

    @Override
    public NotificationReservation findByCode(String code) {
        return notificationReservationDao.findByCode(code);
    }

    @Override
    public int deleteByCode(String code) {
        return notificationReservationDao.deleteByCode(code);
    }
    @Override
    public List<NotificationReservation> findAll() {
        return notificationReservationDao.findAll();
    }

    @Override
    public int save(NotificationReservation notificationReservation){
        if(notificationReservation.getCode()==null){
            return -1;
        }
        if(notificationReservation.getCinClient()==null){
            return -2;
        }
        if(notificationReservation.getCinPropAppartement()==null && notificationReservation.getIceAgence()==null){
            return -3;
        }
        if(notificationReservation.getMatriculeVoiture()==null && notificationReservation.getCodeAppartement()==null){
            return -4;
        }
        notificationReservationDao.save(notificationReservation);
        return 1;
    }

@Override
    public int update(NotificationReservation notificationReservation) {
        NotificationReservation existingNotifiaction = findByCode(notificationReservation.getCode());

        if (existingNotifiaction == null) {
            return -1;
        }

        try {
            if (notificationReservation.getCinClient() == null ) {
                return -2;
            }
            if (notificationReservation.getCinPropAppartement() == null && notificationReservation.getIceAgence()==null) {
                return -2;
            }
            if (notificationReservation.getMatriculeVoiture()==null && notificationReservation.getCodeAppartement()== null) {
                return -3;
            }

            existingNotifiaction.setMessageConfermation(notificationReservation.getMessageAnulation());
            existingNotifiaction.setMessageAnulation(notificationReservation.getMessageAnulation());
            existingNotifiaction.setCinClient(notificationReservation.getCinClient());
            existingNotifiaction.setNomClient(notificationReservation.getNomClient());
            existingNotifiaction.setVisible(notificationReservation.isVisible());
            existingNotifiaction.setVisibleClient(notificationReservation.isVisibleClient());



            notificationReservationDao.save(existingNotifiaction);

            return 1;

        } catch (Exception e) {
            System.err.println("Erreur lors de la mise à jour de notification : " + e.getMessage());
            e.printStackTrace();
            return -4;
        }
    }
    @Override
    public List<NotificationReservation> findNotificationReservationByCinPropAppartement(Long proprAppartement) {
        return notificationReservationDao.findNotificationReservationByCinPropAppartement(proprAppartement);
    }

    @Override
    public List<NotificationReservation> findNotificationReservationByCinClient(String cinClient) {
        return notificationReservationDao.findNotificationReservationByCinClient(cinClient);
    }
    @Override
    public List<NotificationReservation> findByIceAgence(Long iceAgence) {
        return notificationReservationDao.findByIceAgence(iceAgence);
    }
}
