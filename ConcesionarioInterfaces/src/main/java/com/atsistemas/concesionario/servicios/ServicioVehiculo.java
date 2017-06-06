/**
 * 
 */
package com.atsistemas.concesionario.servicios;

import org.springframework.stereotype.Service;

import com.atsistemas.concesionario.entidades.Vehiculo;

/**
 * @author jdelapena
 *
 */
@Service
public interface ServicioVehiculo {
	void insertarVehiculo(Vehiculo vehiculo);
	void eliminarVehiculo(Vehiculo vehiculo);
	void modificarVehiculo(Vehiculo vehiculo);
	void buscarVehiculo(Vehiculo vehiculo);
}
