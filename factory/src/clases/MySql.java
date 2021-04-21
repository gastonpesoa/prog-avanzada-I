package clases;

public class MySql implements IConexion {

	@Override
	public void conectar() {
		System.out.println("Me conecte a Sql");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Me deconecte a Sql");
	}
	

}
