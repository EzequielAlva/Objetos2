package org.example;

import java.time.LocalDateTime;

public class InProgress extends ItemState {
    public InProgress(ToDoItem toDoItem) {
        super(toDoItem);
    }

    @Override
    public void togglePause() {
        this.getToDoItem().changeState(new Paused(this.getToDoItem()));
    }

    @Override
    public void finish() {
        this.getToDoItem().changeState(new Finished(this.getToDoItem()));
        this.getToDoItem().setFinalTime(LocalDateTime.now());
    }
}
