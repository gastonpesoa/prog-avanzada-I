package clases;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManejoString ms = new ManejoString();
		
		System.out.println("Ingrese un texto: ");
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		System.out.println("escribio: ".concat(texto));
		
		String textoInverso = null;
		String textoGuiones = null;
		try {
			textoInverso = ms.enFormaInversa(texto);
			textoGuiones = ms.separadoPorUnGuion(texto);
			if(ms.poseePalabraHola(texto)) {
				System.out.println("posee hola");
			} else {
				System.out.println("NO posee hola");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inverso: ".concat(textoInverso));
		System.out.println("con guiones: ".concat(textoGuiones));
	}

}
