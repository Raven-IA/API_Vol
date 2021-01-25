package api.controllers;

import java.util.List;

import api.dao.DAOFlight;
//import api.dao.VolsBD;
import api.model.*;

public class FlightManager {

	//static VolsBD daovol = new VolsBD();
	static DAOFlight daoVol = new DAOFlight();

	public static List<Vol> getFlights() {
		List<Vol> lv = daoVol.findAll();		
		return lv;
	}
	
	public static Vol getFlight(String num) {
		Vol v = daoVol.find(num);		
		return v;
	}
}
