package LogicaDeProgramacion;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class EjercioDiez {

	public static void main(String[] args) {
		HashMap<String, String> diccionario = new HashMap<>();
		diccionario.put("gato", "cat");
		diccionario.put("perro", "dog");
		diccionario.put("pato", "duck");
		diccionario.put("conejo", "rabbit");
		diccionario.put("serpiente", "snake");
		diccionario.put("madre", "mother");
		diccionario.put("padre", "father");
		diccionario.put("direccion", "adress");
		diccionario.put("beso", "kiss");
		diccionario.put("telefono", "phone");
		diccionario.put("agua", "water");
		diccionario.put("correr", "run");
		diccionario.put("tiempo", "time");
		diccionario.put("ayudar", "help");
		diccionario.put("zapato", "shoes");
		diccionario.put("taza", "cup");
		diccionario.put("botella", "bottle");
		diccionario.put("archivo", "file");
		diccionario.put("ventana", "window");
		diccionario.put("raton", "mouse");
		
		int i;
		int contador = 0;
		String traduccion;
		String entrada;
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<5; i++) {
			Random generator = new Random();
			Object[] values = diccionario.keySet().toArray();
			Object randomValue = values[generator.nextInt(values.length)];
			
			System.out.println("Traduce " + randomValue + ": ");
			entrada = sc.nextLine();
			
			traduccion = diccionario.get(randomValue);
			

				if(entrada.equals(traduccion) ) {
					System.out.println("La traduccion es correcta \n");
					contador++;
				
				} else {
					System.out.println("La traduccion es incorrecta \n");
				}
		
		}
		
		System.out.println("Obtuviste " + contador + " respuestas correctas \n");
		System.out.println("Y " + (i-contador) + " respuestas incorrectas \n");
	}	
}

