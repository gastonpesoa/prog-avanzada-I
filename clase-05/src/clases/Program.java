package clases;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		// ArrayList: 
		// - pesimo para mover elementos 
		// - lento tambien a la hora de ordenar 
		// - rapido a la hora de agregar
		
		// LinkedList: 
		// - lista enlazada - vagones enlazados
		// - los nuevos elementos se linkean unos con otros
		// - lento a la hora de agregar
		// - rapido para remover y reordenar
		// - indices dinamicos
		
		// Vector:
		//- para manejar concurrencia
		//- cuando se trabaja con hilos
		
		// HashSet:
		// Para elementos no repetidos y no nulos
		// el ordenamiento no es secuencial sino por el hashCode en el orden que le conviene
		// mas usada cuando se traen elemetos de una db , 
		// - cuando no importa el ordenamiento inicial 
		// - ni el indice 
		// - y porque no deberia haber elementos repetidos
		// - si es una lista de una clase propia 
		// -- sino esta sobreescrito el metodo equals y el metodo hashCode 
		// -- no va a saber cuando los elementos esten repetidos
		Set<String> lista = new HashSet<String>();
		lista.add("hola");
		lista.add("hola");
		// va a guardar uno solo de esos dos
		lista.add("holA");
		lista.add("a");
		// este si
		System.out.println(lista.size());
		for(String s : lista) {
			System.out.println(s);
		}
		// tampoco tienen indices
		// lista.get(:id) > no existe
		lista.remove("hola");
		System.out.println(lista.size());
		for(String s : lista) {
			System.out.println(s);
		}
		
		// Persona implementa la interfaz Comparable 
		// que sobreescribe el metodo compareTo
		// para poder hacer un sort
		List<Persona> listaPersona = new LinkedList<Persona>();
		Persona p1 = new Persona("Gaston", 123);
		Persona p2 = new Persona("Mario", 234);
		listaPersona.add(p1);
		listaPersona.add(p2);
		for(Persona o : listaPersona) {
			System.out.println(o.getNombre());
		}
		Collections.sort(listaPersona);
		for(Persona o : listaPersona) {
			System.out.println(o.getNombre());
		}
		
		// TreeSet:
		// - como las HashSet pero ordena de manera ascendente por defecto
		
		// HashMap > Map
		// - key value
		// - evalua que no exista key
		// - si existe lo modifica
		// - sino lo agrega
		// - orden por hash
		Map mapa = new HashMap();
		mapa.put("key", "value");
		mapa.put("key", "value4");
		mapa.put("key1", "value1");
		mapa.put("key2", "value2");
		System.out.println(mapa.size());
		System.out.println(mapa.get("key"));
		
		Set claves = mapa.keySet();
		for(Object o : claves) {
			System.out.println(o);
			System.out.println(mapa.get(o));
		}
		
		Map<String, Integer> mapaRestringido = new HashMap();
	}

}
