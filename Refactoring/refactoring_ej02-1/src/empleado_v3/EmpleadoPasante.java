package empleado_v3;

public class EmpleadoPasante extends Empleado {
    public EmpleadoPasante(String nombre, String apellido, double sueldoBasico) {
        super(nombre, apellido, sueldoBasico);
    }

    @Override
    public double sueldo() {
        return this.getSueldoBasico() - (this.getSueldoBasico() * 0.13);
    }
}
