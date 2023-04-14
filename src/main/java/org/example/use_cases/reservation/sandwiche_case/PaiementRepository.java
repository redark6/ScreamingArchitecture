package org.example.use_cases.reservation.sandwiche_case;

import org.example.use_cases.reservation.sandwiche_case.domain.Paiement;
import org.example.use_cases.reservation.sandwiche_case.id.AwaitingReservationId;
import org.example.use_cases.reservation.sandwiche_case.id.UtilisateurId;

public interface PaiementRepository {
    Paiement getPaiement(UtilisateurId utilisateurId, AwaitingReservationId idReservation);

}
