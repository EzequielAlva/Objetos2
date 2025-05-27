package juego_v3;

public class Jugador {
    private String nombre;
    private String apellido;
    private int puntuacion;

    public Jugador(String nombre, String apellido, int puntuacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntuacion = puntuacion;
    }

    // ...getters y setter necesarios

    public void incrementarPuntuacion() { puntuacion += 100; }
    public void decrementarPuntuacion(){ puntuacion -= 50; }
}
