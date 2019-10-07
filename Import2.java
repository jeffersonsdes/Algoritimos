package Imports;

import java.io.File;
import java.util.Scanner;

public class Import2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter file or directory name: ");
		analyzePath(input.nextLine());

	}
	// exibe informações sobre o arquivo que o usuário especifica

	public static void analyzePath(String path) {

		File name = new File(path);

		if (name.exists()) { // se o nome existir gera a saida

			System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s", name.getName(), "exists",
					(name.isFile() ? "is a file:" : "is not a file"),
					(name.isDirectory() ? "is a directory" : "is not a directory"),
					(name.isAbsolute() ? "is a aboslute path" : "is not absolute path"), "Last modified:",
					name.lastModified(), "length:", name.length(), "Path: ", name.getPath(), "Absolute path: ",
					name.getAbsolutePath(), "Parent:", name.getParent());

			if (name.isDirectory()) {
				String[] directory = name.list();
				System.out.println("\n\nDirectory contentes: \n");

				for (String directoryName : directory)
					System.out.println(directoryName);
			} else {
				System.out.printf("%s %s", path, "does not exist.");
			}

		}

	}
}
