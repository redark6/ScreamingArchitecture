package org.example.use_cases.reservation;

import org.example.use_cases.reservation.sandwiche_case.Id;
import org.example.use_cases.reservation.sandwiche_case.Oeuvre;
import org.example.use_cases.reservation.sandwiche_case.OeuvreRepository;

public class OeuvreRepositoryIndisponible implements OeuvreRepository {
    @Override
    public Oeuvre getOeuvrParId(Id oeuvreId) {
        return new Oeuvre(
                new Id("1"),
                "La Joconde",
                "Leonard de Vinci",
                "France",
                false
        );
    }

    @Override
    public void setOeuvreNonDisponible(Id oeuvreId) {
        System.out.println("Oeuvre plus disponible");
    }
}
