package org.example;

import java.time.LocalDateTime;

public class Paused extends ItemState {

    @Override
    public void togglePause() {
        this.getToDoItem().changeState(new InProgress());
    }

    @Override
    public void finish() {
        this.getToDoItem().changeState(new Finished());
        this.getToDoItem().setFinalTime(LocalDateTime.now());
    }
}
