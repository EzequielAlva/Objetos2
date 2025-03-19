package ar.edu.unlp.info.oo2.ejercicio_02_V2;

import java.util.List;

public class Papel extends Elemento {

    public Papel(boolean competitiveElement) {
        this.setName("papel");
        if(competitiveElement) {
            this.setElementosSuperiores(List.of(new Tijera(false), new Lagarto(false)));
            this.setElementosInferiores(List.of(new Piedra(false), new Spock(false)));
        }
    }

}
