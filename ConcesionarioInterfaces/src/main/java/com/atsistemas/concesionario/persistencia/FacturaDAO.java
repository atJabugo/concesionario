/**
 * 
 */
package com.atsistemas.concesionario.persistencia;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.atsistemas.concesionario.entidades.Factura;

/**
 * @author jdelapena
 *
 */
public interface FacturaDAO extends CrudRepository<Factura, Serializable> {

}
