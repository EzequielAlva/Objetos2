package supermercado_v4;

import java.text.MessageFormat;

public class Supermercado {
    public void notificarPedido(long nroPedido, Direccion direccion) {
        String notificacion = MessageFormat.format("Estimado cliente, se le informa " +
                "que hemos recibido su pedido con número {0}, el cual será enviado a la dirección " +
                "{1}", new Object[] { nroPedido, direccion.obtenerDireccionFormateada() });


        // lo imprimimos en pantalla, podría ser un mail, SMS, etc..
        System.out.println(notificacion);
    }
}
