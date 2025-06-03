package supermercado_v4;

public class Direccion {
    private String localidad;
    private String calle;
    private String numero;
    private String departamento;

    public String getLocalidad() {
        return localidad;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String obtenerDireccionFormateada() {
        return this.localidad + ", " +
                this.calle + ", " +
                this.numero + ", " +
                this.departamento;
    }
}
