package pedido_v4;

import java.util.List;

public abstract class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    public Pedido(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
    }
    protected Cliente getCliente() {
        return cliente;
    }
    protected List<Producto> getProductos() {
        return productos;
    }
    public double getCostoTotal() {
        return (calcularCostoProductos() + calcularExtra()) * calcularDescuentoSegunFechaAlta();
    }
    protected double calcularCostoProductos() {
        return this.getProductos().stream().mapToDouble(producto -> producto.getPrecio()).sum();
    }
    protected abstract double calcularExtra();

    protected double calcularDescuentoSegunFechaAlta() {
        // Aplicar descuento del 10% si el cliente tiene más de 5 años de antigüedad
        return (this.cliente.calcularAñosDesdeFechaAlta() > 5) ? 0.9 : 1;
    }
}
