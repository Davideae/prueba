package pack1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean primo;
		int c, n, numeroComprobador;
		
		for(n=2;n<101;n++) 
		{
			primo = true;
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
