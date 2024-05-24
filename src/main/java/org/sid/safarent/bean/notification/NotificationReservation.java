package org.sid.safarent.bean.notification;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class NotificationReservation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String cinClient;
    private String nomClient;
    private String matriculeVoiture;
    private String codeAppartement;
    private Long iceAgence;
    private Long cinPropAppartement;
    private LocalDate dateDebutReservation;
    private LocalDate dateFinReservation;
    private String MessageConfermation;
    private String MessageAnulation;
    private boolean isVisible;
    private boolean isVisibleClient;
    private String refReservation;

    public NotificationReservation() {

    }


    public String getRefReservation() {
        return refReservation;
    }

    public void setRefReservation(String refReservation) {
        this.refReservation = refReservation;
    }

    public boolean isVisibleClient() {
        return isVisibleClient;
    }

    public void setVisibleClient(boolean visibleClient) {
        isVisibleClient = visibleClient;
    }

    public LocalDate getDateDebutReservation() {
        return dateDebutReservation;
    }

    public String getMessageConfermation() {
        return MessageConfermation;
    }

    public void setMessageConfermation(String messageConfermation) {
        MessageConfermation = messageConfermation;
    }

    public String getMessageAnulation() {
        return MessageAnulation;
    }

    public void setMessageAnulation(String messageAnulation) {
        MessageAnulation = messageAnulation;
    }

    public void setDateDebutReservation(LocalDate dateDebutReservation) {
        this.dateDebutReservation = dateDebutReservation;
    }

    public LocalDate getDateFinReservation() {
        return dateFinReservation;
    }

    public void setDateFinReservation(LocalDate dateFinReservation) {
        this.dateFinReservation = dateFinReservation;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCinClient() {
        return cinClient;
    }

    public void setCinClient(String cinClient) {
        this.cinClient = cinClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getMatriculeVoiture() {
        return matriculeVoiture;
    }

    public void setMatriculeVoiture(String matriculeVoiture) {
        this.matriculeVoiture = matriculeVoiture;
    }

    public Long getIceAgence() {
        return iceAgence;
    }

    public void setIceAgence(Long iceAgence) {
        this.iceAgence = iceAgence;
    }

    public String getCodeAppartement() {
        return codeAppartement;
    }

    public void setCodeAppartement(String codeAppartement) {
        this.codeAppartement = codeAppartement;
    }

    public Long getCinPropAppartement() {
        return cinPropAppartement;
    }

    public void setCinPropAppartement(Long cinPropAppartement) {
        this.cinPropAppartement = cinPropAppartement;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public NotificationReservation( String code, String cinClient, String nomClient, String matriculeVoiture, String codeAppartement, Long iceAgence, Long cinPropAppartement, LocalDate dateDebutReservation, LocalDate dateFinReservation, String messageConfermation, String messageAnulation, boolean isVisible, boolean isVisibleClient, String refReservation) {
        this.code = code;
        this.cinClient = cinClient;
        this.nomClient = nomClient;
        this.matriculeVoiture = matriculeVoiture;
        this.codeAppartement = codeAppartement;
        this.iceAgence = iceAgence;
        this.cinPropAppartement = cinPropAppartement;
        this.dateDebutReservation = dateDebutReservation;
        this.dateFinReservation = dateFinReservation;
        MessageConfermation = messageConfermation;
        MessageAnulation = messageAnulation;
        this.isVisible = isVisible;
        this.isVisibleClient = isVisibleClient;
        this.refReservation = refReservation;
    }



}
