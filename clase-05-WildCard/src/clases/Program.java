package clases;

import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		
		Persona p = new Persona();
		Deportista d = new Deportista();
		

	}
	
	public static void mostrarNombre(Persona p) {
		System.out.println(p.getNombre());
	}
	public static void mostrarNombres(List<Persona> pList) {
		for(Persona p : pList) {
			System.out.println(p.getNombre());	
		}
	}
	// metodos genericos para lista generica para las listas
	public static void mostrarNombresWC(List<? extends Persona> list) {
		for(Persona p : list) {
			System.out.println(p.getNombre());	
		}
	}
}
