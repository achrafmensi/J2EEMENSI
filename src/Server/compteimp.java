package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class compteimp extends UnicastRemoteObject implements icompte {
	double solde=50;
public compteimp() throws RemoteException{super();}
public compteimp(double solde) throws RemoteException{
	this.solde=solde;
}


public void debiter( double m) throws RemoteException {

solde+=m;

}

public void crediter(double m) throws RemoteException {

solde-=m;
}

public double lire() throws RemoteException {
	return (solde);
}


}