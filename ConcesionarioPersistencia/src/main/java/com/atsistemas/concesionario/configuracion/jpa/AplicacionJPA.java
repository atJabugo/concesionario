/**
 * 
 */
package com.atsistemas.concesionario.configuracion.jpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jdelapena
 *
 */
public class AplicacionJPA {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.atsistemas.concesionario.configuracion.jpa");
		context.close();
	}
}
