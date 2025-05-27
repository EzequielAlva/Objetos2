package ar.edu.unlp.info.oo2.ejercicio14;

public abstract class Prenda {
    private double liquidez;

    protected double getLiquidez() {
        return liquidez;
    }

    protected void setLiquidez(double liquidez) {
        this.liquidez = liquidez;
    }

    public abstract double calculoValor();

    public double valorPrendario() {
        return this.liquidez * this.calculoValor();
    }
}
