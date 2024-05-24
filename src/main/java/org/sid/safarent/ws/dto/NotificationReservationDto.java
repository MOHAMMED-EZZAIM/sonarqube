package org.sid.safarent.ws.dto;

import java.time.LocalDate;

public class NotificationReservationDto {
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
    private boolean isvisible;
    private String MessageConfermation;
    private String MessageAnulation;
    private boolean isVisibleClient;
    private String refReservation;
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

    public LocalDate getDateDebutReservation() {
        return dateDebutReservation;
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

    public boolean isIsvisible() {
        return isvisible;
    }

    public void setIsvisible(boolean isvisible) {
        this.isvisible = isvisible;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCodeAppartement() {
        return codeAppartement;
    }

    public void setCodeAppartement(String codeAppartement) {
        this.codeAppartement = codeAppartement;
    }

    public Long getIceAgence() {
        return iceAgence;
    }

    public void setIceAgence(Long iceAgence) {
        this.iceAgence = iceAgence;
    }

    public Long getCinPropAppartement() {
        return cinPropAppartement;
    }

    public void setCinPropAppartement(Long cinPropAppartement) {
        this.cinPropAppartement = cinPropAppartement;
    }

}
