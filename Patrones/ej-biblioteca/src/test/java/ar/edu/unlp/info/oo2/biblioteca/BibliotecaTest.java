package ar.edu.unlp.info.oo2.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    private Biblioteca biblioteca;

    @BeforeEach
    void stup() {
        biblioteca = new Biblioteca();
    }

    @Test
    public void agregarSocioTest() {
        assertTrue(biblioteca.exportarSocios().length() == 2);

        biblioteca.agregarSocio(new Socio("Brian", "brian@gmail.com", "1234"));
        biblioteca.agregarSocio(new Socio("Joel", "joel@gmail.com", "4321"));

        assertTrue(biblioteca.exportarSocios().length() > 2);
        System.out.println(biblioteca.exportarSocios());
    }

    @Test
    public void exportarTest_JSONSimpleExporter() {
        biblioteca.agregarSocio(new Socio("Brian", "brian@gmail.com", "1234"));
        biblioteca.agregarSocio(new Socio("Joel", "joel@gmail.com", "4321"));
        biblioteca.setExporter(new JSONSimpleExporter());

        System.out.println(biblioteca.exportarSocios());
    }

    @Test
    public void exportarTest_JacksonExporter() {
        biblioteca.agregarSocio(new Socio("Brian", "brian@gmail.com", "1234"));
        biblioteca.agregarSocio(new Socio("Joel", "joel@gmail.com", "4321"));
        biblioteca.setExporter(new JacksonExporter());

        System.out.println(biblioteca.exportarSocios());
    }

}
