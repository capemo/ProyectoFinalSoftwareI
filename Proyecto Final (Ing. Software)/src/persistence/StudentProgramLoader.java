package persistence;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.*;

import model.Estado;
import model.EstadoMateria;
import model.Materia;
import model.Periodo;
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
				List<Materia> materias = new ArrayList<Materia>();
				String line;
				int cont = 1;
				String nombrePrograma = "";
				String[] materia;
				String[] preRequicitos;

				while (!(line = bufferReader.readLine())
						.contains("-- PRE-REQUICITOS --")) {
					if (cont == 1) {
						nombrePrograma = line;
						cont = 0;
					} else {
						materia=line.split(" ~ ");
						materias.add(new Materia(materia[0], materia[1], new ArrayList<Materia>(), Integer.parseInt(materia[2]), new EstadoMateria(Estado.NO_VISTA, (Calendar.getInstance().get(Calendar.YEAR)), Periodo.I)));
					}
				}

				while ((line = bufferReader.readLine()) != null) {
					preRequicitos=line.split(" ¬ ");
					for (int i = 0; i < materias.size(); i++) {
						if (materias.get(i).getIdMateria().equals(preRequicitos[0])) {
							for (int j = 1; j < preRequicitos.length; j++) {
								for (int k = 0; k < materias.size(); k++) {
									if (materias.get(k).getIdMateria().equals(preRequicitos[j])) {
										materias.get(i).getPreRequicitos().add(materias.get(k));
									}
								}
							}
						}
					}
				}

				Programa programa = new Programa(nombrePrograma, materias, "");

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
