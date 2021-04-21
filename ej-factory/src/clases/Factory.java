package clases;

public class Factory {
	public ICalculoSueldo getCalculoSueldo(Empleado empleado) {
		if(TipoCobro.Mensual.equals(empleado.getTipoCobro())) {
			return SueldoMensual.getSueldoMensual();
		} else if(TipoCobro.PorHora.equals(empleado.getTipoCobro())) {
			return SueldoPorHora.getSueldoPorHora();
		} else {
			return null;
		}
	}
}
