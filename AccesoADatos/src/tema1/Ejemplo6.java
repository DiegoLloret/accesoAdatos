package tema1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Ejemplo6 {

	//crear un programa que reciba como parametro dos archivos uno el fuente y otro destino y copiar el primero en el segundo
	// usar fileinputStream y fileoutputstream.
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File carpeta = null;
		File carpeta2=null;
		FileInputStream t = null;
		FileOutputStream ti=null;
		
		if (args.length == 0) {
			System.out.println("no has pasado parametros");
			return;
		} else {
			System.out.println(" has pasado como parametros: " + args[0]);
		}

		try {

			carpeta = new File(args[0]);
			t = new FileInputStream(carpeta);
			byte[] buffer = new byte[(int) carpeta.length()];
			
			t.read(buffer);

			System.out.print(new String(buffer, StandardCharsets.UTF_8));
			
			carpeta2 = new File(args[1]);
			ti = new FileOutputStream(carpeta2);
			ti.write(buffer);

			t.close();
			ti.close();
		} catch (IOException e) {
			System.out.println("Error al leer el fichero " + args[0] + "\n" + e);
			try {
				t.close();
				ti.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("Error al cerrar el fichero " + args[0] + "\n" + e1);
			}
		}
		
	}
}