package ar.edu.unlp.info.oo2.ejercicio12;

import java.time.LocalDate;
import java.util.List;

public abstract class Elemento {
    private String nombre;
    private LocalDate fechaCreacion;

    public Elemento(String nombre, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    protected String getNombre() {
        return nombre;
    }

    protected LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public abstract int tamanoTotalOcupado();

    public abstract Archivo archivoMasGrande();

    public abstract Archivo archivoMasNuevo();

    public abstract Elemento buscar(String nombre);

    public abstract List<Elemento> buscarTodos(String nombre);

    public abstract String listadoDeContenido();
    public abstract String listadoDeContenidoDesde(String path);

}
