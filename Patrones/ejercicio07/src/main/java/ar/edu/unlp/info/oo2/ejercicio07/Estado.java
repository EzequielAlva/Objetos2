package ar.edu.unlp.info.oo2.ejercicio07;

public abstract class Estado {
    private Calculadora calculadora;

    public Estado(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    protected Calculadora getCalculadora() {
        return calculadora;
    }

    protected void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public abstract void setValor(double unValor);

    public String getResultado() {
        return String.valueOf(this.calculadora.getAcumulado());
    }

    public void borrar() {
        this.calculadora.setAcumulado(0);
        this.calculadora.setEstado(new EstadoInicial(this.calculadora));
    }

    public void mas() {
        this.calculadora.setEstado(new EstadoError(this.calculadora));
    }

    public void menos() {
        this.calculadora.setEstado(new EstadoError(this.calculadora));
    }

    public void por() {
        this.calculadora.setEstado(new EstadoError(this.calculadora));
    }

    public void dividido() {
        this.calculadora.setEstado(new EstadoError(this.calculadora));
    }

    protected void volverAEstadoInicial() {
        this.calculadora.setEstado(new EstadoInicial(this.calculadora));
    }
}
