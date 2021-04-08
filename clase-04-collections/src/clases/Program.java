package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		// solo pueden almacenar objetos
		// nunca datos primitivos
		
		List lista = new ArrayList(); 
		lista.add("Hola"); // 0
		lista.add("Que tal"); // 0
		lista.add("Chau"); // 1
		
		System.out.println(lista.size());
		System.out.println(lista.get(0));
		
		lista.remove(0);
		System.out.println(lista.size());
		System.out.println(lista.get(0)); 
		
		// los indices no son fijos, son dinamicos
		// siempre de manera secuencial
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		for(Object o : lista) {
			System.out.println(o);
		}
		
		List<String> listaString = new ArrayList(); 
		
		lista.clear();
		lista.addAll(lista);
		for(Object o : lista) {
			System.out.println(o);
		}
		
		System.out.println(lista.contains("Hola"));
		
		System.out.println(lista.isEmpty());
		// NO USAR lista.size() > 0 // esta maaaaalll!!
		
		Collections.sort(lista);
		for(Object o : lista) {
			System.out.println(o);
		}
		
	}
}
