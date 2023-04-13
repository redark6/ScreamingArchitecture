package org.example.use_cases.reservation.sandwiche_case;

public interface OeuvreRepository {
    Oeuvre getOeuvrParId(Id oeuvreId);
    void setOeuvreNonDisponible(Id oeuvreId);
}
