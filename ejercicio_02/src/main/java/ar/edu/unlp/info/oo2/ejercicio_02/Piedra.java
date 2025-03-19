package ar.edu.unlp.info.oo2.ejercicio_02;

public class Piedra extends Elemento {

    public Piedra(String name) {
        this.setName("piedra");
    }

    @Override
    public String combate(Elemento elemento) {
        if(elemento.getName().equals("tijera"))
            return "win";
        else if(elemento.getName().equals("papel"))
            return "lose";
        else
            return "draw";
    }
}
