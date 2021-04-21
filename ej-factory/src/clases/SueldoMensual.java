package clases;

public class SueldoMensual implements ICalculoSueldo {
	
	private static SueldoMensual sM;
	
	private SueldoMensual() {
		
	}
	
	public static SueldoMensual getSueldoMensual() {
		if(sM == null) {
			sM = new SueldoMensual();
			return sM;
		} else {
			return sM;
		}
	}
	
	@Override
	public Double calcular(Empleado empleado) {
		return empleado.getSueldo();
	}

}
