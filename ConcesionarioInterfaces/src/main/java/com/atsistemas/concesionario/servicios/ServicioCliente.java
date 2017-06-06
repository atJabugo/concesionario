/**
 * 
 */
package com.atsistemas.concesionario.servicios;

import org.springframework.stereotype.Service;

import com.atsistemas.concesionario.entidades.Cliente;

/**
 * @author jdelapena
 *
 */
@Service
public interface ServicioCliente {
	void insertarCliente(Cliente cliente);
	void eliminarCliente(Cliente cliente);
	void modificarCliente(Cliente cliente);
	void buscarCliente(Cliente cliente);
}
