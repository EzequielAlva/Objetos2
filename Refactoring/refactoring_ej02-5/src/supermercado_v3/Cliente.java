package supermercado_v3;

public class Cliente {
    private Direccion direccion;
    public String getDireccionFormateada() {
        return this.direccion.obtenerDireccionFormateada();
    }
}
