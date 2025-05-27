package ar.edu.unlp.info.oo2.ejercicio09;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private List<AutoEnAlquiler> autosEnAlquiler;

	public Usuario(String nombre) {
		this.nombre = nombre;
		autosEnAlquiler = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
