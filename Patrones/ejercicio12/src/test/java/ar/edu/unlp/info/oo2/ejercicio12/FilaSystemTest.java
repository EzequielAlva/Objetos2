package ar.edu.unlp.info.oo2.ejercicio12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FilaSystemTest {
    private FileSystem fs;
    private Archivo a1;
    private Archivo a2;
    private Archivo a3;
    private Directorio d1;
    private Directorio d2;

    @BeforeEach
    void setUp() {
        List<Elemento> elementos;
        a1 = new Archivo("main", LocalDate.of(2024, 5, 12), 45);
        a2 = new Archivo("schedule", LocalDate.of(2024, 8, 3), 13);
        a3 = new Archivo("grammar", LocalDate.of(2025, 11, 22), 21);
        d1 = new Directorio("main", LocalDate.of(2025, 2, 13));
        d2 = new Directorio("otro", LocalDate.of(2024, 1, 3));
        d2.agregarContenido(a1);
        d2.agregarContenido(a2);
        d1.agregarContenido(a3);
        d1.agregarContenido(d2);
        fs = new FileSystem(d1);
        // FileSystem (32) -> d1(32) -> a3 (21)
        //                           -> d2(32) -> a1 (45)
        //                                     -> a2 (13)
    }

    @Test
    public void tamanoTotalOcupadoTest() {
        assertEquals(175, fs.tamanoTotalOcupado());
    }

    @Test
    public void archivoMasGrandeTest() {
        assertEquals(a1, fs.archivoMasGrande());
    }

    @Test
    public void archivoMasNuevoTest() {
        assertEquals(a3, fs.archivoMasNuevo());
    }

    @Test
    public void buscarTest() {
        assertEquals(d1, fs.buscar("main"));
    }

    @Test
    public void buscarTodosTest() {
        assertEquals(2, fs.buscarTodos("main").size());
    }

    @Test
    public void listadoDeContenidoTest() {
        System.out.println(fs.listadoDeContenido());
    }
}
