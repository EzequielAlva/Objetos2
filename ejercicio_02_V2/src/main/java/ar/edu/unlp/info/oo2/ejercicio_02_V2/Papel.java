package ar.edu.unlp.info.oo2.ejercicio_02_V2;

public class Papel extends Elemento {

    public Papel() {
        this.setName("Papel");
    }

    @Override
    public String contraPiedra() {
        return this.getName() + " gana";
    }

    @Override
    public String contraPapel() {
        return this.getName() + " empata";
    }

    @Override
    public String contraTijera() {
        return this.getName() + " pierde";
    }

    @Override
    public String combate(Elemento elemento) {
        return super.combate(elemento) + elemento.contraPapel();
    }

    @Override
    public String contraSpock() {
        return this.getName() + " gana";
    }

    @Override
    public String contraLagarto() {
        return this.getName() + " pierde";
    }
}
