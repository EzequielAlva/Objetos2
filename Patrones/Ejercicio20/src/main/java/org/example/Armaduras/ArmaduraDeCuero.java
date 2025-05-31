package org.example.Armaduras;

public class ArmaduraDeCuero extends Armadura {
    public ArmaduraDeCuero() {
        this.setNombre("Armadura de Cuero");
    }

    @Override
    public int contraEspada() {
        return 8;
    }

    @Override
    public int contraArco() {
        return 5;
    }

    @Override
    public int contraBaston() {
        return 2;
    }
}
