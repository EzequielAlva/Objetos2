package ar.edu.unlp.info.oo2.ejercicio07;

public class EstadoMenos extends Estado{
    public EstadoMenos(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void setValor(double unValor) {
        if(!getCalculadora().getResultado().equals("Error")) {
            double resultado = getCalculadora().getAcumulado() - unValor;
            getCalculadora().setAcumulado(resultado);
            volverAEstadoInicial();
        }
    }
}
