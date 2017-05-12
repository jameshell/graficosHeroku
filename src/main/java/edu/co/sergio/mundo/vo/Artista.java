/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.vo;

/**
 *
 * @author james
 */
public class Artista extends Usuario {
    private String curriculum;
    private String distincion;
    
     public Artista (String user1, String nombre) {
        super(user1,nombre);
           curriculum="khe";
           distincion="khe";
     } 

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getDistincion() {
        return distincion;
    }

    public void setDistincion(String distincion) {
        this.distincion = distincion;
    }
    
    
}
