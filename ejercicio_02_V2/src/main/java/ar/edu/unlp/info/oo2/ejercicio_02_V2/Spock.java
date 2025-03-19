package ar.edu.unlp.info.oo2.ejercicio_02_V2;

import java.util.List;

public class Spock extends Elemento{

    public Spock(boolean competitiveElement) {
        this.setName("spock");
        if(competitiveElement) {
            this.setElementosSuperiores(List.of(new Papel(false), new Lagarto(false)));
            this.setElementosInferiores(List.of(new Piedra(false), new Tijera(false)));
        }
    }
}
