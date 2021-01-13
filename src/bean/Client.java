/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author hp
 */
public class Client {

    private String id;
    private String nom;
    private String adresse;
    private String password;

    public Client(String id, String nom, String adresse, String password) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.password = password;
    }

    public Client() {
    }

    public Client(String id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", password=" + password + '}';
    }

    

}
