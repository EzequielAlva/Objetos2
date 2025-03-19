package ar.edu.unlp.info.oo2.ejercicio_02_V2;

import java.util.List;

public class Lagarto extends Elemento{

    public Lagarto(boolean competitiveElement) {
        this.setName("lagarto");
        if(competitiveElement) {
            this.setElementosSuperiores(List.of(new Tijera(false), new Piedra(false)));
            this.setElementosInferiores(List.of(new Papel(false), new Spock(false)));
        }
    }

}
