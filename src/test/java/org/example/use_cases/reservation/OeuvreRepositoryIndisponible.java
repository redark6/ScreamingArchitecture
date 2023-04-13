package org.example.use_cases.reservation;

import org.example.use_cases.reservation.sandwiche_case.Oeuvre;
import org.example.use_cases.reservation.sandwiche_case.OeuvreRepository;

public class OeuvreRepositoryIndisponible implements OeuvreRepository {
    @Override
    public Oeuvre getOeuvrParId(String oeuvreId) {
        return new Oeuvre(
                "La Joconde",
                "Leonard de Vinci",
                "France",
                false
        );
    }

    @Override
    public void setOeuvreNonDisponible(String oeuvreId) {
        System.out.println("Oeuvre plus disponible");
    }
}
