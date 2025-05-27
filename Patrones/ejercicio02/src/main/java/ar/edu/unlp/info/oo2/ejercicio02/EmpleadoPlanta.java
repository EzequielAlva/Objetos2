package ar.edu.unlp.info.oo2.ejercicio02;

public class EmpleadoPlanta extends EmpleadoNoPasante {
    private double antiguedad; // fechaIngreso
    private final double VALOR_POR_ANTIGUEDAD = 2000;

    public EmpleadoPlanta(boolean estaCasado, int cantidadHijos, double antiguedad) {
        super(estaCasado, cantidadHijos);
        this.setSueldo(50000);
        this.antiguedad = antiguedad; // esto se calcula segun la fecha actual
    }

    @Override
    public double adicional() {
        return super.adicional() + this.antiguedad * VALOR_POR_ANTIGUEDAD;
    }
}
