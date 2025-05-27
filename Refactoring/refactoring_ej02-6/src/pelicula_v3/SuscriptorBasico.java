package pelicula_v3;

public class SuscriptorBasico extends Usuario {
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno();
    }
}
