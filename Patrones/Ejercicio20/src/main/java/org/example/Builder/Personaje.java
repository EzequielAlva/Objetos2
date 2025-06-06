package org.example.Builder;

import org.example.Armaduras.Armadura;
import org.example.Armas.Arma;
import org.example.Habilidades.Habilidad;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private String nombre;
    private Arma arma;
    private Armadura armadura;
    private List<Habilidad> habilidades;
    private int vida;

    public Personaje() {
        this.habilidades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Arma getArma() {
        return arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public void agregarHabilidad(Habilidad habilidad) {
        this.habilidades.add(habilidad);
    }

    public int calcularDanioDeAtaque(Armadura armaduraEnemiga) {
        return getArma().calcularDanio(armaduraEnemiga) +
                habilidades.stream()
                .filter(hab -> !hab.getNombre().equals("Curacion"))
                .mapToInt(hab -> hab.ejecutarHabilidad())
                .sum();
    }

    public int curar() {
        Habilidad curacion = habilidades.stream()
                .filter(elem -> elem.getNombre().equals("Curar"))
                .findFirst().get();
        return curacion.ejecutarHabilidad();
    }

    public boolean poseeCuracion() {
        return getHabilidades().stream().anyMatch(elem -> elem.getNombre().equals("Curacion"));
    }

    public String atacarPersonaje(Personaje defensor) {
        int vidaAtacante = this.getVida();
        int vidaDefensor = defensor.getVida();

        while(vidaAtacante > 0 && vidaDefensor > 0) {
            vidaDefensor -= (this.calcularDanioDeAtaque(defensor.getArmadura())
                    - resolverCuracion(defensor.poseeCuracion(), defensor));

            vidaAtacante -= (defensor.calcularDanioDeAtaque(this.getArmadura())
                    - resolverCuracion(this.poseeCuracion(), this));
        }

        return "Ganador el " + ((vidaAtacante > vidaDefensor)
                ? "atacante: " + this.getNombre()
                : "defensor: " + defensor.getNombre());
    }

    private int resolverCuracion(boolean puedeCurar, Personaje personaje) {
        if(puedeCurar)
            return personaje.curar();
        return 0;
    }
}
