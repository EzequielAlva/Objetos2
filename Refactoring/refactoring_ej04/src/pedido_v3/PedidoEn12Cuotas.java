package pedido_v3;

import pedido.Cliente;

import java.util.List;

public class PedidoEn12Cuotas extends Pedido {
    public PedidoEn12Cuotas(Cliente cliente, List<Producto> productos) {
        super(cliente, productos);
    }
    @Override
    protected double calcularExtra() {
        return calcularCostoProductos() * 0.5;
    }
}
