package org.example;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private String name;
    private ItemState state;
    private LocalDateTime initialTime;
    private LocalDateTime finalTime;
    private List<String> comments;

    /**
     * Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
     */
    public ToDoItem(String name) {
        this.name = name;
    }

    public ToDoItem(String name, ItemState state) {
        this(name);
        this.state = state;
        this.comments = new ArrayList<>();
    }

    /**
     * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
     * pending. Si se encuentra en otro estado, no hace nada.
     */
    public void start() {
        this.state.start();
    }

    /**
     * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si
     su
     * estado es paused. Caso contrario (pending o finished) genera un error
     * informando la causa específica del mismo.
     */
    public void togglePause() {
        this.state.togglePause();
    }

    /**
     * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
     * in-progress o paused. Si se encuentra en otro estado, no hace nada.
     */
    public void finish() {
        this.state.finish();
    }

    /**
     * Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
     * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
     * haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
     * genera un error informando la causa específica del mismo.
     */
    public Duration workedTime() {
        return this.state.workedTime();
    }

    /**
     * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado.
     Caso
     * contrario no hace nada."
     */
    public void addComment(String comment) {
        this.state.addComment(comment);
    }

    public void changeState(ItemState state) {
        this.state = state;
        state.setToDoItem(this);
    }

    public LocalDateTime getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(LocalDateTime initialTime) {
        this.initialTime = initialTime;
    }

    public LocalDateTime getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(LocalDateTime finalTime) {
        this.finalTime = finalTime;
    }

    public List<String> getComments() {
        return comments;
    }

    public String getName() {
        return name;
    }
}
