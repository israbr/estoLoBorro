package com.java101.parking;

import java.util.ArrayList;
import java.util.Iterator;

public class BaseDeDatosDeCochesAparcados {

    private final ArrayList<Coche> antesTodoEstoEraCampo;

    public BaseDeDatosDeCochesAparcados() {
        antesTodoEstoEraCampo = new ArrayList<Coche>();
    }

    public void stock(final Coche coche) {
        antesTodoEstoEraCampo.add(coche);
    }

    public boolean hayCoche() {
        return !antesTodoEstoEraCampo.isEmpty();
    }

    public void destock(final Coche cocheQueQuiereSalir) {
        Iterator<Coche> it = antesTodoEstoEraCampo.iterator();
        while (it.hasNext()) {
            final Coche nextCoche = it.next();
            if (nextCoche.getMatricula().equals(cocheQueQuiereSalir.getMatricula())) {
                antesTodoEstoEraCampo.remove(nextCoche);
            }
        }
    }
}
