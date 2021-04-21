package clases;

public class Program {

	public static void main(String[] args) {
		
		Factory f = new Factory();
		
		Empleado e1 = new Empleado("Anombre", "Aapellido", 203434340, "alta", 1, 10, TipoCobro.Mensual);
		Empleado e2 = new Empleado("Bnombre", "Bapellido", 203454545, "baja", 1, 10, TipoCobro.PorHora);
		
		ICalculoSueldo cS = f.getCalculoSueldo(e1);
		System.out.println(cS.calcular(e1));
		
		ICalculoSueldo cS2 = f.getCalculoSueldo(e2);
		System.out.println(cS2.calcular(e2));
		//System.out.println(cS.calcular(e2));
	}

}
