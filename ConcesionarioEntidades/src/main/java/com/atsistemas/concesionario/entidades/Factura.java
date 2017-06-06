/**
 * 
 */
package com.atsistemas.concesionario.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.atsistemas.concesionario.entidades.utilidades.EstadosFacturas;

/**
 * @author jdelapena
 *
 */
@Entity
@Table(name="FACTURA", schema="CONCESIONARIO")
public class Factura implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="FECHA")
	private Date fecha;
	
	@Column(name="TOTAL")
	private double total;
	
	@OneToOne
	@MapsId
	private Pedido pedido;
	
	@Column(name="ESTADO")
	private EstadosFacturas estado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public EstadosFacturas getEstado() {
		return estado;
	}
	public void setEstado(EstadosFacturas estado) {
		this.estado = estado;
	}
}
