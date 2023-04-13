package org.example.use_cases.reservation;

import org.example.use_cases.reservation.sandwiche_case.Paiement;
import org.example.use_cases.reservation.sandwiche_case.PaiementRepository;

public class PaiementRepositoryInvalid implements PaiementRepository {
    @Override
    public Paiement getPaiement(String utilisateurId, String idReservation) {
        return new Paiement("2", "2", false, 10);
    }
}
