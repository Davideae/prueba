package pack1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n;
		int maximo = Integer.MIN_VALUE;
		int contador=0;
		
		Scanner sc = new Scanner(System.in);

		for(int c=0; c<6; c++) 
		{
			System.out.println("Introduzca un n�mero: ");
			n = sc.nextInt();
			
			if(n>maximo) 
			{
				maximo = n;
				contador = 1;
			}
			else if(n==maximo) {
				contador++;
			}
		}
		
		System.out.println("N�mero m�ximo introducido: "+maximo);
		System.out.println("N�mero de veces que se ha introducido dicho maximo: "+contador);
	}

}
