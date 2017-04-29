/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riqueza;

import java.util.List;

/**
 *
 * @author jcfalcon
 */
public class Sujeto {
    int id;
    String nombre;
    int cartera;
    List <Grupo> grupos;
    List <Producto> venta;
    List <Producto> compra;
    static List <Producto> necesidades;
}
