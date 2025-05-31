package org.example.Armas;

import org.example.Armaduras.Armadura;

public class Baston extends Arma {
    public Baston() {
        this.setNombre("Baston");
    }

    @Override
    public int calcularDanio(Armadura armaduraEnemiga) {
        return armaduraEnemiga.contraBaston();
    }
}
