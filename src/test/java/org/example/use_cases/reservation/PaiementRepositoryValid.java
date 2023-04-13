package org.example.use_cases.reservation;

import org.example.use_cases.reservation.sandwiche_case.Paiement;
import org.example.use_cases.reservation.sandwiche_case.PaiementRepository;

public class PaiementRepositoryValid implements PaiementRepository {
    @Override
    public Paiement getPaiement(String utilisateurId, String idReservation) {
        return new Paiement("1", "1", true, 10);
    }
}