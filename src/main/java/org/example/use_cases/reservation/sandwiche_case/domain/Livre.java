package org.example.use_cases.reservation.sandwiche_case.domain;

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
}
