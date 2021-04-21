package clases;

public class Factory {
	
	public IConexion getConection(String motor) {
		if("Oracle".equals(motor)) {
			return new Oracle();
		} else if ("MySql".equals(motor)) {
			return new MySql();
		} else {
			return null;
		}
	}

}
