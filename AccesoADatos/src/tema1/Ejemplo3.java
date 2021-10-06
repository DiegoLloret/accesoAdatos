package tema1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Ejemplo3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		File carpeta = null;
		FileInputStream t = null;

		try {
			if (args.length == 0) {
				System.out.println("no has pasado nada como argumento");
			} else {
				System.out.println("has pasado como argumento: " + args[0]);
			}
			carpeta = new File(args[0]);
			t = new FileInputStream(carpeta);
			int charLeidos = 0 ;
			byte[] buffer = new byte[(int) carpeta.length()];
			while( t.read(buffer)!=1) {
				charLeidos = t.read( buffer );
			}
			t.close();
			System.out.print(new String(buffer, StandardCharsets.UTF_8));
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado " + args[0] + "\n");
		} catch (IOException e) {
			System.out.println("Error al leer el fichero " + args[0] + "\n" + e);
			try {
				t.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("Error al cerrar el fichero " + args[0] + "\n" + e1);
			}
		}

	}
}
