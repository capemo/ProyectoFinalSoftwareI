package persistence;

import java.io.*;

import javax.swing.JOptionPane;

public class ProgramLoader {
	public static void main(String[] args) {
		System.out.println("Reading File from Java code");
		String fileName = "src/Programas académicos/IngenieriaSistemas.txt";
		try {
			FileReader inputFile = new FileReader(fileName);

			BufferedReader bufferReader = new BufferedReader(inputFile);

			String line;

			while ((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}

			bufferReader.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Error while reading file line by line:" + e.getMessage());
		}

	}
}