package ar.edu.unlp.info.oo2.ejercicio05;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String titulo;
    private int anioEstreno;
    private double puntaje;
    private List<Pelicula> pelisSimilares;

    public Pelicula(String titulo, int anioEstreno, double puntaje) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.puntaje = puntaje;
        this.pelisSimilares = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public List<Pelicula> getPelisSimilares() {
        return pelisSimilares;
    }

    public void agregarPeliSimilar(Pelicula pelicula) {
        pelisSimilares.add(pelicula);
    }
}
