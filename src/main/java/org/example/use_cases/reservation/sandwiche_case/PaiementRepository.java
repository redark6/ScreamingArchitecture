package org.example.use_cases.reservation.sandwiche_case;

public class PaiementRepository {
    public Paiement getPaiement(String utilisateurId, String idReservation) {
        if(idReservation.equals("1")) {
            return new Paiement("1", "1", true, 10);
        } else {
            return new Paiement("2", "2", false, 10);
        }
    }
}
