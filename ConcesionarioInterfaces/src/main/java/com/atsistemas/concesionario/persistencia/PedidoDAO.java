/**
 * 
 */
package com.atsistemas.concesionario.persistencia;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.atsistemas.concesionario.entidades.Pedido;

/**
 * @author jdelapena
 *
 */
public interface PedidoDAO extends CrudRepository<Pedido, Serializable> {

}
