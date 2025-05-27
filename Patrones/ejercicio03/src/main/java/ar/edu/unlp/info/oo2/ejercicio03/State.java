package ar.edu.unlp.info.oo2.ejercicio03;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class State {
    protected ToDoItem toDoItem;

    public State(ToDoItem toDoItem) {
        this.toDoItem = toDoItem;
    }

    public void start() {

    }

    public void togglePause() {

    }

    public void finish() {

    }

    public Duration workedTime() {
        return Duration.between(toDoItem.getStartingTime(), LocalDateTime.now());
    }

    public void addComment(String comment) {
        toDoItem.getComments().add(comment);
    }
}
