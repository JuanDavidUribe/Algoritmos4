package PadresHijos;

public class Persona {
	protected String tipoId, numeroId, nombres, apellidos, celular;
	protected int edad;
	
	public Persona(String tipoId, String numeroId, String nombres, String apellidos, String celular, int edad) {
		super();
		this.tipoId = tipoId;
		this.numeroId = numeroId;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.celular = celular;
		this.edad = edad;
	}

	public String getTipoId() {
		return tipoId;
	}

	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}

	public String getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(String numeroId) {
		this.numeroId = numeroId;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [tipoId=" + tipoId + ", numeroId=" + numeroId + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", celular=" + celular + ", edad=" + edad + "]";
	}

}
