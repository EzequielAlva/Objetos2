package ar.edu.unlp.info.oo2.ejercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {
    private List<Pelicula> grillaDePelis;
    private List<Pelicula> pelisReproducidas;
    private Strategy strategy;

    public Decodificador() {
        grillaDePelis = new ArrayList<>();
        pelisReproducidas = new ArrayList<>();
        strategy = new Novedad();
    }

    public Decodificador(Strategy strategy) {
        this();
        this.strategy = strategy;
    }

    public List<Pelicula> getGrillaDePelis() {
        return grillaDePelis;
    }

    public List<Pelicula> getPelisReproducidas() {
        return pelisReproducidas;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<Pelicula> obtenerPeliculasSugeridas() {
        return strategy.sugerirPeliculas(this);
    }

    public List<Pelicula> obtenerPelisNoVistas() {
        return grillaDePelis.stream()
                .filter(pelicula -> ! pelisReproducidas.contains(pelicula))
                .collect(Collectors.toList());
    }

    public void agregarPelicula(Pelicula pelicula) {
        grillaDePelis.add(pelicula);
    }

    public void verPelicula(Pelicula pelicula) {
        pelisReproducidas.add(pelicula);
    }
}
