/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ALUMNEDAM
 */
public class Matricula {
    String id;
    Alumne alumne;
    Date data;
    ArrayList<UnitatFormativa> llistatFormatius;
    String modalitat;
    String descompte;

    public Matricula(String id, Alumne alumne, Date data, ArrayList<UnitatFormativa> llistatFormatius, String modalitat, String descompte) {
        this.id = id;
        this.alumne = alumne;
        this.data = data;
        this.llistatFormatius = llistatFormatius;
        this.modalitat = modalitat;
        this.descompte = descompte;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Alumne getAlumne() {
        return alumne;
    }

    public void setAlumne(Alumne alumne) {
        this.alumne = alumne;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<UnitatFormativa> getLlistatFormatius() {
        return llistatFormatius;
    }

    public void setLlistatFormatius(ArrayList<UnitatFormativa> llistatFormatius) {
        this.llistatFormatius = llistatFormatius;
    }

    public String getModalitat() {
        return modalitat;
    }

    public void setModalitat(String modalitat) {
        this.modalitat = modalitat;
    }

    public String getDescompte() {
        return descompte;
    }

    public void setDescompte(String descompte) {
        this.descompte = descompte;
    }
    
    
}
