package pack1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean primo;
		int c, n, numeroComprobador;
		
		for(n=2;n<101;n++) 
		{
			primo = true; // siempre volver a inicializar las variables si puedes ser modificadas dentro del bucle
			for (c=2; c<n; c++) 
			{ 
				if(n%c == 0) 
				{
					primo = false;
				}
			}
			if(primo)
				System.out.println(n);
		}
		
		
	}

}
