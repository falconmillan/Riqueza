/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turismolocal;

import java.util.List;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

/**
 *
 * @author jcfalcon
 */
public class TurismoLocalNeoDatis {
    String ruta="C:\\Users\\jcfalcon\\Documents\\documentosJava\\";
    String base="TurimoLocal1.neodatis";
    public void init(List<Trayecto> trayectos){
        //Definimos la base de datos, que creamos tal y como vien arriba
        ODB odb= ODBFactory.open(ruta+base);
        //Cargo todos los elementos a la base de datos.
        //Recorro todos los trayectos y guardo primeramente los monumentos
        // y coordenadas que me vaya encontrando.
        for(Trayecto t:trayectos){
                //Monumetos
                //for(Monumento m : t.getPuntosTuristicos())odb.store(m);
                //y coordenadas peladas
                //for(Coordenadas c : t.getTraza())odb.store(c);
                //Para termnar grabando el propio elemento
                odb.store(t);
        }
        
        //cerramos la base
        odb.close();
    }
}