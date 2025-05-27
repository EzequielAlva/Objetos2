package ar.edu.unlp.info.oo2.ejercicio08;

public class WifiConn implements Connection {
    private String pict;

    public WifiConn() {
        this.pict = "Simbolo-Wifi";
    }

    public String sendData(String data, long crc) {
        return "Conexión por Wifi";
    }

    public String pict() { return pict; }
}
