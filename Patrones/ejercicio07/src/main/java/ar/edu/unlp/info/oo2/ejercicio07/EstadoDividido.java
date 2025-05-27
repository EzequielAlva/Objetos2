package ar.edu.unlp.info.oo2.ejercicio07;

public class EstadoDividido extends Estado{
    public EstadoDividido(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void setValor(double unValor) {
        if(unValor == 0)
            getCalculadora().setEstado(new EstadoError(getCalculadora()));
        else if(!getCalculadora().getResultado().equals("Error")) {
            double resultado = getCalculadora().getAcumulado() / unValor;
            getCalculadora().setAcumulado(resultado);
            volverAEstadoInicial();
        }
    }
}
