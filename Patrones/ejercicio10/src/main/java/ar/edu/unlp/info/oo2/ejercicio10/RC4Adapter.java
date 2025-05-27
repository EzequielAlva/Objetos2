package ar.edu.unlp.info.oo2.ejercicio10;

public class RC4Adapter implements Encrypter {
    private RC4 rc4;
    private String clave;

    public RC4Adapter(String clave) {
        rc4 = new RC4();
        this.clave = clave;
    }


    @Override
    public String encode(String message) {
        return rc4.encriptar(message,clave);
    }

    @Override
    public String decode(String message) {
        return rc4.desencriptar(message,clave);
    }
}
