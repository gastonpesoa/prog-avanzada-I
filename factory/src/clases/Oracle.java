package clases;

public class Oracle implements IConexion {
	
	@Override
	public void conectar() {
		System.out.println("Me conecte a Oracle");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Me deconecte a Oracle");
	}

}
