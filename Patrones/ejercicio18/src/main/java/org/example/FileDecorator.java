package org.example;

import java.time.LocalDate;

public abstract class FileDecorator implements FileComponent {
    private FileComponent component;

    public FileDecorator(FileComponent component) {
        this.component = component;
    }

    @Override
    public String getNombre() {
        return this.component.getNombre();
    }

    @Override
    public String getExtension() {
        return this.component.getExtension();
    }

    @Override
    public double getTamanio() {
        return this.component.getTamanio();
    }

    @Override
    public LocalDate getFechaCreacion() {
        return this.component.getFechaCreacion();
    }

    @Override
    public LocalDate getFechaModificacion() {
        return this.component.getFechaModificacion();
    }

    @Override
    public String getPermisos() {
        return this.component.getPermisos();
    }

    protected FileComponent getFileComponent() {
        return this.component;
    }
}
