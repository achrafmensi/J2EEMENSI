package Client;

import java.rmi.Naming;

import Server.icompte;

public class Client {
	public static void main(String[]args){
	icompte obj;
		String message;
		try{
			// obj de type hello
			obj=(icompte)Naming.lookup("rmi://localhost:1098/HelloServer");
			// msg de type string
	      
	      System.out.println(obj.lire());

		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
