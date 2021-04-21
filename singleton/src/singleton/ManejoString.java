package singleton;

public class ManejoString {
	
	private static ManejoString ms;
	
	// desde afuera no pueden generar este objeto
	private ManejoString() {
		
	}
	
	public static ManejoString generarObjeto() {
		if(ms == null) {
			ms = new ManejoString();	
		}
		return ms;
	}
	
	public int cantidad(String s) {
		if(s != null) {
			return s.length();	
		} else {
			return -1;
		}
	}
}
