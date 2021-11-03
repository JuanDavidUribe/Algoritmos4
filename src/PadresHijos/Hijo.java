package PadresHijos;

public class Hijo extends Persona {
	private String deporte;

	public Hijo(String tipoId, String numeroId, String nombres, String apellidos, String celular, int edad,
			String deporte) {
		super(tipoId, numeroId, nombres, apellidos, celular, edad);
		this.deporte = deporte;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
	

}
