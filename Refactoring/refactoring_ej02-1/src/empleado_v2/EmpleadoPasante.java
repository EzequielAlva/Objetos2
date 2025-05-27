package empleado_v2;

public class EmpleadoPasante {
    private String nombre;
    private String apellido;
    private double sueldoBasico;

    public EmpleadoPasante(String nombre, String apellido, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double sueldo() {
        return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }
}
