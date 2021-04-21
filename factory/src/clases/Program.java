package clases;

public class Program {

	public static void main(String[] args) {
		
		Factory f = new Factory();
		
		IConexion con = f.getConection("Oracle");
		
		con.conectar();
		con.desconectar();
	}

}
