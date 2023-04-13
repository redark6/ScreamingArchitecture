package org.example.use_cases.reservation.sandwiche_case;

public interface OeuvreRepository {
    Oeuvre getOeuvrParId(String oeuvreId);
    void setOeuvreNonDisponible(String oeuvreId);
}
