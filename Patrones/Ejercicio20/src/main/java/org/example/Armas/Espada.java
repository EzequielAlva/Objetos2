package org.example.Armas;

import org.example.Armaduras.Armadura;

public class Espada extends Arma {
    public Espada() {
        this.setNombre("Espada");
    }

    @Override
    public int calcularDanio(Armadura armaduraEnemiga) {
        return armaduraEnemiga.contraEspada();
    }
}
