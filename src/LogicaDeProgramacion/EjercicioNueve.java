package LogicaDeProgramacion;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class EjercicioNueve {

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

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Ingresa la palabra que quieres traducir: ");
			traduccion = sc.nextLine();
			
			if(diccionario.containsKey(traduccion)) {
				System.out.println("La traduccion es: " + diccionario.get(traduccion) + "\n");
				
			} else {
				System.out.println("La palabra no se encuentra en el diccionario \n");
				
			}
			
		} while(!traduccion.equals("exit")); 


	}
}
