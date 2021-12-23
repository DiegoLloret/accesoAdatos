package tema1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class OrdenarFichero {
	
	public static void main(String[] args) {
		String ruta= "C:\\Users\\Diego\\Desktop\\hola\\archivo1.txt"; 
		String ruta1= "C:\\Users\\Diego\\Desktop\\hola\\archivo2.txt";
		File archivo1 = new File(ruta);
		File archivo2 = new File(ruta1);
		String diego="Felipe te odio esto es muy complicado";
		ArrayList<String> lista = new ArrayList<String>();
		try {
			
			FileReader fr = new FileReader(archivo1);
			
			BufferedReader br = new BufferedReader(fr);

			
			FileWriter fw = new FileWriter(archivo2,true);
			
			PrintWriter pw = new PrintWriter(fw);
			BufferedWriter bw = new BufferedWriter(fw);
			String linea = null;
			while ((linea = br.readLine()) != null) {
				lista.add(linea);
				//System.out.println(linea);
			}
			
			Collections.sort(lista);
			
			Iterator iter = lista.iterator();
			String cadena;
			while (iter.hasNext()) {
				cadena = (String) iter.next();
				pw.println(cadena);
				
				//System.out.println(cadena);
			}
			pw.write(diego);
			
			
			 
			
	             
	      
			br.close();
			fr.close();
			pw.close();
			fw.close();
			
			
			
		} catch (FileNotFoundException e) {
			
			System.err.println("No se ha encontrado el fichero");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
