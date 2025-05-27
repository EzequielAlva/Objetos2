package ar.edu.unlp.info.oo2.ejercicio13;

public class Sandwitch {
    private Pan pan;
    private Aderezo aderezo;
    private Principal principal;
    private Adicional adicional;

    public Sandwitch() {

    }

    public Pan getPan() {
        return pan;
    }

    public void setPan(Pan pan) {
        this.pan = pan;
    }

    public Aderezo getAderezo() {
        return aderezo;
    }

    public void setAderezo(Aderezo aderezo) {
        this.aderezo = aderezo;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public Adicional getAdicional() {
        return adicional;
    }

    public void setAdicional(Adicional adicional) {
        this.adicional = adicional;
    }

    public double calcularPrecio() {
        if(pan == null || aderezo == null || principal == null || adicional == null)
            return 0;
        return pan.getPrecio() + aderezo.getPrecio() + principal.getPrecio() + adicional.getPrecio();
    }
}
