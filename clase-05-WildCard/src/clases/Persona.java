package clases;

public class Persona {
	private String nombre;
	private int dni;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		//} else if(o instanceof Persona) { // esto se puede mejorar
		} else if(o.getClass().equals(this.getClass())) {
			Persona p = (Persona)o;
			if(this.dni == p.dni && this.nombre.equals(p.nombre)) {
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
		retorno = primo * this.dni;
		retorno += primo * this.nombre.hashCode();
		return retorno;
	}
	
	@Override
	public String toString() {
		return "Dni: " + this.dni + " - Nombre: " + this.nombre;
	}
}
