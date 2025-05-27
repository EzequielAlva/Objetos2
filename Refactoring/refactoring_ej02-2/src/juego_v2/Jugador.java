package juego_v2;

public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;
    public void incrementarPuntuacion() { puntuacion += 100; }
    public void decrementarPuntuacion(){ puntuacion -= 50; }
}
