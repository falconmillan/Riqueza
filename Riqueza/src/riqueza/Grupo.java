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
class Grupo {
    int idg;
    String NombreGrupo;
    List <Sujeto> vecinos;

    public int getIdg() {
        return idg;
    }

    public void setIdg(int idg) {
        this.idg = idg;
    }

    public String getNombreGrupo() {
        return NombreGrupo;
    }

    public void setNombreGrupo(String NombreGrupo) {
        this.NombreGrupo = NombreGrupo;
    }

    public List<Sujeto> getVecinos() {
        return vecinos;
    }

    public void setVecinos(List<Sujeto> vecinos) {
        this.vecinos = vecinos;
    }
    
}
