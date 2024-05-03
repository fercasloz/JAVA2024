package java2024_fer_q1;
import javax.swing.*;
public class entrada_datos_2 {

	public static void main(String[] args) {
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre :");
		
		String edad_usuario = JOptionPane.showInputDialog("Introduce la edad : ");
		
		int edad_usuario1=Integer.parseInt(edad_usuario);
		
		System.out.println("Hola " + nombre_usuario + " tienes " + (edad_usuario1+1) + " años");
	}

}


//VIDEO 17