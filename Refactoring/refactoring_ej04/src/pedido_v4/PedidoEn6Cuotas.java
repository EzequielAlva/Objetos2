package pedido_v4;

import java.util.List;

public class PedidoEn6Cuotas extends Pedido {
    public PedidoEn6Cuotas(Cliente cliente, List<Producto> productos) {
        super(cliente, productos);
    }
    @Override
    protected double calcularExtra() {
        return calcularCostoProductos() * 0.2;
    }
}
