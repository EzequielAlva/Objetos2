package pedido_v4;

import java.util.List;

public class PedidoEnEfectivo extends Pedido {
    public PedidoEnEfectivo(Cliente cliente, List<Producto> productos) {
        super(cliente, productos);
    }
    @Override
    protected double calcularExtra() {
        return 0;
    }
}
