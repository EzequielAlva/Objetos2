package ar.edu.unlp.info.oo2.ejercicio_02;

public class Tijera extends Elemento {

    public Tijera(String name) {
        super(name);
    }

    @Override
    public String combate(Elemento elemento) {
        if(elemento.getName().equals("papel"))
            return "win";
        else if(elemento.getName().equals("piedra"))
            return "lose";
        else
            return "draw";
    }
}
