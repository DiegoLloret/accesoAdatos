package tema1;

import java.io.File;
import java.util.Scanner;

public class ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dado un directorio que esté colgando del raiz, recorrer los ficheros del
		 * mismo, es indicar para cada uno de ellos: - Nombre - Se puede o no se puede
		 * escribir - Es un fichero oculto o no - Tamaño en bytes Comprobar si existe o
		 * no, en caso de existir realizar lo indicado anteriormente, y sino existe,
		 * indicarlo mediante mensaje, crearlo.
		 * 
		 */
		System.out.println("Escribe un directorio colgado de la raiz");
		Scanner sc = new Scanner(System.in);
		String ruta = sc.nextLine();
		String mensaje = "";

		// Utilizamos el String que contiene la ruta para
		// un objeto de la clase File
		File carpeta = new File(ruta);
		while (!carpeta.exists()) {

			System.out.println("el directorio no existe");
			
			if(carpeta.mkdir()) {
			
			System.out.println("directorio creado");
			System.out.println("directorio vacio");
			}else {
				System.out.println("no se ha podido crear");
				
		}

		// Listo los archivos y los guardo en un Array de tipo File
		File[] archivos = carpeta.listFiles();
		// Recorro el array

		for (int i = 0; i < archivos.length; i++) {
			File archivoActual = archivos[i];
			// Si el File es un arvhivo se muestra el nombre
			// Si es una carpeta se muestra el símbolo '¬' delante
			mensaje = archivoActual.getName() + "--- ";
			if (archivoActual.canWrite()) {
				mensaje += " se puede escribir,";
			} else {
				mensaje += " no se puede escribir,";
			}
			if (archivoActual.isHidden()) {
				mensaje += " esta oculto,";
			} else {
				mensaje += " no esta oculto,";
			}
			System.out.println(mensaje + " " + archivoActual.getTotalSpace() + " bytes");
		}
		
	}

	}
}
