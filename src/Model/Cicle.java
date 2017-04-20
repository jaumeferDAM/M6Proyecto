/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ALUMNEDAM
 */
public class Cicle {

    public Cicle(String id, String nom, String grau) {
        this.id = id;
        this.nom = nom;
        this.grau = grau;
    }

    public Cicle() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }
    
    
    
    String id;
    String nom;
    String grau;
    
}