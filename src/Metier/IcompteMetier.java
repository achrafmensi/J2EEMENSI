package Metier;

import java.rmi.Remote;
import java.util.ArrayList;

import Models.Compte;

public interface IcompteMetier extends Remote{

	public ArrayList<Compte> AfficherListe();
	public void ajouterCompte(Compte C);
	public void  RechercherParNumC(int solde);
	public ArrayList<Compte> AfficherParNumC(int cp);
	public void ModifierSoldeCompte(int solde,int Compte);
	public void ModifierCompte(Compte C);
	}
	


	
	


