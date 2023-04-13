package org.example.use_cases.reservation.sandwiche_case;

public class AwaitingReservation {

    private String id;
    private String utilisateurId;
    private String oeuvreId;
    private String duree;


    public AwaitingReservation(String id, String utilisateurId, String oeuvreId, String duree) {
        this.id = id;
        this.utilisateurId = utilisateurId;
        this.oeuvreId = oeuvreId;
        this.duree = duree;
    }

    public String getId() {
        return id;
    }

    public String getUtilisateurId() {
        return utilisateurId;
    }

    public String getOeuvreId() {
        return oeuvreId;
    }

    public String getDuree() {
        return duree;
    }
}
