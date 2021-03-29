package clases;

public class Alumno extends Persona {
	private int legajo;
	
	public Alumno() {
		
	}
	public Alumno(String nombre, int dni, int legajo){
		this.legajo = legajo;
	}
	public Alumno(String nombre, int dni){
		this.legajo = legajo;
	}
	public int getLegajo() {
		return this.legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
}
