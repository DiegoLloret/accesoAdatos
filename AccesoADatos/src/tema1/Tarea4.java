package tema1;

import java.io.File;
import java.io.Reader;
import java.io.StringReader;

public class Tarea4 {
	public static void main(String[] args) throws InterruptedException {
		try {
			File carpeta = new File(args[0]);
			int ch;
			Reader reader = new StringReader(args[0]);
			if (carpeta.getName() == null) {
				System.out.println("es nulo");
			} else {

				for (int i = 0; i < args.length; i++) {

					ch = reader.read();
					System.out.println("\nInteger value "
                            + "of character read: "
                            + ch);
         System.out.println("Actual "
                            + "character read: "
                            + (char)ch);
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}