package ar.edu.unlp.info.oo2.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private List<Componente> componentes;

    public Equipo() {
        componentes = new ArrayList<>();
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void agregarComponente(Componente componente) {
        if(componente != null)
            componentes.add(componente);
    }

    public void quitarComponente(Componente componente) {
        componentes.remove(componente);
    }

    // no se a que se refiere con "Crear Presupuesto" <-------------
    public double crearPresupuesto() {
        return componentes.stream().mapToDouble(Componente::getPrecio).sum();
    }

    public double calcularPrecio() {
        double total = componentes.stream().mapToDouble(Componente::getPrecio).sum();
        return total * 1.21;
    }

    public double calcularConsumo() {
        return componentes.stream().mapToDouble(Componente::getConsumo).sum();
    }
}
