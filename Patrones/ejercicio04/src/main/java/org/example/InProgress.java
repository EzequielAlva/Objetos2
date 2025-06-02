package org.example;

import java.time.LocalDateTime;

public class InProgress extends ItemState {

    @Override
    public void togglePause() {
        this.getToDoItem().changeState(new Paused());
    }

    @Override
    public void finish() {
        this.getToDoItem().changeState(new Finished());
        this.getToDoItem().setFinalTime(LocalDateTime.now());
    }
}
