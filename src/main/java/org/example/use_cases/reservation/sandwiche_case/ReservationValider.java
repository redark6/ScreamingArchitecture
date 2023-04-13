package org.example.use_cases.reservation.sandwiche_case;

public class ReservationValider {

    private Id utilisateurId;
    private Id oeuvreId;
    private String duree;
    private int prix;

    public void setUtilisateurId(Id utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public void setOeuvreId(Id oeuvreId) {
        this.oeuvreId = oeuvreId;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
