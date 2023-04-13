package org.example.use_cases.reservation;

import org.example.use_cases.reservation.sandwiche_case.*;

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
        Id oeuvreId = reservation.getOeuvreId();
        Id utilisateurId = reservation.getUtilisateurId();
        Oeuvre oeuvre = oeuvreRepository.getOeuvrParId(oeuvreId);
        Paiement paiement = paiementRepository.getPaiement(utilisateurId, reservation.getId());

        ReservationValider reservationValider = reservation.getReservationValider(oeuvreId, utilisateurId, oeuvre, paiement);

        reservationValiderRepository.save(reservationValider);
        oeuvreRepository.setOeuvreNonDisponible(oeuvreId);
        return reservationValider;
    }

}
