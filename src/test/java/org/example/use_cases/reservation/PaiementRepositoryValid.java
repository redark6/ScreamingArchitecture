package org.example.use_cases.reservation;

import org.example.use_cases.reservation.sandwiche_case.AwaitingReservation;
import org.example.use_cases.reservation.sandwiche_case.Id;
import org.example.use_cases.reservation.sandwiche_case.Paiement;
import org.example.use_cases.reservation.sandwiche_case.PaiementRepository;

public class PaiementRepositoryValid implements PaiementRepository {
    @Override
    public Paiement getPaiement(Id utilisateurId, AwaitingReservation reservation) {
        return new Paiement(new Id("1"), new AwaitingReservation(new Id("1"),utilisateurId,), true, 10);
    }
}