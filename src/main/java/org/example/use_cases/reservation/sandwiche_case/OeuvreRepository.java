package org.example.use_cases.reservation.sandwiche_case;

import org.example.use_cases.reservation.sandwiche_case.domain.ReservationFilm;
import org.example.use_cases.reservation.sandwiche_case.domain.ReservationLivre;
import org.example.use_cases.reservation.sandwiche_case.domain.ReservationOeuvre;
import org.example.use_cases.reservation.sandwiche_case.id.OeuvreId;

public interface OeuvreRepository {

    ReservationOeuvre getOeuvreParId(OeuvreId oeuvreId);
    ReservationLivre getReservationLivreParId(OeuvreId oeuvreId);
    ReservationFilm getReservationFilmParId(OeuvreId oeuvreId);
    void setOeuvreNonDisponible(OeuvreId oeuvreId);
}
