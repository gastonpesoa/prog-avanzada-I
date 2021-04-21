package clases;

public class SueldoPorHora implements ICalculoSueldo {

	private static SueldoPorHora sH;
	
	private SueldoPorHora() {
		
	}
	
	public static SueldoPorHora getSueldoPorHora() {
		if(sH == null) {
			sH = new SueldoPorHora();
			return sH;
		} else {
			return sH;
		}
	}
	
	@Override
	public Double calcular(Empleado empleado) {
		return empleado.getSueldo() * empleado.getCantidadHorasTrabajadas();
	}

}
