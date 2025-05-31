package org.example;

public class UpdateDateDecorator extends FileDecorator {

    public UpdateDateDecorator(FileComponent component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return getFileComponent().prettyPrint() + " - Update Date: " + getFechaModificacion().toString();
    }
}
