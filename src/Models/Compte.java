package Models;
import java.io.Serializable;

public class Compte {
	private int numCp;
	private String Typecp; 
	private int solde;
	
	public Compte(int numCp, String typecp, int solde) {
		super();
		this.numCp = numCp;
		Typecp = typecp;
		this.solde = solde;
	}

	public int getNumCp() {
		return numCp;
	}

	public void setNumCp(int numCp) {
		this.numCp = numCp;
	}

	public String getTypecp() {
		return Typecp;
	}

	public void setTypecp(String typecp) {
		Typecp = typecp;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public Compte() {
		super();
	}
	
}
