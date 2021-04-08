package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManejoDeArchivos {
	
	public static void write(String msg) {
		File log = new File("logError.txt");
		try {
			FileWriter fw = new FileWriter(log, true); 
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(msg);
			bw.write(System.getProperty("line.separator")); 
			bw.flush();
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String read(int quantityLines) {
		int count = 0;
		String result = "";
		
		File log = new File("logError.txt");
		try {
			FileReader fr = new FileReader(log);
			BufferedReader br = new BufferedReader(fr);
			String firstLine = br.readLine();
			
			while(firstLine != null) {
				count++;
				result += firstLine;
				firstLine = br.readLine();
			}
			br.close();
			fr.close();
			if(quantityLines > count) {
				throw new Exception("File not have this quantity of lines");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
