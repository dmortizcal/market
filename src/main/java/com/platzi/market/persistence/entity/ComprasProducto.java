/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author mario
 */
@Entity
@Table(name = "compras_productos")
public class ComprasProducto implements Serializable {

    @EmbeddedId
    protected ComprasProductoPK id;
    @Column(name = "cantidad")
    private Long cantidad;
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "estado")
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    @MapsId("idCompra")
    private Compra compra;
    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    public ComprasProductoPK getId() {
        return id;
    }

    public void setId(ComprasProductoPK id) {
        this.id = id;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
