package org.example.Armaduras;

public class ArmaduraDeAcero extends Armadura {
    public ArmaduraDeAcero() {
        this.setNombre("Armadura de Acero");
    }

    @Override
    public int contraEspada() {
        return 3;
    }

    @Override
    public int contraArco() {
        return 2;
    }

    @Override
    public int contraBaston() {
        return 1;
    }
}
