package tema1;

import java.io.File;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("escribe una ruta con mas de 5 caracteres y que acabe en .txt");
		Scanner sc= new Scanner(System.in);
		String ruta=sc.nextLine();
		int h=ruta.lastIndexOf("/");
		int j=ruta.length();
		String finalRuta=ruta.substring(h+1,j);
		File carpeta1= new File(ruta);
		File [] ListaCarpeta= carpeta1.listFiles();
		while(finalRuta.length()<6) {
			
		}
		System.out.println("escribe una ruta con mas de 5 caracteres y que acabe en .txt");
	ruta= sc.nextLine();
	for(int i=0; i<ListaCarpeta.length;i++) {
		if(ListaCarpeta[i].isDirectory()) {
			System.out.print(" es un directorio");
		}
		if(ruta.length()>5) {
			System.out.println("la ruta debe tener al menos 5 letras");
		}
		if(ruta.endsWith(".txt")) {
			System.out.println("terminacion correcta");
		}else {
			System.out.println("no termina en .txt vuelve a intentarlo");
		}
		}

	}

}
