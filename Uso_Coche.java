package java2024_fer_POO;
import javax.swing.*;
public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche miCoche = new Coche(); //INSTANCIAR UNA CLASE. EJEMLAR UNA CLASE
		

		//System.out.print("Este coche tiene: " + Renault.ruedas + " ruedas.");
		
		/*System.out.println(miCoche.getInfo());
		
		miCoche.setAsientos("si");
		System.out.println(miCoche.getAsientos());*/
		System.out.println(miCoche.getInfo());
		
		miCoche.setColor(JOptionPane.showInputDialog("Introduce el color del coche"));
		miCoche.setAsientos(JOptionPane.showInputDialog("Asientos de cuero (si/no)"));
		miCoche.setClimatizador(JOptionPane.showInputDialog("Climatizador (si/no)"));
		
		System.out.println(miCoche.getColor());
		System.out.println(miCoche.getAsientos());
		System.out.println(miCoche.getClimatizador());
		
		System.out.println(miCoche.dime_peso_coche());
		System.out.println("El precio del coche es de "+miCoche.precio_coche()+" euros");

	}

}
