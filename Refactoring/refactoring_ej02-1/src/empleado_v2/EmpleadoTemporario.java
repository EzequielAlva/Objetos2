package empleado_v2;

public class EmpleadoTemporario {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double horasTrabajadas;
    private int cantidadHijos;

    public EmpleadoTemporario(String nombre, String apellido, double sueldoBasico, double horasTrabajadas,
                              int cantidadHijos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cantidadHijos = cantidadHijos;
        this.horasTrabajadas = horasTrabajadas;
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

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public double sueldo() {
        return this.sueldoBasico
                + (this.horasTrabajadas * 500)
                + (this.cantidadHijos * 1000)  - (this.sueldoBasico * 0.13);
    }
}
