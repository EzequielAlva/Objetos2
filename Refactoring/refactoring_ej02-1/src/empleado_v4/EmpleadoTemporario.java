package empleado_v4;

public class EmpleadoTemporario extends Empleado {
    private double horasTrabajadas;
    private int cantidadHijos;

    public EmpleadoTemporario(String nombre, String apellido, double sueldoBasico, double horasTrabajadas,
                              int cantidadHijos) {
        super(nombre, apellido, sueldoBasico);
        this.horasTrabajadas = horasTrabajadas;
        this.cantidadHijos = cantidadHijos;
    }

    @Override
    public double sueldo() {
        return this.getSueldoBasico() - (this.getSueldoBasico() * 0.13) + bonoExtra();
    }

    @Override
    public double bonoExtra() {
        return (this.horasTrabajadas * 500)
                + (this.cantidadHijos * 1000);
    }
}
