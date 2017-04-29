/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riqueza;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jcfalcon
 */
public class Sujeto {
    private int id;
    private String nombre;
    private int cartera;
    private List <Grupo> grupos;
    private List <Producto> venta;
    private List <Producto> compra;
    private static List <Producto> necesidades;

    public Sujeto(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCartera() {
        return cartera;
    }

    public void setCartera(int cartera) {
        this.cartera = cartera;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public List<Producto> getVenta() {
        return venta;
    }

    public void setVenta(List<Producto> venta) {
        this.venta = venta;
    }

    public List<Producto> getCompra() {
        return compra;
    }

    public void setCompra(List<Producto> compra) {
        this.compra = compra;
    }

    public static List<Producto> getNecesidades() {
        return necesidades;
    }

    public static void setNecesidades(List<Producto> necesidades) {
        Sujeto.necesidades = necesidades;
    }
    /**
     * Devuleve una lista con los grupos en los que coincide este sujeto
     * con otro a.
     *
     * @param a
     * @return Devuelve una lista de grupos que comparten.
     */
    public List<Grupo> esVecino(Sujeto a){
        List<Grupo> r = new ArrayList<>();
        
        Iterator <Grupo> cursor1= a.getGrupos().iterator();
        
        while(cursor1.hasNext()){
            Grupo g= (Grupo) cursor1.next();
            Iterator <Grupo> cursor2= this.getGrupos().iterator();
            while(cursor2.hasNext()){
                Grupo h=(Grupo) cursor2.next();
                if(h.getIdg()==g.getIdg())r.add(h);
            }  
        }
       return r;
    }
    public void produce(double x){
        //productos imperecederos Los colocamos en ventas
        Iterator<Producto> cursor= venta.iterator();
        for( Producto v : venta ){
            Producto p=(Producto) v;
            p.setCantidad(p.getCantidad()+ (int)(p.getMaxProd()*x));
        }
    }
}
