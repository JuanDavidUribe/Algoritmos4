package RegExExamples;

import javax.swing.JOptionPane;

public class Metodo {
	public static String validarTipoIdRegex(String tipoId){
        if(tipoId.matches("[A-Z][á-úa-u][a-z]{4,5}\\s[a-z]{9}")){ //Cédula - Tarjeta identidad - Cédula extranjeria
            validarTipoIdRegex(JOptionPane.showInputDialog("Error, ingrese correctamente la id"));
        }
        return tipoId;
    }
    
    //Identificación debe tener de 6 a 10 dígitos
    public static String validarId(String id){
        if(id.length() < 6 || id.length() > 10){
            validarId(JOptionPane.showInputDialog("Error, ingrese correctamente la id"));
        }
        return id;
    }
    
    public static String validarIdRegex(String id){
        if(id.matches("\\d{6,10}")){ //1001534689
            validarIdRegex(JOptionPane.showInputDialog("Error, ingrese correctamente la id"));
        }
        return id;
    }
    
    public static String validarNombresRegex(String nombre){
        if(nombre.matches("[A-Z][a-z]{2,10}\\s[A-Z][a-z]{2,10}|[A-Z][a-z]{2,10}")){ //Juan David - Mateo
            validarIdRegex(JOptionPane.showInputDialog("Error, ingrese correctamente los nombre"));
        }
        return nombre;
    }
    
    public static String validarEdadRegex(String edad){
        if(edad.matches("\\d{2}")){ 
            validarIdRegex(JOptionPane.showInputDialog("Error, ingrese correctamente la edad"));
        }
        return edad;
    }
    
    public static String validarCelularRegex(String celular){
        if(celular.matches("[3]\\d{9}")){ 
            validarIdRegex(JOptionPane.showInputDialog("Error, ingrese correctamente el número del celular"));
        }
        return celular;
    }

}
