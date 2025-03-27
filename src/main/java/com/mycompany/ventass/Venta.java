/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventass;

import java.util.Date;

/**
 *
 * @author junio
 */
public class Venta {
    private String fechaVenta;
    private int codigoVendedor;
    private int codigoProducto;
    private int cantidadVendida;
    private int formaPago;
    private int codigoVenta;

    public Venta(String fechaVenta, int codigoVendedor, int codigoProducto, int cantidadVendida, int formaPago, int codigoVenta) {
        this.fechaVenta = fechaVenta;
        this.codigoVendedor = codigoVendedor;
        this.codigoProducto = codigoProducto;
        this.cantidadVendida = cantidadVendida;
        this.formaPago = formaPago;
        this.codigoVenta = codigoVenta;
    }

    

   
    public double getPrecioFinal(double precioUnitario) { return precioUnitario* this.cantidadVendida; }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public int getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(int formaPago) {
        this.formaPago = formaPago;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    

}
