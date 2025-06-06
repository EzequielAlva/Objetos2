package ar.edu.unlp.info.oo2.ejercicio12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Directorio extends Elemento {
    private List<Elemento> contenido;

    public Directorio(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
        this.contenido = new ArrayList<>();
    }

    public void agregarContenido(Elemento elemento) {
        if(elemento != null)
            this.contenido.add(elemento);
    }

    public void quitarContenido(Elemento elemento) {
        if(elemento != null)
            this.contenido.remove(elemento);
    }

    @Override
    public int tamanoTotalOcupado() {
        return 32 + contenido.stream()
                .mapToInt(Elemento::tamanoTotalOcupado)
                .sum();
    }

    @Override
    public Archivo archivoMasGrande() {
        return contenido.stream()
                .map(Elemento::archivoMasGrande)
                .filter(Objects::nonNull)
                .max(Comparator.comparingInt(Archivo::tamanoTotalOcupado))
                .orElse(null);
    }

    @Override
    public Archivo archivoMasNuevo() {
        return contenido.stream()
                .map(Elemento::archivoMasNuevo)
                .filter(Objects::nonNull)
                .max(Comparator.comparing(Archivo::getFechaCreacion))
                .orElse(null);
    }

    @Override
    public Elemento buscar(String nombre) {
        if(this.getNombre().equals(nombre))
            return this;
        return contenido.stream()
                .map(elem -> elem.buscar(nombre))
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Elemento> buscarTodos(String nombre) {
        List<Elemento> encontrados = new ArrayList<>();
        if(this.getNombre().equals(nombre))
            encontrados.add(this);
        contenido.forEach(elem -> encontrados.addAll(elem.buscarTodos(nombre)));
        return encontrados;
    }

    @Override
    public String listadoDeContenido() {
        return this.listadoDeContenidoDesde("");
    }


    @Override
    public String listadoDeContenidoDesde(String path) {
        StringBuilder sb = new StringBuilder();
        String rutaActual = path + "/" + this.getNombre();
        sb.append(rutaActual).append("\n");

        for (Elemento elem : contenido) {
            sb.append(elem.listadoDeContenidoDesde(rutaActual));
        }

        return sb.toString();
    }

}
