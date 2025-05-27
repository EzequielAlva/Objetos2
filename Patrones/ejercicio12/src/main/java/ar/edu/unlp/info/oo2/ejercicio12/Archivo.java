package ar.edu.unlp.info.oo2.ejercicio12;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends Elemento {
    private int tamanio;

    public Archivo(String nombre, LocalDate fechaCreacion, int tamanio) {
        super(nombre, fechaCreacion);
        this.tamanio = tamanio;
    }

    @Override
    public int tamanoTotalOcupado() {
        return this.tamanio;
    }

    @Override
    public Archivo archivoMasGrande() {
        return this;
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this;
    }

    @Override
    public Elemento buscar(String nombre) {
        return (this.getNombre().equals(nombre)) ? this : null;
    }

    @Override
    public List<Elemento> buscarTodos(String nombre) {
        return (this.getNombre().equals(nombre)) ? List.of(this) : List.of();
    }

    @Override
    public String listadoDeContenido() {
        return "";
    }

    @Override
    public String listadoDeContenidoDesde(String path) {
        return "";
    }

}
