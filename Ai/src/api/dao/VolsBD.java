package api.dao;

import java.util.ArrayList;
import java.util.List;
import api.model.*;


public class VolsBD {
	  private static List<Vol> vols = new ArrayList<Vol>(); 
	  static { 
	    vols.add(new Vol("SXB123", "Strasbourg", "Paris", 1250)); 
	    vols.add(new Vol("SXB127", "Strasbourg", "Paris", 1420)); 
	    vols.add(new Vol("CDC129", "Poitiers", "Paris", 1710)); 
	  } 

	  public static List<Vol> getVols() { return vols; }
	  
	  public static Vol getVols(String idNumVol) {
          System.out.println(idNumVol);
          for (Vol i : vols)
          {

              if(i.getNumVol().equals(idNumVol)) {
                  System.out.println(i);
                  System.out.println(idNumVol);
                  System.out.println(i.getNumVol());
                  return i;

              }
          }

          return null; 
      }
	  public static List<Vol> searchVols(String departure, String arrival, String departureTime) {
			// TODO Auto-generated method stub
			ArrayList<Vol> search = new ArrayList<Vol>();
			Integer h;
			if (departureTime.equals("all")) {
				h = Integer.valueOf(departureTime);
			}
			else { h = -999;}
			for (Vol v : vols) {
				  if ((v.getVilleDepart().equals(departure)||departure.equals("all") )
						  &&(v.getVilleArrivee().equals(arrival)||arrival.equals("all"))
						  &&(v.getHeureDepart()==(h)||departureTime.equals("all"))
						  ) {
					  search.add(v);
				  }
				  
			  }
			return search;
	}
}