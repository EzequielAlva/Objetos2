package ar.edu.unlp.info.oo2.ejercicio_02_V2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Elemento {
    private String name;
    private List<Elemento> elementosSuperiores;
    private List<Elemento> elementosInferiores;

    public Elemento() {
        elementosSuperiores = new ArrayList<>();
        elementosInferiores = new ArrayList<>();
    }

    public String getName() { return this.name; }

    protected void setName(String name) { this.name = name; }

    public List<Elemento> getElementosSuperiores() {
        return elementosSuperiores;
    }

    public List<Elemento> getElementosInferiores() {
        return elementosInferiores;
    }

    protected void setElementosSuperiores(List<Elemento> elementosSuperiores) {
        this.elementosSuperiores = elementosSuperiores;
    }

    protected void setElementosInferiores(List<Elemento> elementosInferiores) {
        this.elementosInferiores = elementosInferiores;
    }

    public int combate(Elemento elemento) {
        if(this.getElementosInferiores().contains(elemento))
            return 1;
        else if(this.getElementosSuperiores().contains(elemento))
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Elemento)) return false;
        Elemento elemento = (Elemento) o;
        return Objects.equals(name, elemento.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
