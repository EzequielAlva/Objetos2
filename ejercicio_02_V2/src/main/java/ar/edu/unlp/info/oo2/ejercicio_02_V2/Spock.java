package ar.edu.unlp.info.oo2.ejercicio_02_V2;

import java.util.List;

public class Spock extends Elemento{

    public Spock() {
        this.setName("Spock");
    }

    @Override
    public String contraPiedra() {
        return this.getName() + " gana";
    }

    @Override
    public String contraPapel() {
        return this.getName() + " pierde";
    }

    @Override
    public String contraTijera() {
        return this.getName() + " gana";
    }

    @Override
    public String combate(Elemento elemento) {
        return super.combate(elemento) + elemento.contraSpock();
    }

    @Override
    public String contraSpock() {
        return this.getName() + " empata";
    }

    @Override
    public String contraLagarto() {
        return this.getName() + " pierde";
    }
}
