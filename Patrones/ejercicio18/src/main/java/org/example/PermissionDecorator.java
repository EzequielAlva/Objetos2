package org.example;

public class PermissionDecorator extends FileDecorator {

    public PermissionDecorator(FileComponent component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return getFileComponent().prettyPrint() + " - Permission: " + getPermisos();
    }
}
