package empleado_v4;

public class EmpleadoPlanta extends Empleado {
    private int cantidadHijos;

    public EmpleadoPlanta(String nombre, String apellido, double sueldoBasico, int cantidadHijos) {
        super(nombre, apellido, sueldoBasico);
        this.cantidadHijos = cantidadHijos;
    }

    @Override
    public double bonoExtra() {
        return this.cantidadHijos * 2000;
    }
}
