package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ToDoItemTest {
    private ToDoItem toDoItem1;
    private ToDoItem toDoItem2;

    @BeforeEach
    void setUp() {
        toDoItem1 = new ToDoItem("Hacer Comentario", new Pending());
        toDoItem2 = new ToDoItem("Hacer Comentario", new Finished());
    }

    @Test
    public void throughStatesTest() {
        // ToDoItem 1
        assertTrue(toDoItem1.getState() instanceof Pending);
        toDoItem1.start();
        assertTrue(toDoItem1.getState() instanceof InProgress);
        toDoItem1.togglePause();
        assertTrue(toDoItem1.getState() instanceof Paused);
        toDoItem1.togglePause();
        assertTrue(toDoItem1.getState() instanceof InProgress);

        // ToDoItem 2
        assertTrue(toDoItem2.getState() instanceof Finished);
        toDoItem2.start();
        assertTrue(toDoItem2.getState() instanceof Finished);
        RuntimeException exception = assertThrows(RuntimeException.class, () -> toDoItem2.togglePause());
        assertEquals("Estado inválido para realizar esta tarea", exception.getMessage());
    }
}
