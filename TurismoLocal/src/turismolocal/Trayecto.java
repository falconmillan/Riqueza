/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turismolocal;

import java.util.List;

/**
 *
 * @author jcfalcon
 */
public class Trayecto {
    
    private int id;
    private String nombre;
    private List<Monumento> puntosTuristicos;
    private List <Coordenadas> traza;
    private Tipo modalidad;
    private int Servicios;

    public Trayecto(int id, String nombre, List<Coordenadas> traza, Tipo modalidad, int Servicios) {
        this.id = id;
        this.nombre = nombre;
        this.traza = traza;
        this.modalidad = modalidad;
        this.Servicios = Servicios;
    }

    public Trayecto() {
        
    }
   
}
