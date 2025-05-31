package org.example.Armaduras;

public class ArmaduraDeHierro extends Armadura {
    public ArmaduraDeHierro() {
        this.setNombre("Armadura de Hierro");
    }

    @Override
    public int contraEspada() {
        return 5;
    }

    @Override
    public int contraArco() {
        return 3;
    }

    @Override
    public int contraBaston() {
        return 1;
    }
}
