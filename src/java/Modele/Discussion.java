/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.Date;

/**
 *
 * @author Rabelais
 */
public class Discussion {
    private  int id,idmembre,idsujet;
    private  Date date;
    private  String heure,texte;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdmembre() {
        return idmembre;
    }

    public void setIdmembre(int idmembre) {
        this.idmembre = idmembre;
    }

    public int getIdsujet() {
        return idsujet;
    }

    public void setIdsujet(int idsujet) {
        this.idsujet = idsujet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public Discussion(int id, int idmembre, int idsujet, Date date, String heure, String texte) {
        this.id = id;
        this.idmembre = idmembre;
        this.idsujet = idsujet;
        this.date = date;
        this.heure = heure;
        this.texte = texte;
    }

    public Discussion() {
    }
    
}
