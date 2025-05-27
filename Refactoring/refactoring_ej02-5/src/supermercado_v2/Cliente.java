package supermercado_v2;

public class Cliente {
    private Direccion direccion;
    public String getDireccionFormateada() {
        return
                this.direccion.getLocalidad() + ", " +
                this.direccion.getCalle() + ", " +
                this.direccion.getNumero() + ", " +
                this.direccion.getDepartamento()
        ;
    }
}
