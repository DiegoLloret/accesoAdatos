package tema1;

import java.io.File;

public class accesosistemaficheros {
	
	public static void main(String[] args) {
		File carpeta1= new File("C://Users//Admin//Desktop");
		File [] ListaCarpeta= carpeta1.listFiles();

		System.out.println(carpeta1.getName());
		
		for(int i=0; i<ListaCarpeta.length;i++) {
			if(ListaCarpeta[i].isDirectory()) {
				System.out.print("--");
			}
			if(ListaCarpeta[i].getName().endsWith("txt")) {
				System.out.print("-txt-");
			}
			System.out.println(ListaCarpeta[i].getName());
			
		}
		 
		
	}
}
