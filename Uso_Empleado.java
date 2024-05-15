package java2024_fer_POO;
import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		/*
		Empleado empleado1 = new Empleado("Fernando",120000,2023,10,10);
		Empleado empleado2 = new Empleado("Juan",85000,2023,10,10);
		Empleado empleado3 = new Empleado("Ana",60000,2023,10,10);
		
		empleado1.subirSueldo(15);
		empleado2.subirSueldo(5);
		empleado3.subirSueldo(5);
		
		System.out.println("Nombre: "+empleado1.getNombre() + "Sueldo: "+empleado1.getSueldo() + " Fecha de alta: " + empleado1.getFechaContrato());
		System.out.println("Nombre: "+empleado2.getNombre() + "Sueldo: "+empleado2.getSueldo() + " Fecha de alta: " + empleado2.getFechaContrato());
		System.out.println("Nombre: "+empleado3.getNombre() + "Sueldo: "+empleado3.getSueldo() + " Fecha de alta: " + empleado3.getFechaContrato());
		*/
		
		Empleado[]misEmpleados=new Empleado[3];
		
		misEmpleados[0]=new Empleado("Fernando",120000,2023,10,10);
		misEmpleados[1]=new Empleado("Juan",85000,2023,06,10);
		misEmpleados[2]=new Empleado("Ana",60000,2023,06,10);
		
		/*
		for(int i=0;i<3;i++) {
			misEmpleados[i].subirSueldo(5);
		}
		*/
		
		for(Empleado e:misEmpleados) {
			e.subirSueldo(5);
		}
		
		/*
		for(int i=0;i<3;i++) {
			System.out.println("Nombre: "+misEmpleados[i].getNombre() + " Sueldo: "+misEmpleados[i].getSueldo() + 
					" Fecha de alta: " + misEmpleados[i].getFechaContrato());
		}
		*/
		
		for(Empleado e:misEmpleados) {
			System.out.println("Nombre: "+e.getNombre() + " Sueldo: "+e.getSueldo() + 
					" Fecha de alta: " + e.getFechaContrato());
		}
	}

}	
	




class Empleado{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
		altaContrato=calendario.getTime();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public Date getFechaContrato() {
		return altaContrato;
	}
	
	public void subirSueldo(double porcentaje) {
		double aumento=(sueldo*porcentaje)/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
}







