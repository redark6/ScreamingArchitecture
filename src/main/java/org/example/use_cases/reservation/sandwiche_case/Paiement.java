package org.example.use_cases.reservation.sandwiche_case;

public class Paiement {

    private final Id id;
    private AwaitingReservation reservation;
    private boolean isValid;
    private int prix;

    public Paiement(Id id, AwaitingReservation reservation, boolean isValid, int prix) {
        this.id = id;
        this.reservation = reservation;
        this.isValid = isValid;
        this.prix = prix;
    }

    public Id getId() {
        return id;
    }

    public AwaitingReservation getReservation() {
        return reservation;
    }

    public boolean isValid() {
        return isValid;
    }

    public int getPrix() {
        return prix;
    }

    void checkPaiement() throws PaiementNonValideException {
        if (!isValid()) {
            throw new PaiementNonValideException();
        }
    }
}
