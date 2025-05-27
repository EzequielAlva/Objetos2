package empleado_v3;

public class EmpleadoTemporario extends Empleado{
    public double horasTrabajadas;
    public int cantidadHijos;

    public EmpleadoTemporario(String nombre, String apellido, double sueldoBasico, double horasTrabajadas,
                              int cantidadHijos) {
        super(nombre, apellido, sueldoBasico);
        this.horasTrabajadas = horasTrabajadas;
        this.cantidadHijos = cantidadHijos;
    }

    @Override
    public double sueldo() {
        return this.getSueldoBasico()
                + (this.horasTrabajadas * 500)
                + (this.cantidadHijos * 1000)  - (this.getSueldoBasico() * 0.13);
    }
}
