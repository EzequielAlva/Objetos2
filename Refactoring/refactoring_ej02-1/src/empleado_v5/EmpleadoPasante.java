package empleado_v5;

public class EmpleadoPasante extends Empleado {
    public EmpleadoPasante(String nombre, String apellido, double sueldoBasico) {
        super(nombre, apellido, sueldoBasico);
    }

    @Override
    public double bonoExtra() { return 0; }
}
