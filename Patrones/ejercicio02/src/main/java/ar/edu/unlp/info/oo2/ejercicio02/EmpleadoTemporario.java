package ar.edu.unlp.info.oo2.ejercicio02;

public class EmpleadoTemporario extends EmpleadoNoPasante {
    private double horasTrabajadas;
    private final double VALOR_POR_HORA = 300;

    public EmpleadoTemporario(boolean estaCasado, int cantidadHijos ,double horasTrabajadas) {
        super(estaCasado, cantidadHijos);
        this.setSueldo(20000);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double sueldoBasico() {
        return super.sueldoBasico() + this.horasTrabajadas * VALOR_POR_HORA;
    }
}
