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
        String oeuvreId = reservation.getOeuvreId();
        String utilisateurId = reservation.getUtilisateurId();
        Oeuvre oeuvre = oeuvreRepository.getOeuvrParId(oeuvreId);
        Paiement paiement = paiementRepository.getPaiement(utilisateurId, reservation.getId());

        ReservationValider reservationValider = getReservationValider(reservation, oeuvreId, utilisateurId, oeuvre, paiement);

        reservationValiderRepository.save(reservationValider);
        oeuvreRepository.setOeuvreNonDisponible(oeuvreId);
        return reservationValider;
    }

    private static ReservationValider getReservationValider(AwaitingReservation reservation, String oeuvreId, String utilisateurId, Oeuvre oeuvre, Paiement paiement) throws OeuvreNonDisponibleException, PaiementNonValideException {
        if (!oeuvre.isDisponible()) {
            throw new OeuvreNonDisponibleException();
        }
        if (!paiement.isValide()) {
            throw new PaiementNonValideException();
        }

        ReservationValider reservationValider = new ReservationValider();
        reservationValider.setUtilisateurId(utilisateurId);
        reservationValider.setOeuvreId(oeuvreId);
        reservationValider.setDuree(reservation.getDuree());
        reservationValider.setPrix(paiement.getPrix());
        return reservationValider;
    }
}
