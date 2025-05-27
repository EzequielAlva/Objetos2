package empleado_v3;

public class EmpleadoPlanta extends Empleado{
    public int cantidadHijos;

    public EmpleadoPlanta(String nombre, String apellido, double sueldoBasico, int cantidadHijos) {
        super(nombre, apellido, sueldoBasico);
        this.cantidadHijos = cantidadHijos;
    }

    @Override
    public double sueldo() {
        return this.getSueldoBasico()
                + (this.cantidadHijos * 2000) - (this.getSueldoBasico() * 0.13);
    }
}
