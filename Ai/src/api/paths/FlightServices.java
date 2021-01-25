package api.paths;

//import java.util.ArrayList;
import java.util.List;

//import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
//import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

//import api.security.SigninNeeded;
import api.controllers.FlightManager;
//import api.dao.VolsBD;
import api.model.Vol;

@Path("/vols")
public class FlightServices {

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFlights() {
		List<Vol> lv = FlightManager.getFlights();
		//List<Vol> lv = VolsBD.getVols();

		if (lv != null) {
			//GenericEntity<List<Vol>> entity = new GenericEntity<List<Vol>>(lv) {};
			return Response.ok().entity(lv).build();
		}

		return Response.status(Status.NO_CONTENT).build();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFlight(@PathParam("id") String id) {
		Vol v = FlightManager.getFlight(id);
		// Vol v = VolsBD.getVols(id);
		if (v != null) {
			return Response.ok().entity(v).build();}

		return Response.status(Status.NO_CONTENT).build();
	}
	
	/*@GET
    @Path("/search")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getParamFlight(@DefaultValue("all") @QueryParam("departure") String departure, @DefaultValue("all") @QueryParam("arrival") String arrival, @DefaultValue("-1") @QueryParam("departureTime") int departureTime)
    {
        List<Vol> lv = VolsBD.getVols(departure,arrival,departureTime);
         if (lv != null) {
            return Response.ok().entity(lv).build();
        }
        return Response.status(Status.NO_CONTENT).build();
    }*/
}
