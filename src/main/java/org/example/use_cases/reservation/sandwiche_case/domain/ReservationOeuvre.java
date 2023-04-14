package org.example.use_cases.reservation.sandwiche_case.domain;

import org.example.use_cases.reservation.sandwiche_case.exception.OeuvreNonDisponibleException;
import org.example.use_cases.reservation.sandwiche_case.id.OeuvreId;

public interface ReservationOeuvre {

    OeuvreId getId();
    void checkOeuvreDisponibilite() throws OeuvreNonDisponibleException;
}
