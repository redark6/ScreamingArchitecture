package org.example.use_cases.reservation.sandwiche_case;

public interface PaiementRepository {
    Paiement getPaiement(String utilisateurId, String idReservation);
}
