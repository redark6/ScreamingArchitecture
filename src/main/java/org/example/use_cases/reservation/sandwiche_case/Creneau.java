package org.example.use_cases.reservation.sandwiche_case;

import java.time.Instant;
import java.util.Date;

public class Creneau {
    private final Date debut;
    private final Date fin;

    public Creneau(Date debut, Date fin) {
        checkCreneau();
        this.debut = debut;
        this.fin = fin;
    }

    public Date getDebut() {
        return debut;
    }

    public Date getFin() {
        return fin;
    }

    void checkCreneau() {
        if(this.getDebut().after(this.getFin())) {
            throw new IllegalArgumentException("La date de début doit être avant la date de fin");
        }

        if(this.getDebut().after(Date.from(Instant.now()))) {
            throw new IllegalArgumentException("La date de début doit être après la date actuelle");
        }

        if(this.getDebut().equals(this.getFin())) {
            throw new IllegalArgumentException("La date de début doit être différente de la date de fin");
        }

        if (this.getFin().after(Date.from(Instant.now()))) {
            throw new IllegalArgumentException("La date de fin doit être après la date actuelle");
        }
    }
}
