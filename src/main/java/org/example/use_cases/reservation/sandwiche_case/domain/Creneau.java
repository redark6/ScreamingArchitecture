package org.example.use_cases.reservation.sandwiche_case.domain;

import org.example.use_cases.reservation.sandwiche_case.exception.CreneauReservationException;

import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class Creneau {
    private final Date debut;
    private final Date fin;

    public Creneau(Date debut, Date fin) {
        checkCreneau(debut, fin);
        this.debut = debut;
        this.fin = fin;
    }

    public Date getDebut() {
        return this.debut;
    }

    public Date getFin() {
        return this.fin;
    }

    public void check(){
        checkCreneau(this.debut, this.fin);
    }

    public static void checkCreneau(Date debut, Date fin){
        if(debut.after(fin)) {
            throw new CreneauReservationException("La date de début doit être avant la date de fin");
        }

        if(!debut.after(Date.from(Instant.now()))) {
            throw new CreneauReservationException("La date de début doit être après la date actuelle");
        }

        if(debut.equals(fin)) {
            throw new CreneauReservationException("La date de début doit être différente de la date de fin");
        }

        if (fin.before(Date.from(Instant.now()))) {
            throw new CreneauReservationException("La date de fin doit être après la date actuelle");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creneau creneau = (Creneau) o;
        return debut.equals(creneau.debut) && fin.equals(creneau.fin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(debut, fin);
    }
}
