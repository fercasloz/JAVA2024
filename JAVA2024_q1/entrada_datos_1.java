package java2024_fer_q1;

import java.util.*;

public class entrada_datos_1 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre:");
		String nombre_user=entrada.nextLine();
		
		System.out.println("Introduce tu edad:");
		int edad_user=entrada.nextInt();
		
		System.out.println("Hola " + nombre_user + " tienes " + edad_user + " años. Y el año que viene tendrás " + (edad_user+1) + " años.");
		
	}

}
