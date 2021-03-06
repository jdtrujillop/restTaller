package example.microservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="colpatria")
public class Colpatria {
	private List<Placa> listPlaca;
	public Colpatria(){
		listPlaca = new ArrayList<>();
	    listPlaca.add(new Placa("AAA-123","BOGOTA"));
	    listPlaca.add(new Placa("BBB-123","MEDELLIN"));
	    listPlaca.add(new Placa("CCC-123","CALI"));
		
	}
	
	@WebMethod()
	public List<Placa> listarPlacasRobadas() {
	    return listPlaca;
	}
	
	@WebMethod()
	public boolean verificarPlaca(@WebParam(name="numPlaca")String numPlaca) {
		
		for (Placa placa : listPlaca) {
			if(placa.getNumPlaca().equalsIgnoreCase(numPlaca)){
				return true;
			}
		}
		
	    return false;
	}

}
