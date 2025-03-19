package ar.edu.unlp.info.oo2.ejercicio_02_V2;

import java.util.List;

public class Tijera extends Elemento {

    public Tijera(boolean competitiveElement) {
        this.setName("tijera");
        if(competitiveElement) {
            this.setElementosSuperiores(List.of(new Piedra(false), new Spock(false)));
            this.setElementosInferiores(List.of(new Papel(false), new Lagarto(false)));
        }
    }
}
