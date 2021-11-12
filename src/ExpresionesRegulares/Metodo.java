package ExpresionesRegulares;

import javax.swing.JOptionPane;

public class Metodo {
	public static String validarId(String id) {
		if (id.length() < 6 || id.length() > 10) {
			validarId(JOptionPane.showInputDialog("Error, ingrese una id correcta"));
		}
		return id;
	}
	
	
	// id debe detener de 6 a 10 digitos 
	public static String validarIdRegEx(String id) {
		if (id.matches("\\d{6,10}[A-Z]")) {
			validarIdRegEx(JOptionPane.showInputDialog("Error, ingrese una id correcta"));
		}
		return id;
	}
	// las llaves son la cantidad de digitos de la condicion inmediatamente anterior
	// siempre poner dos \\ para las expresiones que lo necesitan
	// \\d es para especificar que es solo numeros 
	// [] identifica un caracter especificado y el guion es aluce que al finalizar va una letra mayuscula entre la a y la z
	

}
