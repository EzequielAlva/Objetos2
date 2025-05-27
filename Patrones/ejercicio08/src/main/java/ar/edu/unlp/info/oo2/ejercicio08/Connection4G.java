package ar.edu.unlp.info.oo2.ejercicio08;

public class Connection4G {
    private String symb;

    public Connection4G() {
        this.symb = "Simbolo-4G";
    }

    public String transmit(String data, long crc) {
        return "Conexión por 4G";
    }

    public String symb() {
        return symb;
    }
}
