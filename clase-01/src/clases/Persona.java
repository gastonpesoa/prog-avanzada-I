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
}
