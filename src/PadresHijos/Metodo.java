package PadresHijos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Metodo {
	private ArrayList <Padre> arrayPadre;
	
	public Metodo () {
		arrayPadre = new ArrayList ();
	}
	
	public void IngresarInfo () {
		while (JOptionPane.showConfirmDialog(null, "Desea ingresar un padre") == JOptionPane.YES_NO_OPTION) {
			arrayPadre.add(new Padre(
					JOptionPane.showInputDialog("Ingrese el tipo de identificacion"),
					JOptionPane.showInputDialog("Ingrese el numero de identificacion"),
					JOptionPane.showInputDialog("Ingrese los nombres"),
					JOptionPane.showInputDialog("Ingrese los apellidos"),
					JOptionPane.showInputDialog("Ingrese el celular"),
					Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")),
					ingresarHijo()
					));
		}
	}
	
	private ArrayList <Hijo> ingresarHijo(){
		ArrayList <Hijo> ArrayHijos = new ArrayList ();
		if (JOptionPane.showConfirmDialog(null, "Desea ingresar un hijo") == JOptionPane.YES_NO_OPTION) {
			while (JOptionPane.showConfirmDialog(null, "Desea ingresar un hijo") == JOptionPane.YES_NO_OPTION) {
				ArrayHijos.add(new Hijo(
						JOptionPane.showInputDialog("Ingrese el tipo de identificacion"),
						JOptionPane.showInputDialog("Ingrese el numero de identificacion"),
						JOptionPane.showInputDialog("Ingrese los nombres"),
						JOptionPane.showInputDialog("Ingrese los apellidos"),
						JOptionPane.showInputDialog("Ingrese el celular"),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")),
						JOptionPane.showInputDialog("Ingrese el deporte")
						));
				
			}
			return ArrayHijos;
		}
		return null;
	}
	
	public String imprimirTodo () {
		String concatenar = "";
		for (Padre padre : arrayPadre) {
			concatenar += padre.toString() + "\n";
		}
		return concatenar;
	}
	
	
	

}
