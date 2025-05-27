package ar.edu.unlp.info.oo2.ejercicio05;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends Strategy{
    @Override
    public List<Pelicula> sugerirPeliculas(Decodificador deco) {
        List<Pelicula> listaPelis = deco.getPelisReproducidas().stream()
                .map(peli -> peli.getPelisSimilares())
                .flatMap(listaSimilares -> listaSimilares.stream())
                .collect(Collectors.toList());
        return super.primerasTresPelis(listaPelis);
    }
}
