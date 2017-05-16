/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turismolocal;

import java.util.ArrayList;
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
    private String modalidad;
    private int Servicios;

    public Trayecto(int id, String nombre, List<Coordenadas> traza, String modalidad, int Servicios) {
        this.id = id;
        this.nombre = nombre;
        this.traza = traza;
        this.modalidad = modalidad;
        this.Servicios = Servicios;
        this.puntosTuristicos= new ArrayList<>();
        this.traza= new ArrayList<>();
    }

    public Trayecto() {
        this.puntosTuristicos= new ArrayList<>();
        this.traza= new ArrayList<>();
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

    public List<Monumento> getPuntosTuristicos() {
        return puntosTuristicos;
    }

    public void setPuntosTuristicos(List<Monumento> puntosTuristicos) {
        this.puntosTuristicos = puntosTuristicos;
    }

    public List<Coordenadas> getTraza() {
        return traza;
    }

    public void setTraza(List<Coordenadas> traza) {
        this.traza = traza;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getServicios() {
        return Servicios;
    }

    public void setServicios(int Servicios) {
        this.Servicios = Servicios;
    }
   public double alturaMediaTraza(){
       double media=0.0;
       if(!this.traza.isEmpty()){
       for(Coordenadas c:this.traza){
           media=media+c.getAltitud();
       }
           media=media/this.traza.size();

       }
       return media;
   }
   
   public double alturaMediaPuntosTuristicos(){
       double media=0.0;
       if(!this.puntosTuristicos.isEmpty()){
       for(Monumento c:this.puntosTuristicos){
           media=media+c.getAltitud(); 
       }
       media=media/this.puntosTuristicos.size();
       }       
       return media;
   }
       
}
