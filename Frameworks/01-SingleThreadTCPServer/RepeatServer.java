import java.io.PrintWriter;

public class RepeatServer extends SingleThreadTCPServer {

    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] parts = message.split("\\s+"); // dividir por espacio
        String delimiter = " "; // valor por defecto

        // Validación básica
        if (parts.length == 3) {
            delimiter = parts[2];
        } else if (parts.length != 2) {
            out.println("ERROR: Se esperaban 2 argumentos (string, cantidad) y un delimitador opcional.");
            return;
        }

        String text = parts[0].trim();
        String timesStr = parts[1].trim();

        // Validaciones de entrada
        if (text.isEmpty()) {
            out.println("ERROR: El string a repetir no puede estar vacío.");
            return;
        }

        int repetitions;
        try {
            repetitions = Integer.parseInt(timesStr);
            if (repetitions <= 0) {
                out.println("ERROR: La cantidad debe ser un entero mayor a 0.");
                return;
            }
        } catch (NumberFormatException e) {
            out.println("ERROR: El segundo argumento debe ser un número entero.");
            return;
        }

        // Generar el resultado repitiendo el string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repetitions; i++) {
            result.append(text);
            if (i < repetitions - 1) {
                result.append(delimiter);
            }
        }

        out.println(result.toString());
    }

    public static void main(String[] args) {
        new RepeatServer().startLoop(args);
    }
}

