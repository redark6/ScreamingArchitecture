package org.example.use_cases.reservation;

import org.example.use_cases.reservation.sandwiche_case.*;
import org.example.use_cases.reservation.sandwiche_case.domain.*;
import org.example.use_cases.reservation.sandwiche_case.exception.OeuvreNonDisponibleException;
import org.example.use_cases.reservation.sandwiche_case.exception.PaiementNonValideException;
import org.example.use_cases.reservation.sandwiche_case.id.OeuvreId;
import org.example.use_cases.reservation.sandwiche_case.id.UtilisateurId;

public class ConfirmerReservation {

    private OeuvreRepository oeuvreRepository;
    private PaiementRepository paiementRepository;
    private ReservationValiderRepository reservationValiderRepository;
    
    public ConfirmerReservation(OeuvreRepository oeuvreRepository, PaiementRepository paiementRepository, ReservationValiderRepository reservationValiderRepository) {
        this.oeuvreRepository = oeuvreRepository;
        this.paiementRepository = paiementRepository;
        this.reservationValiderRepository = reservationValiderRepository;
    }

    public ReservationValider confirmerReservation(AwaitingReservation reservation) throws OeuvreNonDisponibleException, PaiementNonValideException {
        OeuvreId oeuvreId = reservation.getOeuvreId();
        UtilisateurId utilisateurId = reservation.getUtilisateurId();
        ReservationOeuvre oeuvre = oeuvreRepository.getOeuvreParId(oeuvreId);
        Prix priceUser = new Prix(50,"EUR");
        ReservationValider reservationValider = reservation.validerReservation(oeuvre, utilisateurId, priceUser);

        reservationValiderRepository.save(reservationValider);
        oeuvreRepository.setOeuvreNonDisponible(oeuvreId);
        return reservationValider;
    }

}
