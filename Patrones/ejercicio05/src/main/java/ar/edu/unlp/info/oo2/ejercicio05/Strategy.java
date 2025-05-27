package ar.edu.unlp.info.oo2.ejercicio05;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Strategy {
    public abstract List<Pelicula> sugerirPeliculas(Decodificador deco);

    protected List<Pelicula> ordenarPeliculasPorNovedad(List<Pelicula> listaPelis) {
        return listaPelis.stream()
                .sorted((peli1, peli2) -> Integer.compare(peli2.getAnioEstreno(), peli1.getAnioEstreno()))
                .collect(Collectors.toList());
    }

    protected List<Pelicula> primerasTresPelis(List<Pelicula> listaPelis) {
        return listaPelis.stream()
                .limit(3)
                .collect(Collectors.toList());
    }
}
