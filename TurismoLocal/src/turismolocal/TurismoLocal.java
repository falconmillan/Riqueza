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
        // TODO code application logic here
    
    //Fichero de texto en formato CSV
    try {
        File entrada= new File("C:\\Users\\jcfalcon\\Documents\\documentosJava\\RutasGPS.csv");        
        BufferedReader en= new BufferedReader(new FileReader(entrada));
    } catch (FileNotFoundException ex) {
            Logger.getLogger(TurismoLocal.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }
      
}
