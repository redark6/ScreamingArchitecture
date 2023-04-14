package org.example.use_cases.reservation;

import org.example.use_cases.reservation.sandwiche_case.domain.Paiement;
import org.example.use_cases.reservation.sandwiche_case.PaiementRepository;
import org.example.use_cases.reservation.sandwiche_case.domain.Prix;
import org.example.use_cases.reservation.sandwiche_case.id.AwaitingReservationId;
import org.example.use_cases.reservation.sandwiche_case.id.PaiementId;
import org.example.use_cases.reservation.sandwiche_case.id.UtilisateurId;

public class PaiementRepositoryValid implements PaiementRepository {
    @Override
    public Paiement getPaiement(UtilisateurId utilisateurId, AwaitingReservationId idReservation) {
        return new Paiement(new PaiementId("1"), new Prix(50, "EUR"));
    }
}