package model;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class Livre {

	private String isbn;
	private String titre;
	private String auteur;
	private String anneeParution;
	private int nbPage;
	private double prix;
	
	public Livre() {
		
	}
	public Livre(String isbn, String titre, String auteur,String anneeParution, int nbPage, double prix) {
		
		this.isbn = isbn;
		this.titre = titre;
		this.auteur = auteur;
		this.anneeParution = anneeParution;
		this.nbPage = nbPage;
		this.prix = prix;
	}
	


	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getAnneeParution() {
		return anneeParution;
	}
	public void setAnneeParution(String anneeParution) {
		this.anneeParution = anneeParution;
	}
	public int getNbPage() {
		return nbPage;
	}
	public void setNbPage(int nbPage) {
		this.nbPage = nbPage;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Livre [isbn=" + isbn + ", titre=" + titre + ", auteur=" + auteur + ", anneeParution=" + anneeParution
				+ ", nbPage=" + nbPage + ", prix=" + prix + "]";
	}
	
	
}
