package byteClasses;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Program {

	public static void main(String[] args) {
		
		File dirs = new File("./src");
		
		for(File arch : dirs.listFiles()) {
			System.out.println(arch.getName());
		}

		File origen = new File("./src/koala.jpeg");
		File destino = new File("./src/copia-koala.jpeg");
		
		try {
			FileInputStream fis = new FileInputStream(origen);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			FileOutputStream fos = new FileOutputStream(destino);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			byte[] buff = new byte[1000];
			
			int cant = bis.read(buff, 0, buff.length);
			while(cant > -1) {
				bos.write(buff, 0, buff.length);
				cant = bis.read(buff, 0, buff.length);
			}
			
			bos.flush();
			
			bos.close();
			bis.close();
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
