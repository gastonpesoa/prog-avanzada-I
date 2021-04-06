package clases;

public class ManejoString {
	/**
	 * 
	 * @param texto
	 * @return
	 * @throws Exception
	 */
	public int cantidadDeCaracteres (String texto) throws Exception 
	{
		if(texto == null || "".equals(texto)) {
			throw new RuntimeException("No puede ser vacío");
		}
		return texto.length();
	}
	
	public String primeraMitadDeLosCaracteres(String texto) throws Exception {
		if("".equals(texto) || texto.length() < 2) {
			throw new Exception("Debe tener dos o mas caracteres");
		}
		int mitad = texto.length() / 2;
		return texto.substring(0, mitad);
	}
	
	public char ultimoCaracter(String texto) throws Exception {
		if("".equals(texto)) {
			throw new Exception("No puede ser vacío");
		}
		return texto.charAt(texto.length() - 1);
	}
	
	public String enFormaInversa(String texto) throws Exception {
		if("".equals(texto)) {
			throw new Exception("No puede ser vacío");
		}
		String result = "";
		for(int i = texto.length() - 1; i > -1 ; i--) {
			result += texto.charAt(i);
		}
		return result;
	}
	
	public String separadoPorUnGuion(String texto) throws Exception {
		if("".equals(texto)) {
			throw new Exception("No puede ser vacío");
		}
		String result = "";
		for(int i = 0; i < texto.length(); i++) {
			if(i != texto.length() - 1) {
				result += texto.charAt(i) + "-" ;	
			} else {
				result += texto.charAt(i);
			}
		}
		return result;
	}
	
	public boolean poseePalabraHola(String texto) throws Exception {
		if("".equals(texto)) {
			throw new Exception("No puede ser vacío");
		}
		return texto.toLowerCase().contains("hola");
	}
}
