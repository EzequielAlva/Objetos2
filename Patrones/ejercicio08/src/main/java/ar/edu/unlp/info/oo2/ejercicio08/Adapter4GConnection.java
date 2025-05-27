package ar.edu.unlp.info.oo2.ejercicio08;

public class Adapter4GConnection implements Connection {
    private Connection4G conn4G;

    public Adapter4GConnection() {
        conn4G = new Connection4G();
    }

    @Override
    public String sendData(String data, long crc) {
        return conn4G.transmit(data, crc);
    }

    @Override
    public String pict() {
        return conn4G.symb();
    }
}
