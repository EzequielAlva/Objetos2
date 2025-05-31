package org.example.Personajes;

public abstract class PersonajeBuilder {
    private Personaje personaje;

    public PersonajeBuilder() {

    }

    protected Personaje getPersonaje() {
        return personaje;
    }

    public void reset(String nombre, int vida) {
        this.personaje = new Personaje(nombre, vida);
    }

    public abstract void agregarArma();

    public abstract void agregarArmadura();

    public abstract void agregarHabilidad();

    public Personaje crearPersonaje(String nombre, int vida) {
        this.reset(nombre, vida);
        this.agregarArma();
        this.agregarArmadura();
        this.agregarHabilidad();
        return this.personaje;
    }
}
