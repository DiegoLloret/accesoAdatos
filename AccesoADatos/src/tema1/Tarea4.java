package tema1;

import java.io.File;
import java.io.FileInputStream;
import java.io.Reader;
import java.io.StringReader;

public class Tarea4 {
	public static void main(String[] args) throws InterruptedException {
		try {
			if(args.length==0) {
				System.out.println("no has pasado parametros");
				return;
			}else {
				System.out.println(" has pasado como parametros: "+args[0]);
			}
			File carpeta = new File(args[0]);
			int ch;
			Reader reader = new StringReader(args[0]);
			FileInputStream t= new FileInputStream(carpeta);
			byte[] buffer= new byte[(int)carpeta.length()];
			t.read(buffer);
			
//			if (carpeta.getName() == null) {
//				System.out.println("es nulo");
//			} else {
//
//				for (int i = 0; i < carpeta.length(); i++) {
//
//					 ch= t.read(buffer);
//					
//         System.out.print(buffer);
//				}
//
//			}
			   System.out.print(new String (buffer));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}