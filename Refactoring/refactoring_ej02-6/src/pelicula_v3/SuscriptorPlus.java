package pelicula_v3;

public class SuscriptorPlus extends Usuario{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto();
    }
}
