
package Server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import Metier.CompteMetier;

public class Server {
public static void main(String[]args){
	try{
		System.out.println("une autre version");
		LocateRegistry.createRegistry(1099);
		//crer un onjet de type RMI
		CompteMetier obj = new CompteMetier();
		//binding sous le nom" Banque"
Naming.rebind("rmi://localhost:1099/Banque",obj);
System.out.println(obj.toString());
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}
