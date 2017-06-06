/**
 * 
 */
package com.atsistemas.concesionario.servicios;

import org.springframework.stereotype.Service;

import com.atsistemas.concesionario.entidades.Comercial;

/**
 * @author jdelapena
 *
 */
@Service
public interface ServicioComercial {
	void insertarComercial(Comercial comercial);
	void eliminarComercial(Comercial comercial);
	void modificarComercial(Comercial comercial);
	void buscarComercial(Comercial comercial);
}
