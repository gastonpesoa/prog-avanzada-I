package clases;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private Integer cuil;
	private String estado;
	private Double sueldo; 
	private Integer cantidadHorasTrabajadas;
	private TipoCobro tipoCobro;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Integer getCuil() {
		return this.cuil;
	}
	
	public void setCuil(Integer cuil) {
		this.cuil = cuil;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Double getSueldo() {
		return this.sueldo;
	}
	
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	
	public Integer getCantidadHorasTrabajadas() {
		return this.cantidadHorasTrabajadas;
	}
	
	public void setCantidadHorasTrabajadas(Integer cantidadHorasTrabajadas) {
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
	}
	
	public TipoCobro getTipoCobro() {
		return this.tipoCobro;
	}
	
	public void setTipoCobro(TipoCobro tipoCobro) {
		this.tipoCobro = tipoCobro;
	}
	
	
	public Empleado() {
		
	}
	
	public Empleado(
			String nombre, 
			String apellido, 
			int cuil, 
			String estado, 
			double sueldo,
			int cantidadHorasTrabajadas,
			TipoCobro tipoCobro) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.estado = estado;
		this.sueldo = sueldo;
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
		this.tipoCobro = tipoCobro;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		} else if(o.getClass().equals(this.getClass())) {
			Empleado e = (Empleado)o;
			if(this.cuil == e.cuil && this.nombre.equals(e.nombre)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		final int primo = 21; // final > inalterable
		int retorno = 0;
		retorno = primo * this.cuil;
		retorno += primo * this.nombre.hashCode();
		return retorno;
	}
	
	@Override
	public String toString() {
		return "Cuil: " + this.cuil + " - Nombre: " + this.nombre + " - Apellido: " + this.apellido;
	}
	
}
