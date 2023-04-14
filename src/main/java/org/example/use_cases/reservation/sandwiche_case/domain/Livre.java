package org.example.use_cases.reservation.sandwiche_case.domain;

import java.util.Objects;

public final class Livre {

    private final String titre;
    private final String auteur;
    private final String editeur;

    public Livre(String titre, String auteur, String editeur) {
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return titre.equals(livre.titre) && auteur.equals(livre.auteur) && editeur.equals(livre.editeur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre, auteur, editeur);
    }
}
