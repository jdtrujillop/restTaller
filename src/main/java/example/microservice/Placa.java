package example.microservice;

public class Placa {

	private String numPlaca;
	private String ciudad;
	
	public Placa(String numPlaca, String ciudad){
		this.ciudad=ciudad;
		this.numPlaca=numPlaca;
	}
	
	public String getNumPlaca() {
		return numPlaca;
	}
	public void setNumPlaca(String numPlaca) {
		this.numPlaca = numPlaca;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
	
}
