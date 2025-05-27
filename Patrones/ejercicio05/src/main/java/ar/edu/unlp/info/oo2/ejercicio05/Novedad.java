package ar.edu.unlp.info.oo2.ejercicio05;

import java.util.List;

public class Novedad extends Strategy{
    @Override
    public List<Pelicula> sugerirPeliculas(Decodificador deco) {
        return super.primerasTresPelis(super.ordenarPeliculasPorNovedad(deco.obtenerPelisNoVistas()));
    }
}
