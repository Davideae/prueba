package pack1;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		  	Programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
			como nombre de alumno “fin”. En ese momento mostrará la edad media de los alumnos y
			el nombre del alumno menor. NOTA: Al introducir como nombre “fin”, no nos ha de pedir el
			año de nacimiento.
		 */
		
		int anioNacimiento,anioActual, edad, suma=0, cantidadAlumnos=0; 
		int menor = Integer.MAX_VALUE;
		float media=1;
		String nombre, nombreMenor=""; 
		Scanner sc = new Scanner(System.in);
		boolean continuar=true;
		
		anioActual = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(anioActual);
		
		System.out.println("Introduzca nombre: ");
		nombre = sc.nextLine();
		
		while(nombre.equals("fin")==false) 
		{
			System.out.println("Introduzca año de nacimiento");
			anioNacimiento = Integer.parseInt(sc.nextLine());
			
			cantidadAlumnos++;
		
			edad = anioActual - anioNacimiento;
			
			suma += edad;
		
			media = (float)suma/(float)cantidadAlumnos;
			
			if(edad<menor) {
				menor = edad;
				nombreMenor = nombre;
			}
			
			System.out.println("Introduzca nombre: ");
			nombre = sc.nextLine();
		}
		
		/*
		do 
		{
			System.out.println("Introduzca nombre, 'fin' para salir: ");
			nombre = sc.nextLine();
			
			if(nombre.equalsIgnoreCase("fin")){
				continuar = false;
			}
			else {
				System.out.println("Introduzca año de nacimiento");
				anioNacimiento = Integer.parseInt(sc.nextLine());
				
				cantidadAlumnos++;
			
				edad = anioActual - anioNacimiento;
				
				suma += edad;
			
				media = (float)suma/(float)cantidadAlumnos;
				
				if(edad<menor) {
					menor = edad;
					nombreMenor = nombre;
				}		
			}
			
		}while(continuar);
		 */
		sc.close();
		if(cantidadAlumnos>0) {
		System.out.println("Edad media: "+media);
		System.out.println("Nombre del alumno menor: "+nombreMenor);
		}
	}

}
