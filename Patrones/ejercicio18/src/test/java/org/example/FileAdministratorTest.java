package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileAdministratorTest {
    private FileAdministrator admin;
    private FileOO2 file;

    @BeforeEach
    void setUp() {
        file = new FileOO2("unTexto", ".txt", 23);
        admin = new FileAdministrator(file);
    }

    @Test
    public void getNameTest() {
        admin.printFileInOrder();
    }

    @Test
    public void addTamanioTest() {
        admin.addSize();
        admin.printFileInOrder();
    }

    @Test
    public void addExtensionTest() {
        admin.addExtension();
        admin.printFileInOrder();
    }

    @Test
    public void addFechaCreacionAndExtensionTest() {
        admin.addCreationDate();
        admin.addExtension();
        admin.printFileInOrder();
    }

    @Test
    public void addTamanioAndPermisosAndExtensionTest() {
        admin.addSize();
        admin.addPermission();
        admin.addExtension();
        admin.printFileInOrder();
    }
}
