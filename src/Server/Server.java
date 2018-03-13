
package Server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import Metier.CompteMetier;
import Models.Compte;

public class Server {
public static void main(String[]args){
	try{
		System.out.println("une autre version");
		LocateRegistry.createRegistry(1099);
		//crer un onjet de type RMI
		CompteMetier obj = new CompteMetier();
		Compte cmp= new Compte(1,"courant",100);
		obj.ajouterCompte(cmp);
		//binding sous le nom" Banque"
Naming.rebind("rmi://localhost:1099/Banque",obj);
System.out.println(obj.toString());
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}
