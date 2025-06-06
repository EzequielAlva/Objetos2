package org.example;

import java.time.LocalDateTime;

public class Paused extends ItemState {
    public Paused(ToDoItem toDoItem) {
        super(toDoItem);
    }

    @Override
    public void togglePause() {
        this.getToDoItem().changeState(new InProgress(this.getToDoItem()));
    }

    @Override
    public void finish() {
        this.getToDoItem().changeState(new Finished(this.getToDoItem()));
        this.getToDoItem().setFinalTime(LocalDateTime.now());
    }
}
