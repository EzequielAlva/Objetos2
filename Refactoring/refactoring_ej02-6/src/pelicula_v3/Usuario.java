package pelicula_v3;

import java.util.List;

public abstract class Usuario {
    // ...
    private List<Pelicula> peliculasCompradas;

    protected List<Pelicula> getPeliculasCompradas() {
        return peliculasCompradas;
    }

    public abstract double calcularCostoPelicula(Pelicula pelicula);
}
