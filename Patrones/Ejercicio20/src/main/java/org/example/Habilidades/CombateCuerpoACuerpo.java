package org.example.Habilidades;

public class CombateCuerpoACuerpo extends Habilidad {
    public CombateCuerpoACuerpo() {
        this.setNombre("Combate Cuerpo a Cuerpo");
    }

    @Override
    public int ejecutarHabilidad() {
        return 6;
    }
}
