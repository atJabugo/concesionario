/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atsistemas.concesionario.persistencia.data;

import com.atsistemas.concesionario.entidades.EstadoFactura;
import com.atsistemas.concesionario.entidades.Pedido;
import com.atsistemas.concesionario.persistencia.PedidoDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author vchico
 */
public interface DataPedidoDAO extends PedidoDAO, JpaRepository<Pedido, Integer> {
    
    @Override
    @Query("select p.estado from Pedido p where p.id=:id")
    EstadoFactura findEstadoById(@Param("id") int id);
    
}
