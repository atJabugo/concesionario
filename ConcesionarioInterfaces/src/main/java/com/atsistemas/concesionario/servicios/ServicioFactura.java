/**
 * 
 */
package com.atsistemas.concesionario.servicios;

import org.springframework.stereotype.Service;

import com.atsistemas.concesionario.entidades.Factura;

/**
 * @author jdelapena
 *
 */
@Service
public interface ServicioFactura {
	void insertarFactura(Factura factura);
	void eliminarFactura(Factura factura);
	void modificarFactura(Factura factura);
	void buscarFactura(Factura factura);
}
