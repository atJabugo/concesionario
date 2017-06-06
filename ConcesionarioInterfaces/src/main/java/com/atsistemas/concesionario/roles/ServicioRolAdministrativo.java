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
public interface ServicioRolAdministrativo {
	void cobrarFactura(Factura factura);
	void entregarPedido(Pedido pedido);
}
