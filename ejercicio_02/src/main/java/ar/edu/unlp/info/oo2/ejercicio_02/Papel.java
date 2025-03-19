package ar.edu.unlp.info.oo2.ejercicio_02;

public class Papel extends Elemento {

    public Papel(String name) {
        super(name);
    }

    @Override
    public String combate(Elemento elemento) {
        if(elemento.getName().equals("piedra"))
            return "win";
        else if(elemento.getName().equals("tijera"))
            return "lose";
        else
            return "draw";
    }
}
