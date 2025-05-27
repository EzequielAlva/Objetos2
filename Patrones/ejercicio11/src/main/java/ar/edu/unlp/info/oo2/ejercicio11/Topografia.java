package ar.edu.unlp.info.oo2.ejercicio11;

import java.util.List;

public abstract class Topografia {
    public abstract double getProporcionAgua();
    public abstract double getProporcionTierra();
    public abstract List<Topografia> getTopografias();

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj instanceof Topografia) {
            Topografia top = (Topografia) obj;
            if(this.getProporcionAgua() == top.getProporcionAgua()) {
                return this.getTopografias().equals(top.getTopografias());
            }
        }
        return false;
    }
}
