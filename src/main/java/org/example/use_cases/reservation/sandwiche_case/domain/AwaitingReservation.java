package org.example.use_cases.reservation.sandwiche_case.domain;

import org.example.use_cases.reservation.sandwiche_case.exception.OeuvreNonDisponibleException;
import org.example.use_cases.reservation.sandwiche_case.exception.PaiementNonValideException;
import org.example.use_cases.reservation.sandwiche_case.id.AwaitingReservationId;
import org.example.use_cases.reservation.sandwiche_case.id.OeuvreId;
import org.example.use_cases.reservation.sandwiche_case.id.PaiementId;
import org.example.use_cases.reservation.sandwiche_case.id.UtilisateurId;

import java.time.Instant;

public class AwaitingReservation {

    private AwaitingReservationId id;
    private UtilisateurId utilisateurId;
    private OeuvreId oeuvreId;
    private Creneau creneau;
    private Prix prix;


    public AwaitingReservation(AwaitingReservationId id, UtilisateurId utilisateurId, OeuvreId oeuvreId, Creneau creneau, Prix prix) {
        this.id = id;
        this.utilisateurId = utilisateurId;
        this.oeuvreId = oeuvreId;
        this.creneau = creneau;
        this.prix = prix;
    }

    public AwaitingReservationId getId() {
        return id;
    }

    public UtilisateurId getUtilisateurId() {
        return utilisateurId;
    }

    public OeuvreId getOeuvreId() {
        return oeuvreId;
    }

    public String getDuree() {
        return Instant.ofEpochMilli(this.creneau.getFin().getTime() - this.creneau.getDebut().getTime()).toString() + "min";
    }

    public Creneau getCrenau() {
        return creneau;
    }

    public ReservationValider validerReservation(ReservationOeuvre oeuvre, UtilisateurId utilisateurId, Prix priceUser) throws OeuvreNonDisponibleException, PaiementNonValideException {
        oeuvre.checkOeuvreDisponibilite();

        ReservationValider reservationValider = new ReservationValider();
        reservationValider.setUtilisateurId(utilisateurId);
        reservationValider.setOeuvreId(oeuvre.getId());
        reservationValider.setDuree(getDuree());
        reservationValider.setPrix(this.prix);

        Paiement paiement = new Paiement(new PaiementId("1"), priceUser);
        paiement.checkPaiement(this.prix);

        reservationValider.setPaiement(paiement);

        return reservationValider;
    }

}
