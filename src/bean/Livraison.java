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
public class Livraison {
   private String id;
    private String date;
    private String idClient;
    private String descriptionMarchandise;
    private String idLivreur;
    private double kilometrage;
    private double montantBase;
    private double montantKilometrage;
    private double montantTotal;

    public Livraison() {
    }

    public Livraison(String id, String date, String idClient, String descreptionMarchandise, String idLivreur, double kilometrage, double montantBase, double montantKilometrage, double montantTotal) {
        this.id = id;
        this.date = date;
        this.idClient = idClient;
        this.descriptionMarchandise = descreptionMarchandise;
        this.idLivreur = idLivreur;
        this.kilometrage = kilometrage;
        this.montantBase = montantBase;
        this.montantKilometrage = montantKilometrage;
        this.montantTotal = montantTotal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getDescreptionMarchandise() {
        return descriptionMarchandise;
    }

    public void setDescreptionMarchandise(String descreptionMarchandise) {
        this.descriptionMarchandise = descreptionMarchandise;
    }

    public String getIdLivreur() {
        return idLivreur;
    }

    public void setIdLivreur(String idLivreur) {
        this.idLivreur = idLivreur;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public double getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(double montantBase) {
        this.montantBase = montantBase;
    }

    public double getMontantKilometrage() {
        return montantKilometrage;
    }

    public void setMontantKilometrage(double montantKilometrage) {
        this.montantKilometrage = montantKilometrage;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    @Override
    public String toString() {
        return "Livraison{" + "id=" + id + ", date=" + date + ", idClient=" + idClient + ", descriptionMarchandise=" + descriptionMarchandise + ", idLivreur=" + idLivreur + ", kilometrage=" + kilometrage + ", montantBase=" + montantBase + ", montantKilometrage=" + montantKilometrage + ", montantTotal=" + montantTotal + '}';
    }

}  
