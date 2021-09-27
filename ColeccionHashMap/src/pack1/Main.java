package pack1;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		var temperaturasMaxEstacion = new HashMap<String, Integer>();
		int temperatura;
		String mensaje;
		
		temperaturasMaxEstacion.put("Otoño", 20);
		temperaturasMaxEstacion.put("Invierno", 10);
		temperaturasMaxEstacion.put("Primavera", 26);
		temperaturasMaxEstacion.put("Verano", 43);

		temperatura = temperaturasMaxEstacion.get("Primavera");
		mensaje = "La maxima en primavera es de "+temperatura+" grados";
		System.out.println(mensaje);
		
		if(temperaturasMaxEstacion.containsKey("Primavera")) 
		{
			temperaturasMaxEstacion.remove("Primavera");
			System.out.println("Elemento eliminado");
		}else {
			System.out.println("No se ha encontrado Primavera");
		}
		
		for(String valor: temperaturasMaxEstacion.keySet()) //manera de recorrer arrays y colecciones
		{
			temperatura = temperaturasMaxEstacion.get(valor);
			System.out.println("La temperatura máxima en "+valor+" es de "+temperatura+" grados.");
		}
		
		//modificacion de un valor
		System.out.println();
		temperaturasMaxEstacion.put("Verano", 45);
		
		for(String valor: temperaturasMaxEstacion.keySet()) //manera de recorrer arrays y colecciones
		{
			temperatura = temperaturasMaxEstacion.get(valor);
			System.out.println("La temperatura máxima en "+valor+" es de "+temperatura+" grados.");
		}
		
		
		
	}

}
