package org.example;

public class ExtensionDecorator extends FileDecorator {

    public ExtensionDecorator(FileComponent component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return getFileComponent().prettyPrint() + " - Extension: " + getExtension();
    }
}
