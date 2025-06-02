import java.io.PrintWriter;
import java.util.Random;

public class PasswordServer extends SingleThreadTCPServer {

    private final Random random = new Random();

    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.split("\\s+"); // se asume que están separados por espacios

        if (args.length != 3) {
            out.println("ERROR: Debe enviar exactamente 3 argumentos: letras números especiales");
            return;
        }

        String letters = args[0];
        String digits = args[1];
        String specials = args[2];

        if (letters.isEmpty() || digits.isEmpty() || specials.isEmpty()) {
            out.println("ERROR: Ninguno de los argumentos puede estar vacío.");
            return;
        }

        String password = generatePassword(letters, digits, specials);
        out.println(password);
    }

    private String generatePassword(String letters, String digits, String specials) {
        StringBuilder password = new StringBuilder();

        // Garantizar al menos un número
        password.append(randomCharFrom(digits));

        // Garantizar un único carácter especial
        char specialChar = randomCharFrom(specials);

        // Rellenar con letras hasta completar 6 caracteres (8 - 1 dígito - 1 especial)
        for (int i = 0; i < 6; i++) {
            password.append(randomCharFrom(letters));
        }

        // Insertar el carácter especial en una posición aleatoria
        int specialIndex = random.nextInt(password.length() + 1);
        password.insert(specialIndex, specialChar);

        // Mezclar los caracteres para no mantener un orden fijo
        return shuffleString(password.toString());
    }

    private char randomCharFrom(String source) {
        return source.charAt(random.nextInt(source.length()));
    }

    private String shuffleString(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int j = random.nextInt(chars.length);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        new PasswordServer().startLoop(args);
    }
}
