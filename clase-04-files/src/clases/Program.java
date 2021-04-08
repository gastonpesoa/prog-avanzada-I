package clases;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		// File puede ser todo: , 
		//- un archivo o 
		//- un directorio
		//System.getProperty("line.separator")
		
		File file = new File("./output.txt");
		File directorio = new File("./dir");
		File directorios = new File("./dirs/otro");
		File dirs = new File("../");
		
		for(File arch : dirs.listFiles()) {
			System.out.println(arch.getName());
		}
		
		directorio.mkdir();
		directorios.mkdirs();
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(file.exists());
		System.out.println(directorio.isDirectory());
		System.out.println(directorios.isDirectory());
		System.out.println(file.isFile());
		
		//=========== escritura ====================== 
		
		File log = new File("logError.txt");
		try {
			FileWriter fw = new FileWriter(log, true); // true apendea
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("probando bufferedwriter");
			bw.write(System.getProperty("line.separator")); // salto de linea para todos los OS
			bw.flush(); // pasa la info del buffer al disco (vacia el buffer)
			
			bw.close();
			fw.close(); // liberar el objeto de java para que se pueda abrir y consultarlo
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//=========== lectura ======================
		
		try {
			FileReader fr = new FileReader(log);
			BufferedReader br = new BufferedReader(fr);
			String firstLine = br.readLine(); 
			while(firstLine != null) {
				System.out.println(firstLine);
				firstLine = br.readLine();
			}
			
			br.close();
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//===============================================
		
		ManejoDeArchivos.write("probando log class");
		System.out.println(ManejoDeArchivos.read(1));
		
	}
}
