package carrito;

import java.util.List;

public class Carrito {
    private List<ItemCarrito> items;

    public double total() {
        return this.items.stream()
                .mapToDouble(item ->
                        item.getProducto().getPrecio() * item.getCantidad())
                .sum();
    }
}
