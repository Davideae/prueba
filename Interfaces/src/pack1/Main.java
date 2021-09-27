package pack1;

import java.util.Scanner;

import clases.GestionListado;

public class Main {

	public static void main(String[] args) {
		GestionListado gl;
		String menu;
		int opcion, numero;
		Scanner sc = new Scanner(System.in);

		gl = new GestionListado();
		menu = "Menu: \n"
				+"1. Introducir numero entero \n"
				+"2. Listar numeros \n"
				+"3. Eliminar numero \n"
				+"4. Eliminar todos los numeros \n"
				+"5. Salir \n";
		
		do 
		{
			System.out.println(menu);
			opcion = sc.nextInt();
			
			switch(opcion) 
			{
				case 1:
					System.out.println("Introduzca número: ");
					numero = sc.nextInt();
					gl.nuevo(numero);
				break;
				case 2:
					gl.listar();
				break;
				case 3:
					System.out.println("Indique que numero desea eliminar: ");
					numero = sc.nextInt();
					gl.eliminar(numero);
				break;
				case 4:
					gl.eliminar();
				break;
				case 5:
				break;
		
			}
			
		}while(opcion!=5);
	}

}
