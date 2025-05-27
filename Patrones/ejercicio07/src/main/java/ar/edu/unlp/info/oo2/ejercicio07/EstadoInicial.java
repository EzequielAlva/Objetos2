package ar.edu.unlp.info.oo2.ejercicio07;

public class EstadoInicial extends Estado{
    public EstadoInicial(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void setValor(double unValor) {
        getCalculadora().setAcumulado(unValor);
    }

    @Override
    public String getResultado() {
        return super.getResultado();
    }

    @Override
    public void borrar() {
        getCalculadora().setAcumulado(0);
    }

    @Override
    public void mas() {
        getCalculadora().setEstado(new EstadoMas(getCalculadora()));
    }

    @Override
    public void menos() {
        getCalculadora().setEstado(new EstadoMenos(getCalculadora()));
    }

    @Override
    public void por() {
        getCalculadora().setEstado(new EstadoPor(getCalculadora()));
    }

    @Override
    public void dividido() {
        getCalculadora().setEstado(new EstadoDividido(getCalculadora()));
    }
}
