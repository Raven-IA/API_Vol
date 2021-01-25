package api.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vol { 
	
	  @Id
	  private String numVol; 
	  private String villeDepart; 
	  private String villeArrivee; 
	  private int heureDepart; // Format : 1230 = 12h30 

	  public Vol() { } 

	  public Vol(String numVol, String villeDepart, String villeArrivee, int heureDepart) { 
	    this.numVol= numVol; 
	    this.villeDepart = villeDepart; 
	    this.villeArrivee = villeArrivee; 
	    this.heureDepart = heureDepart; 
 }

	public String getNumVol() {
		return numVol;
	}

	public void setNumVol(String numVol) {
		this.numVol = numVol;
	}

	public String getVilleDepart() {
		return villeDepart;
	}

	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}

	public String getVilleArrivee() {
		return villeArrivee;
	}

	public void setVilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;
	}

	public int getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(int heureDepart) {
		this.heureDepart = heureDepart;
	} 

}