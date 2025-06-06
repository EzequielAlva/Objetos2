package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends ItemState {

    public Pending(ToDoItem toDoItem) {
        super(toDoItem);
    }

    @Override
    public void start() {
        this.getToDoItem().changeState(new InProgress(this.getToDoItem()));
        this.getToDoItem().setInitialTime(LocalDateTime.now());
    }

    @Override
    public Duration workedTime() {
        throw new RuntimeException("Aún no ha iniciado la tarea");
    }
}
