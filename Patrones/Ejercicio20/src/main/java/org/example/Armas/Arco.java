package org.example.Armas;

import org.example.Armaduras.Armadura;

public class Arco extends Arma {
    public Arco() {
        this.setNombre("Arco");
    }

    @Override
    public int calcularDanio(Armadura armaduraEnemiga) {
        return armaduraEnemiga.contraArco();
    }
}
