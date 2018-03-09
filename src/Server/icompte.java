	package Server;
	import java.rmi.Remote;
	import java.rmi.RemoteException;


	public interface icompte extends Remote {
	
		public void debiter(double m)throws RemoteException;
		public void crediter(double m)throws RemoteException;
		public double lire()throws RemoteException;}

