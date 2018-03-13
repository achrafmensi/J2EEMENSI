package Metier;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Models.Compte;

public interface IcompteMetier extends Remote{

	public ArrayList<Compte> AfficherListe()throws RemoteException;
	public void ajouterCompte(Compte C)throws RemoteException;
	public void  RechercherParNumC(int solde) throws RemoteException;
	public ArrayList<Compte> AfficherParNumC(int cp)throws RemoteException;
	public void ModifierSoldeCompte(int solde,int Compte)throws RemoteException;
	public void ModifierCompte(Compte C)throws RemoteException;
	}
