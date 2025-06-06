package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class ItemState {
    private ToDoItem toDoItem;

    public ItemState(ToDoItem toDoItem) {
        this.toDoItem = toDoItem;
    }

    protected ToDoItem getToDoItem() {
        return toDoItem;
    }

    public void start() {

    }

    public void togglePause() {
        throw new RuntimeException("Estado inválido para realizar esta tarea");
    }

    public void finish() {

    }

    public Duration workedTime() {
        return Duration.between(this.getToDoItem().getInitialTime(), LocalDateTime.now());
    }

    public void addComment(String comment) {
        this.getToDoItem().getComments().add(comment);
    }
}
