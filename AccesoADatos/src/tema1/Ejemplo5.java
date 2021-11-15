package tema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo5 {
	public static void main(String[] args) {
		System.out.println("Entra los caracteres: ");
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		try {
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			reader.mark(6);
			
			System.out.println("imprimimos despues de la marca");
			
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			reader.reset();
			
			System.out.println("imprimimos despues del reset");
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			
			reader.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
//crear un programa que reciba como paranmetro dos archivos uno el fuente y otro destino y copiar el primero en el segundo
// usar fileinputStream y fileoutputstream.