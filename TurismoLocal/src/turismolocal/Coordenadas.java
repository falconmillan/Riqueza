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
public class Coordenadas {
    private double longitud;
    private double latitud;
    private double altitud;

    public Coordenadas(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
        this.altitud=0;
    }
 public Coordenadas(double longitud, double latitud, double altitud) {
        this.longitud = longitud;
        this.latitud = latitud;
        this.altitud=altitud;
    }
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }
    public double distancia(Coordenadas a){
        double r,x,y,z;        
        x=a.longitud-this.longitud; x=x*x;
        y=a.latitud-this.latitud; y=y*y;
        z=a.altitud-this.altitud; z=z*z;
        r=Math.sqrt(x+y+z);
        return r;
        
    }
    
}
