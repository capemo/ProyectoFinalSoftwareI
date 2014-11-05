package persistence;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import model.Materia;
import model.Programa;

public class StudentProgramLoader {
	public StudentProgramLoader() {
	}

	public static void main(String[] args) throws Exception {
		readFile();
	}

	public static void readFile() throws Exception {
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			
		}
		JFileChooser chooser = new JFileChooser();
		File file = new File("Programas académicos/");
        chooser.setCurrentDirectory(file);
		
		int filename = chooser.showOpenDialog(null);
		
		if (filename == JFileChooser.APPROVE_OPTION) {
			File f = chooser.getSelectedFile();
			try {
				FileReader inputFile = new FileReader(f);

				BufferedReader bufferReader = new BufferedReader(inputFile);
				List<Materia> materias=new ArrayList<Materia>();
				String line;
				int cont=1;
				String nombrePrograma="";
				String materia;
				
				while ((line = bufferReader.readLine()) != null) {
					if (line.contains("-- PRE-REQUICITOS --")) {
						continue pre_requicitos;
					}
					if (cont==1) {
						nombrePrograma=line;
						cont=0;
					}
					materias.add(new Materia(idMateria, nombreMateria, new ArrayList<Materia>(), creditos, estado)
				}
				pre_requicitos: {
					while ((line = bufferReader.readLine()) != null) {
						for (int i = 0; i < array.length; i++) {
							
						}
					}
				}
				
				Programa programa=new Programa(nombrePrograma, materias, null);

				bufferReader.close();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(
						null,
						"Error while reading file line by line:"
								+ e.getMessage());
			}
		}
	}
}
