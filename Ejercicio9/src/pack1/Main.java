package pack1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Programa consistente en un juego en el que el Jugador1 introduce un n�mero entre el 1 y
			el 100 y el Jugador2 tendr� que adivinarlo en un m�ximo de 10 intentos. Por cada intento
			del Jugador2, y en el caso de no acertar, se mostrar� el mensaje �Te pasaste�, o �No
			llegaste�, seg�n corresponda. De la misma manera, y al terminar el programa, se
			mostrar�n los mensajes �Acertaste� o bien �Intentos agotados�.
		 */
		
		int j1, j2, nIntentos=10;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un numero entre el 1 al 100: ");
			j1 = Integer.valueOf(sc.nextLine());
		} while (j1<1 || j1>100);
		
		for(int c=0;c<10;c++) 
		{
			System.out.println("Jugador 2, adivine el numero del jugador 1: ");
			j2 = Integer.valueOf(sc.nextLine());
			if(j2==j1) 
			{
				System.out.println("Has ganado, felicidades");
				break;
			}else if(j2<j1){
				nIntentos--;
				System.out.println("No llegaste, intentos que te quedan: "+nIntentos);
			}else if(j2>j1) 
			{
				nIntentos--;
				System.out.println("Te has pasao illo, intentos que te quedan: "+nIntentos);
			}
		}
		
		

	}

}
