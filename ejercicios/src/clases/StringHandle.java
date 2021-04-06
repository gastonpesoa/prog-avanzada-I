package clases;

public class StringHandle {

	public void ImprimirCantidadDeCaracteres(String texto) {
		System.out.println("cantidad de chars: " + texto.length());
	}
	public void ImprimirPrimeraMitadDeLosCaracteres(String texto) {
		int mitad = texto.length() / 2;
		System.out.println("primera mitad de chars: ".concat(texto.substring(0, mitad)));
	}
	public void ImprimirUltimoCaracter(String texto) {
		System.out.println(texto.charAt(texto.length()-1));
	}
	public void ImprimirloEnFormaInversa(String texto) {
		
	}
}
