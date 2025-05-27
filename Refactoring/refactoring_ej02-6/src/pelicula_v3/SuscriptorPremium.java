package pelicula_v3;

public class SuscriptorPremium extends Usuario{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto() * 0.75;
    }
}
