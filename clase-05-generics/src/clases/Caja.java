package clases;

public class Caja<O> {
//	Object o;
//	public Object abrir() {
//		return o;
//	}
//	public void guardar(Object o) {
//		this.o = o;
//	}
	
	O o;
	public O abrir() {
		return o;
	}
	public void guardar(O o) {
		this.o = o;
	}
}
