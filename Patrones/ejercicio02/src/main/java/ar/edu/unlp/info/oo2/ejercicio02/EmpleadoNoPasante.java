package ar.edu.unlp.info.oo2.ejercicio02;

public abstract class EmpleadoNoPasante extends Empleado {
    private boolean estaCasado;
    private final double VALOR_POR_CASADO = 5000;
    private int cantidadHijos;
    private final double VALOR_POR_HIJO = 2000;

    public EmpleadoNoPasante(boolean estaCasado, int cantidadHijos) {
        this.estaCasado = estaCasado;
        this.cantidadHijos = cantidadHijos;
    }

    @Override
    public double adicional() {
        double totalPorHijos = this.cantidadHijos * VALOR_POR_HIJO;
        return (this.estaCasado)
                ? totalPorHijos + VALOR_POR_CASADO
                : totalPorHijos;
    }
}
