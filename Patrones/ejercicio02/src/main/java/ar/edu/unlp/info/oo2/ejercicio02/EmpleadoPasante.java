package ar.edu.unlp.info.oo2.ejercicio02;

public class EmpleadoPasante extends Empleado {
    private int cantidadExamenesRendidos;
    private final double VALOR_POR_EXAMEN_RENDIDO = 2000;

    public EmpleadoPasante(int cantidadExamenesRendidos) {
        this.setSueldo(20000);
        this.cantidadExamenesRendidos = cantidadExamenesRendidos;
    }

    @Override
    public double adicional() {
        return this.cantidadExamenesRendidos * VALOR_POR_EXAMEN_RENDIDO;
    }
}
