package ar.edu.unlp.info.oo2.ejercicio10;

public class FeistelCipherAdapter implements Encrypter {
    private FeistelCipher feistelCipher;

    public FeistelCipherAdapter(String key) {
        feistelCipher = new FeistelCipher(key);
    }


    @Override
    public String encode(String message) {
        return feistelCipher.encode(message);
    }

    @Override
    public String decode(String message) {
        return feistelCipher.encode(message);
    }
}
