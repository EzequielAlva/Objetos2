package ar.edu.unlp.info.oo2.ejercicio14;

import java.util.List;

public class PrendaCombinada extends Prenda {
    private List<Prenda> prendas;

    public PrendaCombinada() {
        setLiquidez(0.5);
    }

    public void agregarPrenda(Prenda prenda) {
        if(prenda != null)
            prendas.add(prenda);
    }

    @Override
    public double calculoValor() {
        return prendas.stream().mapToDouble(Prenda::calculoValor).sum();
    }
}
