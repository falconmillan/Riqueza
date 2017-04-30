/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turismolocal;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author jcfalcon
 */
public class TurismoLocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Aqui tengo un conjunto de trayectos compuestos por Monumentos y coordenadas
     List<Trayecto> trayectos=new ArrayList<>();
    
    

    //Fichero de texto en formato CSV
    try {
        File entrada= new File("C:\\Users\\jcfalcon\\Documents\\documentosJava\\RutasGPS.csv");        
        BufferedReader en= new BufferedReader(new FileReader(entrada));
        //Canal abierto, pierdo la primera linea
        en.readLine();
        String nombreTrayecto="";
        int n=0;
        Trayecto t;t=null;
        while(en.ready()){
            String cadena=en.readLine();
            //Teiene que estar dividido en siete partes
            String[] lista; lista=cadena.split(";");
            //Cada vez que Lista[0] cambia de valor.
            
            if(nombreTrayecto.compareTo(lista[0])!=0){
                //Cambiamos de                 
                if(t!=null)trayectos.add(t); //solo ocurre la primera vez
                nombreTrayecto=lista[0];
                t= new Trayecto(n,lista[0],null,"pedereste",0);
            }
                //O son coordenadas normales o monumento
                if(lista[1].length()==0){
                    //Coordenadas normales
                    Coordenadas c=new Coordenadas(Double.parseDouble(lista[2]),
                            Double.parseDouble(lista[3]),Double.parseDouble(lista[4]));
                boolean add = t.getTraza().add(c);
                }else{
                    //Monumento
                    Monumento m= new Monumento(lista[1],lista[5],Double.parseDouble(lista[2]),Double.parseDouble(lista[3]),
                            Double.parseDouble(lista[4]),lista[6]);
                    t.getPuntosTuristicos().add(m);                   
                }
            
            
            
        }
        
    } catch (FileNotFoundException ex) {
            Logger.getLogger(TurismoLocal.class.getName()).log(Level.SEVERE, null, ex);
    }   catch (IOException ex) {
            Logger.getLogger(TurismoLocal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
      
}
