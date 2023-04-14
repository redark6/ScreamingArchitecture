package org.example.use_cases.reservation.sandwiche_case.domain;

import org.example.use_cases.reservation.sandwiche_case.exception.OeuvreNonDisponibleException;
import org.example.use_cases.reservation.sandwiche_case.id.OeuvreId;

public class ReservationFilm implements ReservationOeuvre {
    private final OeuvreId id;

    private Film film;
    private Boolean isDisponible;

    public ReservationFilm(OeuvreId id, Film film, Boolean isDisponible) {
        this.id = id;
        this.film = film;
        this.isDisponible = isDisponible;
    }

    @Override
    public OeuvreId getId() {
        return id;
    }

    public Film getFilm() {
        return this.film;
    }

    public void setFilm(Film film) {
        this.film = film;
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
