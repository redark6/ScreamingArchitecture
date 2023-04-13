package org.example.use_cases.reservation.sandwiche_case;

public class OeuvreRepository {

    public Oeuvre getOeuvrParId(String oeuvreId) {
        if (oeuvreId.equals("1")) {
            return new Oeuvre(
                    "La Joconde",
                    "Leonard de Vinci",
                    "France",
                    true
            );
        } else {
            return new Oeuvre(
                    "La Joconde",
                    "Leonard de Vinci",
                    "France",
                    false
            );
        }
    }


    public void setOeuvreNonDisponible(String oeuvreId) {
        System.out.println("Oeuvre plus disponible");
    }
}
