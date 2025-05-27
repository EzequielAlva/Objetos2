package ar.edu.unlp.info.oo2.ejercicio03;

import java.time.Duration;

public class Pending extends State{
    public Pending(ToDoItem toDoItem) {
        super(toDoItem);
    }

    @Override
    public void start() {
        this.toDoItem.setState(new InProgress(toDoItem));
    }

    @Override
    public void togglePause() {
        throw new RuntimeException("Error: la tarea aún no ha iniciado");
    }

    @Override
    public Duration workedTime() {
        throw new RuntimeException("Error: la tarea aún no ha iniciado");
    }
}
