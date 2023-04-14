package org.example.use_cases.reservation.sandwiche_case.domain;

import java.util.Objects;

public final class Prix {

    private final int prix;
    private final String devise;

    public Prix(int prix, String devise) {
        this.prix = prix;
        this.devise = devise;
    }

    public int getPrix() {
        return prix;
    }

    public String getDevise() {
        return devise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prix prix1 = (Prix) o;
        return prix == prix1.prix && devise.equals(prix1.devise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prix, devise);
    }
}
