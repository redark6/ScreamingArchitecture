package org.example.use_cases.reservation;

import org.example.use_cases.reservation.sandwiche_case.Id;
import org.example.use_cases.reservation.sandwiche_case.Paiement;
import org.example.use_cases.reservation.sandwiche_case.PaiementRepository;

public class PaiementRepositoryInvalid implements PaiementRepository {
    @Override
    public Paiement getPaiement(Id utilisateurId, Id idReservation) {
        return new Paiement(new Id("2"), new Id("2"), false, 10);
    }
}
