package org.example.use_cases.reservation.sandwiche_case.domain;

import java.util.Objects;

public final class Film {
    private final String titre;
    private final String realisateur;
    private final Integer duree;

    public Film(String titre, String realisateur, Integer duree) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.duree = duree;
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public Integer getDuree() {
        return duree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return titre.equals(film.titre) && realisateur.equals(film.realisateur) && duree.equals(film.duree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre, realisateur, duree);
    }
}
