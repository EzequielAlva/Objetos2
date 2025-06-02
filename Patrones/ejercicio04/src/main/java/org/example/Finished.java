package org.example;

import java.time.Duration;

public class Finished extends ItemState {

    @Override
    public Duration workedTime() {
        return Duration.between(this.getToDoItem().getInitialTime(), this.getToDoItem().getFinalTime());
    }

    @Override
    public void addComment(String comment) {

    }
}
