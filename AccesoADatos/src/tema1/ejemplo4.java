package tema1;

import java.io.BufferedReader;
import java.io.FileReader;

public class ejemplo4 {
	public static void main(String[] args) throws InterruptedException {
		char[] array = new char[100];

		try {
			FileReader file = new FileReader("C:\\Users\\Admin\\Desktop\\FIFA\\hola.txt");
			BufferedReader input = new BufferedReader(file);
			input.read(array);
			System.out.println("contenido del fichero: ");
			System.out.println(array);
			input.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
