package ar.edu.unlp.info.oo2.ejercicio11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TopografiaTest {
    private Topografia t1;
    private Topografia t2;
    private Topografia t3;

    @BeforeEach
    void setup() {
        t1 = new TopografiaSimple(1);
        t2 = new TopografiaMixta(List.of(
                new TopografiaSimple(1),
                new TopografiaSimple(0),
                new TopografiaSimple(1),
                new TopografiaSimple(0)
        ));
        t3 = new TopografiaMixta(List.of(
                new TopografiaSimple(1),
                new TopografiaSimple(0),
                new TopografiaSimple(0),
                new TopografiaSimple(1)
        ));
    }

    @Test
    public void compararTopografiasSimplesTest() {
        assertTrue(t1.equals(new TopografiaSimple(1)));
        assertFalse(t1.equals(new TopografiaSimple(0)));
    }

    @Test
    public void compararTopografiasMixtasTest() {
        TopografiaMixta t4 = new TopografiaMixta(List.of(
                new TopografiaSimple(1),
                new TopografiaSimple(0),
                new TopografiaSimple(1),
                new TopografiaSimple(0)
        ));
        assertTrue(t2.equals(t4));
        assertFalse(t2.equals(t3));
    }

    @Test
    public void compararTopografiasMixtasMasMixtasQueNuncaTest() {
        TopografiaMixta t4 = new TopografiaMixta(List.of(
                new TopografiaSimple(1),
                new TopografiaSimple(0),
                new TopografiaSimple(1),
                t2
        ));
        TopografiaMixta t5 = new TopografiaMixta(List.of(
                new TopografiaSimple(1),
                new TopografiaSimple(0),
                new TopografiaSimple(1),
                t3
        ));
        TopografiaMixta t6 = new TopografiaMixta(List.of(
                new TopografiaSimple(1),
                new TopografiaSimple(0),
                new TopografiaSimple(1),
                t2
        ));
        assertTrue(t4.equals(t6));
        assertFalse(t4.equals(t5));
    }
}
