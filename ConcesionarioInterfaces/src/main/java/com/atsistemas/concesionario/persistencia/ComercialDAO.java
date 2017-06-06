/**
 * 
 */
package com.atsistemas.concesionario.persistencia;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.atsistemas.concesionario.entidades.Comercial;

/**
 * @author jdelapena
 *
 */
public interface ComercialDAO extends CrudRepository<Comercial, Serializable> {
	
}
