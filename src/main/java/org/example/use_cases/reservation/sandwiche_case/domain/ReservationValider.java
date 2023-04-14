package org.example.use_cases.reservation.sandwiche_case.domain;

import org.example.use_cases.reservation.sandwiche_case.id.OeuvreId;
import org.example.use_cases.reservation.sandwiche_case.id.UtilisateurId;

public class ReservationValider {

    private UtilisateurId utilisateurId;
    private OeuvreId oeuvreId;
    private String duree;
    private Prix prix;
    private Paiement paiement;

    public void setUtilisateurId(UtilisateurId utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public void setOeuvreId(OeuvreId oeuvreId) {
        this.oeuvreId = oeuvreId;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setPrix(Prix prix) {
        this.prix = prix;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }
}
