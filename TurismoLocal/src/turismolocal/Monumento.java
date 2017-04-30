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
    private String Lugar;
    private String Poblacion;
    private String Descripcion;

    public Monumento(double longitud, double latitud) {
        super(longitud, latitud);
    }

    public Monumento(String Lugar, String Poblacion, double longitud, double latitud) {
        super(longitud, latitud);
        this.Lugar = Lugar;
        this.Poblacion = Poblacion;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String Poblacion) {
        this.Poblacion = Poblacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
