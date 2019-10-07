package Imports;

import java.io.File;
import java.io.FileWriter;

public class Import {

	public static void main(String[] args) {

		try {
			File f = new File("texto.txt");
			FileWriter imp;
			imp = new FileWriter(f, true);
			imp.write("texto1-texto2-texto3\r\n");
			imp.close();

		} catch (Exception e) {
			System.out.println("Não foi possível escrever no arquivo");
		}

	}

}
