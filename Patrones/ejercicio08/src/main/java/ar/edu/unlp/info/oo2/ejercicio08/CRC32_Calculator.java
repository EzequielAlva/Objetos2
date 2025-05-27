package ar.edu.unlp.info.oo2.ejercicio08;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRCStrategy {
    public long crcFor(String datos) {
        CRC32 crc = new CRC32();
        //String datos = "un mensaje";
        crc.update(datos.getBytes());
        long result = crc.getValue();
        return result; // agregado
    }
}
