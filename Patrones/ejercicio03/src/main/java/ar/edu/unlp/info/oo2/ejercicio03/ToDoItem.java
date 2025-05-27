package ar.edu.unlp.info.oo2.ejercicio03;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private String name;
    private List<String> comments;
    private State state;
    private LocalDateTime startingTime;
    private LocalDateTime finishingTime;

    public ToDoItem(String name) {
        this.name = name;
        comments = new ArrayList<>();
        state = new Pending(this);
    }

    public void setState(State state) { this.state = state; }

    public LocalDateTime getStartingTime() {
        return startingTime;
    }

    public LocalDateTime getFinishingTime() {
        return finishingTime;
    }

    public void setFinishingTime(LocalDateTime finishingTime) {
        this.finishingTime = finishingTime;
    }

    public List<String> getComments() {
        return this.comments;
    }

    /**
     * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
     * pending. Si se encuentra en otro estado, no hace nada.
     */
    public void start() {
        state.start();
        startingTime = LocalDateTime.now();
    }

    /**
     * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
     * estado es paused. Caso contrario (pending o finished) genera un error
     * informando la causa específica del mismo.
     */

    public void togglePause() {
        state.togglePause();
    }

    /**
     * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
     * in-progress o paused. Si se encuentra en otro estado, no hace nada.
     */
    public void finish() {
        state.finish();
    }

    /**
     * Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
     * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
     * haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
     * genera un error informando la causa específica del mismo.
     */
    public Duration workedTime() {
        return state.workedTime();
    }

    /**
     * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
     * contrario no hace nada."
     */
    public void addComment(String comment) {
        state.addComment(comment);
    }
}
