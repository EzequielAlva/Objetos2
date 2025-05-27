package ar.edu.unlp.info.oo2.ejercicio02;

public abstract class Empleado implements Sueldo {
    private double sueldo;

    public Empleado() {

    }

    protected void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() { return this.sueldo; } // hacer override para que retorne el mismo valor para todas las instancias

    @Override
    public double sueldoBasico() {
        return this.getSueldo();
    }

    @Override
    public double descuento() {
        return this.sueldoBasico() * 0.13 + this.adicional() * 0.05;
    }
}
