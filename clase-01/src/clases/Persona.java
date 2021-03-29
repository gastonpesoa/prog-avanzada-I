package clases;

//POJO
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
		} else if(o instanceof Persona) {
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
}
