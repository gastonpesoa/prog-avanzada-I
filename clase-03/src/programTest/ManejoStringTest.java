package programTest;
import clases.ManejoString;
import org.junit.Test;
import org.junit.Assert;

public class ManejoStringTest {
	
	@Test
	public void cantidadDeCaracteresOk() {
		ManejoString ms = new ManejoString();
		final String valorInput = "Hola";
		final int valorOutput = 4;
		try {
			int respuesta = ms.cantidadDeCaracteres(valorInput);
			Assert.assertEquals(valorOutput, respuesta);
		} catch (RuntimeException e) {
			Assert.assertTrue(true);
		} catch (Exception e) {
			Assert.fail();
		}
	}
	
	@Test
	public void cantidadDeCaracteresVacio() {
		ManejoString ms = new ManejoString();
		final String valorInput = "";
		try {
			int respuesta = ms.cantidadDeCaracteres(valorInput);
			Assert.fail();
		} catch (RuntimeException e) {
			Assert.assertTrue(true);
		} catch (Exception e) {
			Assert.fail();
		}
	}
	
	@Test
	public void cantidadDeCaracteresNull() {
		ManejoString ms = new ManejoString();
		final String valorInput = null;
		try {
			int respuesta = ms.cantidadDeCaracteres(valorInput);
			Assert.fail();
		} catch (RuntimeException e) {
			Assert.assertTrue(true);
		} catch (Exception e) {
			Assert.fail();
		}
	}
}
