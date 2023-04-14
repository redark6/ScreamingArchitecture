package org.example.use_cases.reservation;

import org.example.use_cases.reservation.sandwiche_case.*;
import org.example.use_cases.reservation.sandwiche_case.domain.Livre;
import org.example.use_cases.reservation.sandwiche_case.domain.ReservationFilm;
import org.example.use_cases.reservation.sandwiche_case.domain.ReservationLivre;
import org.example.use_cases.reservation.sandwiche_case.domain.ReservationOeuvre;
import org.example.use_cases.reservation.sandwiche_case.id.OeuvreId;

public class OeuvreRepositoryDisponible implements OeuvreRepository {


    @Override
    public ReservationOeuvre getOeuvreParId(OeuvreId oeuvreId) {
        return new ReservationLivre(
                oeuvreId,
                new Livre("La Joconde",
                        "Leonard de Vinci",
                        "MAPPA"),
                true
        );
    }

    @Override
    public ReservationLivre getReservationLivreParId(OeuvreId oeuvreId) {
        return null;
    }

    @Override
    public ReservationFilm getReservationFilmParId(OeuvreId oeuvreId) {
        return null;
    }

    @Override
    public void setOeuvreNonDisponible(OeuvreId oeuvreId) {
        System.out.println("Oeuvre plus disponible");
    }
}
