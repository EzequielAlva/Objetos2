package ar.edu.unlp.info.oo2.ejercicio14;

public class Inmueble extends Prenda {
    private String direccion;
    private double superficie;
    private double costoM2;

    public Inmueble(String direccion, double superficie, double costoM2) {
        this.direccion = direccion;
        this.superficie = superficie;
        this.costoM2 = costoM2;
        setLiquidez(0.2);
    }

    @Override
    public double calculoValor() {
        return superficie * costoM2;
    }
}
