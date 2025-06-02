package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.Loggers.MayusFormatter;
import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	public static final Logger logger = Logger.getLogger("MiLogger");

    private static FileHandler fileHandler;

	public static void main(String[] args) throws SecurityException, IOException {
		logger.setUseParentHandlers(false);

		ConsoleHandler console = new ConsoleHandler();
		console.setFormatter(new MayusFormatter()); // O el formatter que prefieras

		FileHandler fh = new FileHandler("mayus.txt");
		fh.setFormatter(new MayusFormatter());

		List<String> censuradas = Arrays.asList("switch-statements", "iniciada");
		Handler censor = new CensoringHandler(censuradas, console);

		logger.addHandler(censor);

		logger.addHandler(fh);
		logger.info(" // -- APLICACION INICIADA -- //");

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}

	private static void inicializarFileHandler() {
		try {
			fileHandler = new FileHandler("ArchivoDeLoggs.log");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
