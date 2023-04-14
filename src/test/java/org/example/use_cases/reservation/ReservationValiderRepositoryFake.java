package org.example.use_cases.reservation;

import org.example.use_cases.reservation.sandwiche_case.domain.ReservationValider;
import org.example.use_cases.reservation.sandwiche_case.ReservationValiderRepository;

public class ReservationValiderRepositoryFake implements ReservationValiderRepository {
    @Override
    public void save(ReservationValider reservationValider) {
        System.out.println("reservation valider et sauvgarder");
    }
}
