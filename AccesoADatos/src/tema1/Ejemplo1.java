package tema1;

import java.io.File;

public class Ejemplo1 {
	public static void main(String[] args) { 
		 //Indicamos la ruta de la carpeta a la que queramos acceder 
		 String ruta= "C:\\Users\\Admin\\Documents\\programacion"; 
		 //Utilizamos el String que contiene la ruta para 
		 // un objeto de la clase File 
		 File carpeta=new File(ruta); 
		 //Listo los arvhivos y los guardo en un Array de tipo File 
		 File[] archivos=carpeta.listFiles(); 
		 //Recorro el array 
		 for(int i=0;i<archivos.length;i++) { 
		 File archivoActual=archivos[i]; 
		 //Si el File es un arvhivo se muestra el nombre 
		 //Si es una carpeta se muestra el símbolo '¬' delante 
		 if(archivoActual.isFile()) { 
		 System.out.println(archivoActual.getName()); 
		 }else { 
		 System.out.println("¬" + archivoActual.getName()); 
		 } 
		 } 
		 }
}
 //dado un directorio colgado de la raiz recorrer los ficheros del mismo e indicar para cada uno de ellos
//el nombre si se puede escribir en el, si es oculto y el tamaño en bytes