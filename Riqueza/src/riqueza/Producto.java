/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riqueza;

/**
 *
 * @author jcfalcon
 */
class Producto {
    
    private Tipo nombre;
    private int cantidad;
    private int precio;
    private int maxProd;

    public Tipo getNombre() {
        return nombre;
    }

    public void setNombre(Tipo nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getMaxProd() {
        return maxProd;
    }

    public void setMaxProd(int maxProd) {
        this.maxProd = maxProd;
    }
    
}
