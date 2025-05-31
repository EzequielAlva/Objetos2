package org.example;

public class CreationDateDecorator extends FileDecorator {

    public CreationDateDecorator(FileComponent component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return getFileComponent().prettyPrint() + " - Creation Date: " + getFechaCreacion().toString();
    }
}
