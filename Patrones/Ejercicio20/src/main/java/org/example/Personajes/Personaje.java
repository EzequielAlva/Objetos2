package org.example.Personajes;

import org.example.Armaduras.Armadura;
import org.example.Armas.Arma;
import org.example.Habilidades.Habilidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Personaje {
    private String nombre;
    private Arma arma;
    private Armadura armadura;
    private List<Habilidad> habilidades;
    private int vida;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.habilidades = new ArrayList<>();
        this.vida = vida;
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
}
