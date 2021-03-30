package clases;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona per1 = new Persona();
		per1.setDni(123);
		String nombrePer1 = new String("Jessica");
		per1.setNombre(nombrePer1);
		System.out.println(per1.toString());
		
		Persona per2 = new Persona("Gaston", 1234);
		//syso
		System.out.println(per1.getNombre());
		System.out.println(per2.toString());
				
		if(per1 == per2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
			//siempre va a caer aca porque el == compara referencias
		}
		
		//Para saber si un objeto es equivalente con el otro
		if(per1.equals(per2)) {
			System.out.println("Son iguales");
			System.out.println(per1.hashCode());
			System.out.println(per2.hashCode());
		} else {
			System.out.println("No son iguales");
			System.out.println(per1.hashCode());
			System.out.println(per2.hashCode());
		}
		
		
	}

}
