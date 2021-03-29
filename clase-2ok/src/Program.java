import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un texto: ");
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		System.out.println("escribio: ".concat(texto));
		StringHandle sH = new StringHandle();
		sH.ImprimirCantidadDeCaracteres(texto);
		sH.ImprimirPrimeraMitadDeLosCaracteres(texto);
		sH.ImprimirUltimoCaracter(texto);
	}

}
