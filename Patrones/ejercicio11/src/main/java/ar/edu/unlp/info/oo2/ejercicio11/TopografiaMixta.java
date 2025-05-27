package ar.edu.unlp.info.oo2.ejercicio11;

import java.util.List;

public class TopografiaMixta extends Topografia {
    private List<Topografia> topografias;
    // SOLO 4 ELEMENTOS

    public TopografiaMixta(List<Topografia> topografias) {
        this.topografias = topografias;
    }

    @Override
    public double getProporcionAgua() {
        return this.topografias.stream().mapToDouble(Topografia::getProporcionAgua)
                .average().orElse(0);
    }

    @Override
    public double getProporcionTierra() {
        return 1 - getProporcionAgua();
    }

    public void agregarTopografia(Topografia topografia) {
        if(this.topografias.size() < 3)
            this.topografias.add(topografia);
    }

    @Override
    public List<Topografia> getTopografias() {
        return this.topografias;
    }

    public void setTopografias(List<Topografia> topografias) {
        this.topografias.addAll(topografias);
    }
}
