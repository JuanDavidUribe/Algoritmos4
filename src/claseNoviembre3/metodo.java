package claseNoviembre3;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;

import PadresHijos.Hijo;
import PadresHijos.Padre;

public class metodo {
	private ArrayList <Object> arrayList;
	
	public metodo () {
		arrayList =  new ArrayList ();
	}
	
	public void ingresarInfo () {
		while (JOptionPane.showConfirmDialog(null, "Desea ingresar informacion?") == JOptionPane.YES_NO_OPTION) {
			String [] options = {"vector", "matriz"};
			String x = String.valueOf(
					JOptionPane.showInputDialog(null, 
							"Menú", 
							"Seleccione una estructura", 
							JOptionPane.QUESTION_MESSAGE, null, options, options[0])
					);
			switch(x){
				case "Vector": arrayList.add(ingresarVector());
					break;
				case "Matriz": arrayList.add(ingresarMatriz());
					break;
			}
		}
		arrayList.add(ingresarVector ());
		
		arrayList.add(ingresarMatriz ());
	}
	
	private Vector <Padre> ingresarVector () {
		Vector <Padre> vectorPadre = new Vector<Padre>(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones")));
		for (int i = 0; i < vectorPadre.capacity(); i++) {
			vectorPadre.add(new Padre(
					JOptionPane.showInputDialog("Ingrese el tipo de identificacion"),
					JOptionPane.showInputDialog("Ingrese el numero de identificacion"),
					JOptionPane.showInputDialog("Ingrese los nombres"),
					JOptionPane.showInputDialog("Ingrese los apellidos"),
					JOptionPane.showInputDialog("Ingrese el celular"),
					Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")),
					null
					));
		}
		return vectorPadre;
	}
	
	private Hijo[][] ingresarMatriz (){
		Hijo[][] matrizHijo = new Hijo [Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas"))][Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas"))];
		for (int i = 0; i < matrizHijo.length; i++) {
			for (int j = 0; j < matrizHijo[0].length; j++) {
				matrizHijo [i][j] = new Hijo (
						JOptionPane.showInputDialog("Ingrese el tipo de identificacion"),
						JOptionPane.showInputDialog("Ingrese el numero de identificacion"),
						JOptionPane.showInputDialog("Ingrese los nombres"),
						JOptionPane.showInputDialog("Ingrese los apellidos"),
						JOptionPane.showInputDialog("Ingrese el celular"),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")),
						JOptionPane.showInputDialog("Ingrese el deporte")
						);
			}
		}
		return matrizHijo;
		
	}

	public String imprimirTodo () {
		String concatenar = "";
		for (Object estructura : arrayList) {
			if (estructura.getClass().getSimpleName().equals("Vector")) {
				Vector<Padre> vector = (Vector)estructura;
				for (Padre padre : vector) {
					concatenar += "padre: " + padre.getNombres() + "\n";
				}
			} else {
				Hijo[][]matriz = (Hijo[][]) estructura;
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[0].length; j++) {
						Hijo hijo = (Hijo) estructura;
						concatenar += "el deporte que practica el hijo " + hijo.getNombres() + " es:"  + hijo.getDeporte() + "\n";
					}
				}
			}
			concatenar += "\n-------------------------------\n";
		}
		return concatenar;
		
	}
	
}
