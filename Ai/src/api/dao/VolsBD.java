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
	  
	  public static List<Vol> getVols(String departure, String arrival, int departureTime) {

          List<Vol> search = new ArrayList<Vol>();
        try 
        {
            for (Vol v : vols) 
            {
                if ((v.getVilleDepart().equals(departure)||departure.equals("all"))&&(v.getVilleArrivee().equals(arrival)||arrival.equals("all"))&&((v.getHeureDepart()==departureTime)||departureTime==-1)) 

                {
                   search.add(v);
                }

            }
        }
        catch(NumberFormatException e) {}
        return search;
  }
	}
