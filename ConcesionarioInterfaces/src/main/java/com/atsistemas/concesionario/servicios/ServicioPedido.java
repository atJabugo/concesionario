/**
 * 
 */
package com.atsistemas.concesionario.servicios;

import org.springframework.stereotype.Service;

import com.atsistemas.concesionario.entidades.Pedido;

/**
 * @author jdelapena
 *
 */
@Service
public interface ServicioPedido {
	void insertarPedido(Pedido pedido);
	void eliminarPedido(Pedido pedido);
	void modificarPedido(Pedido pedido);
	void buscarPedido(Pedido pedido);
}
