package empleado_v2;

public class EmpleadoPlanta {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private int cantidadHijos;

    public EmpleadoPlanta(String nombre, String apellido, double sueldoBasico, int cantidadHijos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cantidadHijos = cantidadHijos;
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

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public double sueldo() {
        return this.sueldoBasico
                + (this.cantidadHijos * 2000) - (this.sueldoBasico * 0.13);
    }
}
