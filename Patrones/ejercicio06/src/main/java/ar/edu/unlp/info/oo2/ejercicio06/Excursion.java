package ar.edu.unlp.info.oo2.ejercicio06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
    private String nombre;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private String puntoEncuentro;
    private double costo;
    private int cupoMinimo;
    private int cupoMaximo;
    private List<Persona> listaInscriptos;
    private List<Persona> listaEspera;
    private InformacionState estado;

    public Excursion(String nombre, LocalDate fechaIni, LocalDate fechaFin, String puntoEncuentro, double costo, int cupoMinimo, int cupoMaximo) {
        this.nombre = nombre;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.puntoEncuentro = puntoEncuentro;
        this.costo = costo;
        this.cupoMinimo = cupoMinimo;
        this.cupoMaximo = cupoMaximo;
        listaInscriptos = new ArrayList<>();
        listaEspera = new ArrayList<>();
        estado = new InscripcionProvisoria(this);
    }

    public void setEstado(InformacionState estado) {
        this.estado = estado;
    }

    public void inscribir(Persona persona) {
        estado.inscribir(persona);
    }

    public void agregarAListaInscriptos(Persona persona) {
        listaInscriptos.add(persona);
    }

    public void agregarAListaEspera(Persona persona) {
        listaEspera.add(persona);
    }

    public String obtenerInformacion() {
        return estado.obtenerInformacion();
    }

    public String obtenerInformacionBasica() {
        return "nombre: " + nombre + "\n" +
                "costo: " + costo + "\n" +
                "fechas: " + fechaIni + " - " + fechaFin + "\n" +
                "punto de encuentro: " + puntoEncuentro + "\n";
    }

    public int obtenerCantidadDeUsuarioFaltantesParaMinimo() {
        return cupoMinimo - listaInscriptos.size();
    }

    public int obtenerCantidadDeUsuarioFaltantesParaMaximo() {
        return cupoMaximo - listaInscriptos.size();
    }

    public String mailsDeInscriptos() {
        return listaInscriptos.stream()
                .map(usuario -> usuario.getEmail())
                .reduce("", (acumulator, element) -> acumulator + "\n" + element);
    }
}
