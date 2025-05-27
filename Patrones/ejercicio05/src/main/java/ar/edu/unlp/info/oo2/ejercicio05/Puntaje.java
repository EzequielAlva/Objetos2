package ar.edu.unlp.info.oo2.ejercicio05;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends Strategy{
    @Override
    public List<Pelicula> sugerirPeliculas(Decodificador deco) {
        List<Pelicula> listaPelis = ordenarPelisPorPuntaje(deco.obtenerPelisNoVistas());
        if(!listaPelis.isEmpty()) {
            listaPelis = super.primerasTresPelis(listaPelis);
            if(hayPelisDeMismoPuntaje(listaPelis)) {
                listaPelis = ordenarPelisPorPuntajeYAnio(listaPelis);
            }
        }
        return listaPelis;
    }

    private boolean hayPelisDeMismoPuntaje(List<Pelicula> listaPelis) {
        return listaPelis.stream()
                .map(Pelicula::getPuntaje)
                .distinct()
                .count() < 3;
    }

    private List<Pelicula> ordenarPelisPorPuntajeYAnio(List<Pelicula> listaPelis) {
        return listaPelis.stream()
                .sorted(Comparator.comparingDouble(Pelicula::getPuntaje)
                        .reversed()
                        .thenComparing(Comparator.comparingInt(Pelicula::getAnioEstreno)
                                .reversed()))
                .collect(Collectors.toList());
    }

    private List<Pelicula> ordenarPelisPorPuntaje(List<Pelicula> listaPelis) {
        return listaPelis.stream()
                .sorted((peli1, peli2) -> Double.compare(peli2.getPuntaje(), peli1.getPuntaje()))
                .collect(Collectors.toList());
    }
}
