package org.example.Builder;

public abstract class PersonajeBuilder {
    private Personaje personaje;

    public PersonajeBuilder() {
        this.personaje = new Personaje();
    }

    protected Personaje getPersonaje() {
        return personaje;
    }

    public void reset() {
        this.personaje = new Personaje();
    }

    public abstract void agregarArma();

    public abstract void agregarArmadura();

    public abstract void agregarHabilidad();

    public Personaje crearPersonaje(String nombre, int vida) {
        Personaje nuevoPersonaje = this.personaje;
        nuevoPersonaje.setNombre(nombre);
        nuevoPersonaje.setVida(vida);
        this.reset();
        return nuevoPersonaje;
    }
}
