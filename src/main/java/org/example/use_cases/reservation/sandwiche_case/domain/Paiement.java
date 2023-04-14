package org.example.use_cases.reservation.sandwiche_case.domain;

import org.example.use_cases.reservation.sandwiche_case.exception.PaiementNonValideException;
import org.example.use_cases.reservation.sandwiche_case.id.PaiementId;

public class Paiement {

    private final PaiementId id;
    private Prix prix;

    public Paiement(PaiementId id, Prix prix) {
        this.id = id;
        //this.reservation = reservation;
        this.prix = prix;
    }

    public PaiementId getId() {
        return id;
    }

    public Prix getPrix() {
        return prix;
    }

    public void checkPaiement(Prix prix) throws PaiementNonValideException {
        if (!prix.equals(this.prix)) {
            throw new PaiementNonValideException();
        }
    }
}
