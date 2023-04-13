package org.example.use_cases.reservation;

import org.example.use_cases.reservation.sandwiche_case.*;

import static org.junit.jupiter.api.Assertions.*;

class ConfirmerReservationTest {

    @org.junit.jupiter.api.Test
    void confirmerReservation() throws OeuvreNonDisponibleException, PaiementNonValideException {
// Given
        OeuvreRepository oeuvreRepository = new OeuvreRepository();
        PaiementRepository paiementRepository = new PaiementRepository();
        ReservationValiderRepository reservationValiderRepository = new ReservationValiderRepository();


        ConfirmerReservation confirmerReservation = new ConfirmerReservation(oeuvreRepository, paiementRepository, reservationValiderRepository);
        // When
        confirmerReservation.confirmerReservation(new AwaitingReservation("1", "1", "1", "1"));
        // Then
        assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void confirmerReservationOeuvreNonDisponible() throws OeuvreNonDisponibleException, PaiementNonValideException {
// Given
        OeuvreRepository oeuvreRepository = new OeuvreRepository();
        PaiementRepository paiementRepository = new PaiementRepository();
        ReservationValiderRepository reservationValiderRepository = new ReservationValiderRepository();


        ConfirmerReservation confirmerReservation = new ConfirmerReservation(oeuvreRepository, paiementRepository, reservationValiderRepository);
        // When
        assertThrows(OeuvreNonDisponibleException.class, () -> confirmerReservation.confirmerReservation(new AwaitingReservation("2", "2", "2", "2")));
        // Then
        assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void confirmerReservationPaiementNonValide() throws OeuvreNonDisponibleException, PaiementNonValideException {
// Given
        OeuvreRepository oeuvreRepository = new OeuvreRepository();
        PaiementRepository paiementRepository = new PaiementRepository();
        ReservationValiderRepository reservationValiderRepository = new ReservationValiderRepository();


        ConfirmerReservation confirmerReservation = new ConfirmerReservation(oeuvreRepository, paiementRepository, reservationValiderRepository);
        // When
        assertThrows(PaiementNonValideException.class, () -> confirmerReservation.confirmerReservation(new AwaitingReservation("2", "1", "1", "3")));
        // Then
        assertTrue(true);
    }
}