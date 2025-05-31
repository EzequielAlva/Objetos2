package org.example;

public class SizeDecorator extends FileDecorator {

    public SizeDecorator(FileComponent component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return getFileComponent().prettyPrint() + " - Size: " + getTamanio();
    }
}
