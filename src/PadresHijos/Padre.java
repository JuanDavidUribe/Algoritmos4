package PadresHijos;

import java.util.ArrayList;

public class Padre extends Persona {
	private ArrayList ArrayHijos;

	public Padre(String tipoId, String numeroId, String nombres, String apellidos, String celular, int edad,
			ArrayList arrayHijos) {
		super(tipoId, numeroId, nombres, apellidos, celular, edad);
		this.ArrayHijos = arrayHijos;
	}

	public ArrayList getArrayHijos() {
		return ArrayHijos;
	}

	public void setArrayHijos(ArrayList arrayHijos) {
		ArrayHijos = arrayHijos;
	}

	@Override
	public String toString() {
		return "Padre [" + super.toString() + "ArrayHijos=" + ArrayHijos + "]";
	}
	
}