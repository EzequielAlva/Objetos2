package ar.edu.unlp.info.oo2.ejercicio12;

import java.time.LocalDate;
import java.util.List;

public class FileSystem {
    private Directorio directorio;

    public FileSystem(Directorio directorioInicial) {
        this.directorio = new Directorio("root", LocalDate.now());
        this.directorio.agregarContenido(directorioInicial);
    }
    /*
    * Retorna el espacio total ocupado, incluyendo si contenido
    */
    public int tamanoTotalOcupado() {
        return directorio.tamanoTotalOcupado();
    }

    /**
     * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
     * filesystem
     */
    public Archivo archivoMasGrande() {
        return directorio.archivoMasGrande();
    }

    /**
     * Retorna el archivo con fecha de creación más reciente en cualquier nivel
     * del filesystem
     */
    public Archivo archivoMasNuevo() {
        return directorio.archivoMasNuevo();
    }

    /**
     * Retorna el primer elemento con el nombre solicitado contenido en cualquier
     * nivel del filesystem
     */
    public Elemento buscar(String nombre) {
        return directorio.buscar(nombre);
    }

    /**
     * Retorna la lista con los elementos que coinciden con el nombre solicitado
     * contenido en cualquier nivel del filesystem
     */
    public List<Elemento> buscarTodos(String nombre) {
        return directorio.buscarTodos(nombre);
    }

    /**
     * Retorna un String con los nombres de los elementos contenidos en todos los
     * niveles del filesystem. De cada elemento debe retornar el path completo
     * (similar al comando pwd de linux) siguiendo el modelo presentado a
     * continuación
     /Directorio A
     /Directorio A/Directorio A.1
     /Directorio A/Directorio A.1/Directorio A.1.1
     /Directorio A/Directorio A.1/Directorio A.1.2
     /Directorio A/Directorio A.2
     /Directorio B
     */
    public String listadoDeContenido() {
        return directorio.listadoDeContenido();
    }
}
