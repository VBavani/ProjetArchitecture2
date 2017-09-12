package com.huios.mavenapps.monappligit2.metier;

public class Voiture {
	
	private int numVoiture;
	private String marque;
	private String modele;
	private Personne proprietaire;
	
	public int getNumVoiture() {
		return numVoiture;
	}
	public void setNumVoiture(int numVoiture) {
		this.numVoiture = numVoiture;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public Personne getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}
	@Override
	public String toString() {
		return "Voiture [numVoiture=" + numVoiture + ", marque=" + marque + ", modele=" + modele + ", proprietaire="
				+ proprietaire + "]";
	}
	

}
