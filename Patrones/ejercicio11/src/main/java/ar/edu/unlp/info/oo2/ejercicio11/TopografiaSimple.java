package ar.edu.unlp.info.oo2.ejercicio11;

import java.util.List;

public class TopografiaSimple extends Topografia {
    private double proporcionAgua;

    public TopografiaSimple(double proporcionAgua) {
        this.proporcionAgua = proporcionAgua;
    }

    public double getProporcionAgua() { return this.proporcionAgua; }
    public double getProporcionTierra() { return 1 - this.getProporcionAgua(); }
    public List<Topografia> getTopografias() {
        return List.of();
    }
}
