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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.atsistemas.concesionario.entidades.utilidades.EstadosPedido;

/**
 * @author jdelapena
 *
 */
@Entity
@Table(name="PEDIDO", schema="CONCESIONARIO")
public class Pedido implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="ID_CLIENTE")
	private int idCliente;
	
	@ManyToOne
	@JoinColumn(name="ID_COMERCIAL")
	private Comercial comercial;
	
	@Column(name="ID_VEHICULO")
	private int idVehiculo;
	
	@Column(name="FECHA")
	private Date fecha;
	
	@Column(name="ESTADO")
	private EstadosPedido estado;
	
	@OneToOne(mappedBy="pedido")
	private Factura factura;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Cliente cliente;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public EstadosPedido getEstado() {
		return estado;
	}
	public void setEstado(EstadosPedido estado) {
		this.estado = estado;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Comercial getComercial() {
		return comercial;
	}
	public void setComercial(Comercial comercial) {
		this.comercial = comercial;
	}
}
