package ar.edu.unlp.info.oo2.ejercicio_02_V2;

import java.util.List;

public class Piedra extends Elemento {

    public Piedra(boolean competitiveElement) {
        this.setName("piedra");
        if(competitiveElement) {
            this.setElementosSuperiores(List.of(new Papel(false), new Spock(false)));
            this.setElementosInferiores(List.of(new Tijera(false), new Lagarto(false)));
        }
    }
}
