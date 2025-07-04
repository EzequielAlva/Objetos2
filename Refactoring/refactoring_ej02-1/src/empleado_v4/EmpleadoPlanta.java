package empleado_v4;

public class EmpleadoPlanta extends Empleado {
    private int cantidadHijos;

    public EmpleadoPlanta(String nombre, String apellido, double sueldoBasico, int cantidadHijos) {
        super(nombre, apellido, sueldoBasico);
        this.cantidadHijos = cantidadHijos;
    }

    @Override
    public double sueldo() {
        return this.getSueldoBasico() - (this.getSueldoBasico() * 0.13) + bonoExtra();
    }

    @Override
    public double bonoExtra() {
        return this.cantidadHijos * 2000;
    }
}
