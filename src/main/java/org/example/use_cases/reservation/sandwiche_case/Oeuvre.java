package org.example.use_cases.reservation.sandwiche_case;

public class Oeuvre {

    private String titre;
    private String auteur;
    private String editeur;
    private Boolean isDisponible;

    public Oeuvre(String titre, String auteur, String editeur, Boolean isDisponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.isDisponible = isDisponible;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public Boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(Boolean disponible) {
        isDisponible = disponible;
    }
}
