package org.example.use_cases.reservation.sandwiche_case;

public class ReservationValider {

    private String utilisateurId;
    private String oeuvreId;
    private String duree;
    private int prix;

    public void setUtilisateurId(String utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public void setOeuvreId(String oeuvreId) {
        this.oeuvreId = oeuvreId;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
