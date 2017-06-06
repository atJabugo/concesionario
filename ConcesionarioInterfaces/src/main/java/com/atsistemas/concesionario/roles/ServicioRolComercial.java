/**
 * 
 */
package com.atsistemas.concesionario.roles;

import com.atsistemas.concesionario.entidades.Factura;
import com.atsistemas.concesionario.entidades.Pedido;

/**
 * @author jdelapena
 *
 */
public interface ServicioRolComercial {
	void lanzarNuevoPedido(Pedido pedido);
	void seguiemientoPedido(Pedido pedido);
	void recepcionPedido(Pedido pedido);
	void generacionFactura(Factura factura);
}
