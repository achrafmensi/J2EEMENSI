package Metier;
import java.sql.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import Models.Compte;

public class CompteMetier extends UnicastRemoteObject implements IcompteMetier{
private Connection con=null;
private PreparedStatement st=null;
private ResultSet rs=null;

public CompteMetier() throws RemoteException {
	super();
	con=(Connection)SingletonConnection.getConnection();
	}


@Override
public ArrayList<Compte> AfficherListe() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void ajouterCompte(Compte C) {
try {
st=(PreparedStatement) con.prepareStatement("insert into compte (numcp,typecp,soldecp) values(?,?,?)");	
st.setInt(1,C.getNumCp());
st.setString(2,C.getTypecp());
st.setInt(3,C.getSolde());
st.executeUpdate();
} catch (SQLException ex) {
	System.out.println(ex.getMessage());
} 

}

@Override
public void RechercherParNumC(int solde) throws RemoteException{
	// TODO Auto-generated method stub
	
}

@Override
public ArrayList<Compte> AfficherParNumC(int cp) throws RemoteException{
	// TODO Auto-generated method stub
	return null;
}

@Override
public void ModifierSoldeCompte(int solde, int Compte) throws RemoteException{
	// TODO Auto-generated method stub
	
}

@Override
public void ModifierCompte(Compte C) throws RemoteException{
	// TODO Auto-generated method stub
	}
}
