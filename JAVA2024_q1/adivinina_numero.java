package java2024_fer_q1;
import java.util.*;
public class adivinina_numero {

	public static void main(String[]args) {
		
		int aleatorio=(int)(Math.random()*100); //convertir un valor double en INT
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		while(numero!=aleatorio) {
			
			System.out.println("Introduce un número, por favor");
			
			numero=entrada.nextInt();
			intentos ++;
			
			if(aleatorio<numero) {
				System.out.println("Un número que sea más bajo");
				
			}
			else if(aleatorio>numero) {
				System.out.println("Un número que sea más alto");
				
			}
		}
		
		System.out.println("Correcto");
		System.out.println("Lo has acertado en " +intentos+" intentos");
	}
}
