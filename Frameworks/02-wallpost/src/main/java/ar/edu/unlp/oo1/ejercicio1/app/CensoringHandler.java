package ar.edu.unlp.oo1.ejercicio1.app;

import java.util.List;
import java.util.logging.*;
import java.util.regex.Pattern;

public class CensoringHandler extends Handler {
    private final List<String> forbiddenWords;
    private final Handler wrappedHandler;

    public CensoringHandler(List<String> forbiddenWords, Handler wrappedHandler) {
        this.forbiddenWords = forbiddenWords;
        this.wrappedHandler = wrappedHandler;
    }

    @Override
    public void publish(LogRecord record) {
        if (!isLoggable(record)) return;

        String originalMessage = record.getMessage();
        String censoredMessage = censor(originalMessage);

        // Creamos un nuevo LogRecord con el mensaje censurado
        LogRecord censoredRecord = new LogRecord(record.getLevel(), censoredMessage);
        censoredRecord.setLoggerName(record.getLoggerName());
        censoredRecord.setMillis(record.getMillis());
        censoredRecord.setSourceClassName(record.getSourceClassName());
        censoredRecord.setSourceMethodName(record.getSourceMethodName());
        censoredRecord.setThrown(record.getThrown());
        censoredRecord.setParameters(record.getParameters());

        wrappedHandler.publish(censoredRecord);
    }

    private String censor(String message) {
        for (String word : forbiddenWords) {
            message = message.replaceAll("(?i)\\b" + Pattern.quote(word) + "\\b", "***");
        }
        return message;
    }

    @Override
    public void flush() {
        wrappedHandler.flush();
    }

    @Override
    public void close() throws SecurityException {
        wrappedHandler.close();
    }
}

