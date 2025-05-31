package ar.edu.unlp.info.oo2.ejercicio_02_V2;

import java.util.List;

public class Lagarto extends Elemento{

    public Lagarto() {
        this.setName("Lagarto");
    }

    @Override
    public String contraPiedra() {
        return this.getName() + " pierde";
    }

    @Override
    public String contraPapel() {
        return this.getName() + " gana";
    }

    @Override
    public String contraTijera() {
        return this.getName() + " pierde";
    }

    @Override
    public String combate(Elemento elemento) {
        return super.combate(elemento) + elemento.contraLagarto();
    }

    @Override
    public String contraSpock() {
        return this.getName() + " gana";
    }

    @Override
    public String contraLagarto() {
        return this.getName() + " empata";
    }
}
