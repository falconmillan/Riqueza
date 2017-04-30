/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turismolocal;

/**
 *
 * @author jcfalcon
 */
public class Monumento extends Coordenadas {
    private String lugar;
    private String poblacion;
    private String descripcion;

    public Monumento(double longitud, double latitud) {
        super(longitud, latitud);
    }

    public Monumento(String Lugar, String Poblacion, double longitud, double latitud, String descripcion) {
        super(longitud, latitud);
        this.lugar = Lugar;
        this.poblacion = Poblacion;
        this.descripcion=descripcion;
  
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
