package org.sid.safarent.ws.dto.communDto;


public class ClientDto {


    private String cin ;
    private String prenom ;
    private String nom ;
    private String numTeleClient;

    private String username  ;
    private String password  ;
    private String email_Client  ;
//    private List<ReservationDto> reservationDto ;


    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumTeleClient() {
        return numTeleClient;
    }

    public void setNumTeleClient(String numTeleClient) {
        this.numTeleClient = numTeleClient;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail_Client() {
        return email_Client;
    }

    public void setEmail_Client(String email_Client) {
        this.email_Client = email_Client;
    }




//    public List<ReservationDto> getReservationDto() {
//        return reservationDto;
//    }
//
//    public void setReservationDto(List<ReservationDto> reservationDto) {
//        this.reservationDto = reservationDto;
//    }
}
