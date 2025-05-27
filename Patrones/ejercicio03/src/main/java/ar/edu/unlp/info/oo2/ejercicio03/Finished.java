package ar.edu.unlp.info.oo2.ejercicio03;

import java.time.Duration;
import java.time.LocalDateTime;

public class Finished extends State{
    public Finished(ToDoItem toDoItem) {
        super(toDoItem);
    }

    @Override
    public void start() {
        throw new RuntimeException("Error: la tarea ya ha finalizado");
    }

    @Override
    public Duration workedTime() {
        return Duration.between(toDoItem.getStartingTime(), toDoItem.getFinishingTime());
    }

    @Override
    public void addComment(String comment) {

    }
}
