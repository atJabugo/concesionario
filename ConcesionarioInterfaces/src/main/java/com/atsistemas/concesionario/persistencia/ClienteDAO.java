/**
 * 
 */
package com.atsistemas.concesionario.persistencia;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.atsistemas.concesionario.entidades.Cliente;

/**
 * @author jdelapena
 *
 */
public interface ClienteDAO extends CrudRepository<Cliente, Serializable> {

}
