package pedido_v2;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public abstract class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    public Pedido(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
    }
    public double getCostoTotal() {
        double costoProductos = calcularCostoProductos();
        double extraFormaPago = calcularExtra();
        int añosDesdeFechaAlta = Period.between(this.cliente.getFechaAlta(),
                LocalDate.now()).getYears();
        // Aplicar descuento del 10% si el cliente tiene más de 5 años de antigüedad
        if(añosDesdeFechaAlta > 5) {
            return (costoProductos + extraFormaPago) * 0.9;
        }
        return costoProductos + extraFormaPago;
    }
    protected double calcularCostoProductos() {
        return productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
    }
    protected abstract double calcularExtra();
}
