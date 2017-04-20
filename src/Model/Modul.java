/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ALUMNEDAM
 */
public class Modul {
    private String id,nom;
    ArrayList<UnitatFormativa> llistatFormatius;

    public Modul(String id, String nom) {
        this.id = id;
        this.nom = nom;
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

    public ArrayList<UnitatFormativa> getLlistatFormatius() {
        return llistatFormatius;
    }

    public void setLlistatFormatius(ArrayList<UnitatFormativa> llistatFormatius) {
        this.llistatFormatius = llistatFormatius;
    }
    
}
