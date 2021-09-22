
public class Main {

	public static void main(String[] args) {
		
		int r, suma; 
		String fila;
		
		for(int c=1; c<=9; c++) 
		{
			suma = 0;
			System.out.println("Tabla del "+c);
			for(int m=1; m<=10;m++) {
				r = c * m;
				suma +=r;
				fila = c + " X "+m+" = "+r;
				System.out.println(fila);
			}
			System.out.println("======================");
			System.out.println("Suma: "+suma);
		}
	}

}
