package org.example.use_cases.reservation.sandwiche_case;

public class Paiement {

    private String id;
    private String idReservation;
    private boolean isValide;
    private int prix;

    public Paiement(String id, String idReservation, boolean isValide, int prix) {
        this.id = id;
        this.idReservation = idReservation;
        this.isValide = isValide;
        this.prix = prix;
    }

    public String getId() {
        return id;
    }

    public String getIdReservation() {
        return idReservation;
    }

    public boolean isValide() {
        return isValide;
    }

    public int getPrix() {
        return prix;
    }
}
