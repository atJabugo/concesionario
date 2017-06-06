/**
 * 
 */
package com.atsistemas.concesionario.persistencia;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.atsistemas.concesionario.entidades.Vehiculo;

/**
 * @author jdelapena
 *
 */
public interface VehiculoDAO extends CrudRepository<Vehiculo, Serializable> {

}
