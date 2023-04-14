package org.example.use_cases.reservation.sandwiche_case.domain;

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
}
