package org.example.use_cases.reservation.sandwiche_case;

import java.time.Instant;
import java.util.Date;

public class AwaitingReservation {

    private Id id;
    private Id utilisateurId;
    private Oeuvre oeuvre;
    private Creneau creneau;


    public AwaitingReservation(Id id, Id utilisateurId, Id oeuvreId, Creneau creneau) {
        this.id = id;
        this.utilisateurId = utilisateurId;
        this.oeuvreId = oeuvreId;
        this.creneau = creneau;
    }

    public Id getId() {
        return id;
    }

    public Id getUtilisateurId() {
        return utilisateurId;
    }

    public Id getOeuvreId() {
        return oeuvreId;
    }

    public String getDuree() {
        return Instant.ofEpochMilli(this.creneau.getFin().getTime() - this.creneau.getDebut().getTime()).toString() + "min";
    }

    public Date getDateDebut() {
        return creneau.getDebut();
    }

    public Date getDateFin() {
        return creneau.getFin();
    }

    public Creneau getCrenau() {
        return creneau;
    }

    public ReservationValider getReservationValider(Id oeuvreId, Id utilisateurId, Oeuvre oeuvre, Paiement paiement) throws OeuvreNonDisponibleException, PaiementNonValideException {
        paiement.checkPaiement();
        oeuvre.checkOeuvreDisponibilite();
        // creneau.checkCreneau(); TODO a faire lors de la création du créneau et donc de la reservation

        ReservationValider reservationValider = new ReservationValider();
        reservationValider.setUtilisateurId(utilisateurId);
        reservationValider.setOeuvreId(oeuvreId);
        reservationValider.setDuree(getDuree());
        reservationValider.setPrix(paiement.getPrix());
        return reservationValider;
    }

}
