package empleado_v3;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private double sueldoBasico;

    public Empleado(String nombre, String apellido, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    protected double getSueldoBasico() {
        return this.sueldoBasico;
    }

    public abstract double sueldo();
}
