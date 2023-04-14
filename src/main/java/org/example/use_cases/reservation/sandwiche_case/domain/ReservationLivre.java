package org.example.use_cases.reservation.sandwiche_case.domain;

import org.example.use_cases.reservation.sandwiche_case.exception.OeuvreNonDisponibleException;
import org.example.use_cases.reservation.sandwiche_case.id.OeuvreId;

public class ReservationLivre implements ReservationOeuvre {

    private final OeuvreId id;

    private Livre livre;
    private Boolean isDisponible;

    public ReservationLivre(OeuvreId id, Livre livre, Boolean isDisponible) {
        this.id = id;
        this.livre = livre;
        this.isDisponible = isDisponible;
    }

    @Override
    public OeuvreId getId() {
        return id;
    }

    public Livre getLivre() {
        return this.livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(Boolean disponible) {
        isDisponible = disponible;
    }

    @Override
    public void checkOeuvreDisponibilite() throws OeuvreNonDisponibleException {
        if (!isDisponible()) {
            throw new OeuvreNonDisponibleException();
        }
    }
}
