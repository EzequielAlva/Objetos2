package pedido;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private String formaPago;
    public Pedido(Cliente cliente, List<Producto> productos, String formaPago) {
        if(!"efectivo".equals(formaPago)
            && !"6 cuotas".equals(formaPago)
            && !"12 cuotas".equals(formaPago)) {
            throw new Error("Forma de pago incorrecta");
        }
        this.cliente = cliente;
        this.productos = productos;
        this.formaPago = formaPago;
    }
    public double getCostoTotal() {
        double costoProductos = 0;
        for (Producto producto : this.productos) {
            costoProductos += producto.getPrecio();
        }
        double extraFormaPago = 0;
        if("efectivo".equals(formaPago)) {
            extraFormaPago = 0;
        } else if ("6 cuotas".equals(formaPago)) {
            extraFormaPago = costoProductos * 0.2;
        } else if ("12 cuotas".equals(formaPago)) {
            extraFormaPago = costoProductos * 0.5;
        }
        int añosDesdeFechaAlta = Period.between(this.cliente.getFechaAlta(),
                LocalDate.now()).getYears();
        // Aplicar descuento del 10% si el cliente tiene más de 5 años de antigüedad
        if(añosDesdeFechaAlta > 5) {
            return (costoProductos + extraFormaPago) * 0.9;
        }
        return costoProductos + extraFormaPago;
    }
}
