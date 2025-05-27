package ar.edu.unlp.info.oo2.ejercicio08;

public class Dispositivo {
        private CRCStrategy crcCalculator;
        private Connection connection;
        private Ringer ringer;
        private Display display;

        public Dispositivo(CRCStrategy crcCalculator, Connection connection, Ringer ringer, Display display) {
            this.crcCalculator = crcCalculator;
            this.connection = connection;
            this.ringer = ringer;
            this.display = display;
        }

        public void conectarCon(Connection connection) {
            this.connection = connection;
        }

        public void configurarCRC(CRCStrategy crcCalculator) {
            this.crcCalculator = crcCalculator;
        }

        public String send(String data) {
            long crc = this.crcCalculator.crcFor(data);
            return this.connection.sendData(data, crc);
        }
}
