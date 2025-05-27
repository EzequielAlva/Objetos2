package ar.edu.unlp.info.oo2.ejercicio07;

public class EstadoPor extends Estado{
    public EstadoPor(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void setValor(double unValor) {
        if(!getCalculadora().getResultado().equals("Error")) {
            double resultado = getCalculadora().getAcumulado() * unValor;
            getCalculadora().setAcumulado(resultado);
            volverAEstadoInicial();
        }
    }
}
