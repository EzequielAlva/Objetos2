package ar.edu.unlp.info.oo2.ejercicio05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DecodificadorTest {
    private Decodificador deco;
    private Pelicula peli1;
    private Pelicula peli2;
    private Pelicula peli3;
    private Pelicula peli4;
    private Pelicula peli5;
    private Pelicula peli6;

    @BeforeEach
    void setup() {
        deco = new Decodificador();
        peli1 = new Pelicula("Thor", 2007, 7.9);
        peli2 = new Pelicula("Capitan America", 2016, 7.8);
        peli3 = new Pelicula("Iron man", 2010, 7.9);
        peli4 = new Pelicula("Dunkirk", 2017, 7.9);
        peli5 = new Pelicula("Rocky", 1976, 8.1);
        peli6 = new Pelicula("Rambo", 1979, 7.8);
        peli1.agregarPeliSimilar(peli2);
        peli1.agregarPeliSimilar(peli3);
        peli2.agregarPeliSimilar(peli1);
        peli2.agregarPeliSimilar(peli3);
        peli3.agregarPeliSimilar(peli1);
        peli3.agregarPeliSimilar(peli2);
        peli5.agregarPeliSimilar(peli6);
        peli6.agregarPeliSimilar(peli5);
        deco.agregarPelicula(peli1);
        deco.agregarPelicula(peli2);
        deco.agregarPelicula(peli3);
        deco.agregarPelicula(peli4);
        deco.agregarPelicula(peli5);
        deco.agregarPelicula(peli6);
        deco.verPelicula(peli1);
        deco.verPelicula(peli5);
    }

    @Test
    public void obtenerPeliculasSugeridas_NovedadTest() {
        List<Pelicula> pelisSimilares = deco.obtenerPeliculasSugeridas();
        assertEquals("Dunkirk", pelisSimilares.get(0).getTitulo());
        assertEquals("Capitan America", pelisSimilares.get(1).getTitulo());
        assertEquals("Iron man", pelisSimilares.get(2).getTitulo());
    }

    @Test
    public void obtenerPeliculasSugeridas_SimilaridadTest() {
        deco.setStrategy(new Similaridad());
        List<Pelicula> pelisSimilares = deco.obtenerPeliculasSugeridas();
        assertEquals("Capitan America", pelisSimilares.get(0).getTitulo());
        assertEquals("Iron man", pelisSimilares.get(1).getTitulo());
        assertEquals("Rambo", pelisSimilares.get(2).getTitulo());
    }

    @Test
    public void obtenerPeliculasSugeridas_PuntajeTest() {
        deco.setStrategy(new Puntaje());
        List<Pelicula> pelisSimilares = deco.obtenerPeliculasSugeridas();
        assertEquals("Dunkirk", pelisSimilares.get(0).getTitulo());
        assertEquals("Iron man", pelisSimilares.get(1).getTitulo());
        assertEquals("Capitan America", pelisSimilares.get(2).getTitulo());
    }
}
