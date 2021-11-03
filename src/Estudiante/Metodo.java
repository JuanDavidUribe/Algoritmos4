package Estudiante;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Metodo {
	private Estudiante estudiante;
	private ArrayList<Estudiante> arrayEst;

	public Metodo () {
		arrayEst = new ArrayList<Estudiante>();
	}
	
	public void addEstudiante () {
		while(JOptionPane.showConfirmDialog(null, "¿Desea ingresar un estudiante?") == JOptionPane.YES_NO_OPTION){
			arrayEst.add(
					estudiante = new Estudiante(
							JOptionPane.showInputDialog("Ingrese el id"),
							JOptionPane.showInputDialog("Ingrese el nombre del estiduante"),
							JOptionPane.showInputDialog("Ingrese el apellido del estiduante"),
							JOptionPane.showInputDialog("Ingrese la carrera del estiduante"),
							obtenerNotas()
							)			
					);
		}
	}
	
	private ArrayList obtenerNotas() {
		float nota = 0;
		ArrayList<Float> devolver = new ArrayList<Float>();
		while(JOptionPane.showConfirmDialog(null, "¿Desea ingresar una nueva nota") == JOptionPane.YES_NO_OPTION) {
			devolver.add(Float.parseFloat(JOptionPane.showInputDialog("ingrese la nota ")));
		}
		return devolver;
	}
	
	public void mostrar () {
		String s = "";
		for (Estudiante estudiante : arrayEst) {
			s += estudiante.toString() + "\n";
		}
		System.out.println(s);
	}

}
