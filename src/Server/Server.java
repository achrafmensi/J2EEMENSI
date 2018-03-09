
package Server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
public static void main(String[]args){
	try{
		System.out.println("une autre version");
		LocateRegistry.createRegistry(1098);
		//crer un onjet de type RMI
		compteimp obj = new compteimp();
		//binding sous le nom" hello serveur"
Naming.rebind("rmi://localhost:1098/HelloServer",obj);
System.out.println(obj.toString());
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}
