package org.example.use_cases.reservation;

import org.example.use_cases.reservation.sandwiche_case.*;

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
        confirmerReservation.confirmerReservation(new AwaitingReservation(new Id("1"), new Id("1"), new Id("1"), creneau));
        // Then
        assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void confirmerReservationOeuvreNonDisponible() throws OeuvreNonDisponibleException, PaiementNonValideException {
// Given
        OeuvreRepository oeuvreRepository = new OeuvreRepositoryIndisponible();
        PaiementRepository paiementRepository = new PaiementRepositoryValid();
        ReservationValiderRepository reservationValiderRepository = new ReservationValiderRepositoryFake();
        Creneau creneau = new Creneau(Date.from(Instant.parse("2018-11-30T18:35:24.00Z")), Date.from(Instant.parse("2018-11-30T19:35:24.00Z")));

        ConfirmerReservation confirmerReservation = new ConfirmerReservation(oeuvreRepository, paiementRepository, reservationValiderRepository);
        // When
        assertThrows(OeuvreNonDisponibleException.class, () -> confirmerReservation.confirmerReservation(new AwaitingReservation(new Id("2"), new Id("2"), new Id("2"), creneau)));
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
        assertThrows(PaiementNonValideException.class, () -> confirmerReservation.confirmerReservation(new AwaitingReservation(new Id("2"), new Id("1"), new Id("1"), creneau)));
        // Then
        assertTrue(true);
    }
}