package ar.edu.unlp.oo1.ejercicio1.Loggers;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class JSONFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        return String.format("{\"level\": \"%s\", \"message\": \"%s\"}%n",
                record.getLevel(), record.getMessage());
    }
}

