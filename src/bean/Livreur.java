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
public class Livreur {
   private String nom;
    private String id;
    private String grade;
    private double montantBase;
    private double montantParKilometre;

    public Livreur() {
    }

    public Livreur(String nom, String id, String grade, double montantBase, double montantParKilometre) {
        this.nom = nom;
        this.id = id;
        this.grade = grade;
        this.montantBase = montantBase;
        this.montantParKilometre = montantParKilometre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(double montantBase) {
        this.montantBase = montantBase;
    }

    public double getMontantParKilometre() {
        return montantParKilometre;
    }

    public void setMontantParKilometre(double montantParKilometre) {
        this.montantParKilometre = montantParKilometre;
    }

    @Override
    public String toString() {
        return "Livreur{" + "nom=" + nom + ", id=" + id + ", grade=" + grade + ", montantBase=" + montantBase + ", montantParKilometre=" + montantParKilometre + '}';
      
}
}