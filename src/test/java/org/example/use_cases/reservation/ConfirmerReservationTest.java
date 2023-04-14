package org.example.use_cases.reservation;

import org.example.use_cases.reservation.sandwiche_case.*;
import org.example.use_cases.reservation.sandwiche_case.domain.AwaitingReservation;
import org.example.use_cases.reservation.sandwiche_case.domain.Creneau;
import org.example.use_cases.reservation.sandwiche_case.domain.Prix;
import org.example.use_cases.reservation.sandwiche_case.exception.OeuvreNonDisponibleException;
import org.example.use_cases.reservation.sandwiche_case.exception.PaiementNonValideException;
import org.example.use_cases.reservation.sandwiche_case.id.AwaitingReservationId;
import org.example.use_cases.reservation.sandwiche_case.id.OeuvreId;
import org.example.use_cases.reservation.sandwiche_case.id.UtilisateurId;

import java.time.Instant;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ConfirmerReservationTest {

    @org.junit.jupiter.api.Test
    void confirmerReservation() throws OeuvreNonDisponibleException, PaiementNonValideException {
// Given
        OeuvreRepository oeuvreRepository = new OeuvreRepositoryDisponible();
        PaiementRepository paiementRepository = new PaiementRepositoryValid();
        ReservationValiderRepository reservationValiderRepository = new ReservationValiderRepositoryFake();
        Creneau creneau = new Creneau(Date.from(Instant.parse("2018-11-30T18:35:24.00Z")), Date.from(Instant.parse("2018-11-30T19:35:24.00Z")));

        ConfirmerReservation confirmerReservation = new ConfirmerReservation(oeuvreRepository, paiementRepository, reservationValiderRepository);
        // When
        confirmerReservation.confirmerReservation(new AwaitingReservation(new AwaitingReservationId("1"), new UtilisateurId("1"), new OeuvreId("1"), creneau, new Prix(50, "EUR")));
        // Then
        assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void confirmerReservationOeuvreNonDisponible() {
// Given
        OeuvreRepository oeuvreRepository = new OeuvreRepositoryIndisponible();
        PaiementRepository paiementRepository = new PaiementRepositoryValid();
        ReservationValiderRepository reservationValiderRepository = new ReservationValiderRepositoryFake();
        Creneau creneau = new Creneau(Date.from(Instant.parse("2018-11-30T18:35:24.00Z")), Date.from(Instant.parse("2018-11-30T19:35:24.00Z")));

        ConfirmerReservation confirmerReservation = new ConfirmerReservation(oeuvreRepository, paiementRepository, reservationValiderRepository);
        // When
        assertThrows(OeuvreNonDisponibleException.class, () -> confirmerReservation.confirmerReservation(new AwaitingReservation(new AwaitingReservationId("2"), new UtilisateurId("2"), new OeuvreId("2"), creneau, new Prix(50, "EUR"))));
        // Then
        assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void confirmerReservationPaiementNonValide() throws OeuvreNonDisponibleException, PaiementNonValideException {
// Given
        OeuvreRepository oeuvreRepository = new OeuvreRepositoryDisponible();
        PaiementRepository paiementRepository = new PaiementRepositoryInvalid();
        ReservationValiderRepository reservationValiderRepository = new ReservationValiderRepositoryFake();
        Creneau creneau = new Creneau(Date.from(Instant.parse("2018-11-30T18:35:24.00Z")), Date.from(Instant.parse("2018-11-30T19:35:24.00Z")));


        ConfirmerReservation confirmerReservation = new ConfirmerReservation(oeuvreRepository, paiementRepository, reservationValiderRepository);
        // When
        assertThrows(PaiementNonValideException.class, () -> confirmerReservation.confirmerReservation(new AwaitingReservation(new AwaitingReservationId("2"), new UtilisateurId("1"), new OeuvreId("1"), creneau, new Prix(10, "EUR"))));
        // Then
        assertTrue(true);
    }
}