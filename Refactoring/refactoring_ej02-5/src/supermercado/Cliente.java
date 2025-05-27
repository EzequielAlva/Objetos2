package supermercado;

public class Cliente {
    public String getDireccionFormateada() {
        return
                this.direccion.getLocalidad() + ", " +
                this.direccion.getCalle() + ", " +
                this.direccion.getNumero() + ", " +
                this.direccion.getDepartamento()
        ;
    }
}
