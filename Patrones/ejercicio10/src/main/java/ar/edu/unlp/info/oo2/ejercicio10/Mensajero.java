package ar.edu.unlp.info.oo2.ejercicio10;

public class Mensajero {
    private Encrypter encrypter;

    public Mensajero(Encrypter encrypter) {
        this.encrypter = encrypter;
    }

    public void enviar(String mensaje) {
        encrypter.encode(mensaje);
    }

    public void recibir(String mensaje) {
        encrypter.decode(mensaje);
    }
}
