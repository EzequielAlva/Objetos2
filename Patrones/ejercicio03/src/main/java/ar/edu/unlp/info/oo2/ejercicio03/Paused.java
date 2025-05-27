package ar.edu.unlp.info.oo2.ejercicio03;

import java.time.Duration;
import java.time.LocalDateTime;

public class Paused extends State{
    public Paused(ToDoItem toDoItem) {
        super(toDoItem);
    }

    @Override
    public void togglePause() {
        this.toDoItem.setState(new InProgress(toDoItem));
    }

    @Override
    public void finish() {
        toDoItem.setFinishingTime(LocalDateTime.now());
        this.toDoItem.setState(new Finished(toDoItem));
    }
}
