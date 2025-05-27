package ar.edu.unlp.info.oo2.ejercicio07;

public class Calculadora {
    private double acumulado;
    private Estado estado;

    public Calculadora() {
        acumulado = 0;
        estado = new EstadoInicial(this);
    }

    public double getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(double acumulado) {
        this.acumulado = acumulado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getResultado() {
        return estado.getResultado();
    }

    public void borrar() {
        estado.borrar();
    }

    public void setValor(double unValor) {
        estado.setValor(unValor);
    }

    public void mas() {
        estado.mas();
    }

    public void menos() {
        estado.menos();
    }

    public void por() {
        estado.por();
    }

    public void dividido() {
        estado.dividido();
    }
}
