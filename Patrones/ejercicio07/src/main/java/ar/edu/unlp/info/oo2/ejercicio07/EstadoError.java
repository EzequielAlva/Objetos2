package ar.edu.unlp.info.oo2.ejercicio07;

public class EstadoError extends Estado{

    public EstadoError(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void setValor(double unValor) {

    }

    @Override
    public String getResultado() {
        return "Error";
    }

    @Override
    public void borrar() {
        getCalculadora().setAcumulado(0);
        getCalculadora().setEstado(new EstadoInicial(getCalculadora()));
    }

    @Override
    public void mas() {

    }

    @Override
    public void menos() {

    }

    @Override
    public void por() {

    }

    @Override
    public void dividido() {

    }
}
