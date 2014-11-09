package view;

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

public class FileManager {
	private Programa programa;

	public FileManager(Programa programa) {
		this.programa=programa;
	}

	public Programa readTxtFile() throws Exception {
		Programa programa=new Programa();
		JFileChooser fc = new JFileChooser("Select");
		fc.setDialogTitle("Load program");
		fc.setApproveButtonToolTipText("Select the program to load.");
		fc.setApproveButtonText("Select");
		File file = new File("Programas académicos/");
		fc.setCurrentDirectory(file);
		int respuesta = fc.showOpenDialog(null);

		if (respuesta == JFileChooser.APPROVE_OPTION) {
			try {
				FileReader inputFile = new FileReader(fc.getSelectedFile());

				BufferedReader bufferReader = new BufferedReader(inputFile);
				List<Materia> materias = new ArrayList<Materia>();
				String line;
				int cont = 1;
				String nombrePrograma = "";
				String[] materia;
				String[] preRequicitos;

				while (!(line = bufferReader.readLine())
						.contains("-- PRE-REQUISITOS --")) {
					if (cont == 1) {
						nombrePrograma = line;
						cont = 0;
					} else {
						materia = line.split(" ~ ");
						materias.add(new Materia(materia[0], materia[1],
								new ArrayList<Materia>(), Integer
										.parseInt(materia[2]),
								new EstadoMateria(Estado.NO_VISTA, (Calendar
										.getInstance().get(Calendar.YEAR)),
										Periodo.NA)));
					}
				}

				while ((line = bufferReader.readLine()) != null) {
					preRequicitos = line.split(" ¬ ");
					for (int i = 0; i < materias.size(); i++) {
						if (materias.get(i).getIdMateria()
								.equals(preRequicitos[0])) {
							for (int j = 1; j < preRequicitos.length; j++) {
								for (int k = 0; k < materias.size(); k++) {
									if (materias.get(k).getIdMateria()
											.equals(preRequicitos[j])) {
										materias.get(i).getPreRequicitos()
												.add(materias.get(k));
									}
								}
							}
						}
					}
				}

				programa.setParameters(nombrePrograma, materias, "");
				bufferReader.close();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(
						null,
						"Error while reading file line by line:"
								+ e.getMessage());
			}
		}
		return programa;
	}

	public void saveSerialFile() throws Exception {
		JFileChooser fc = new JFileChooser(".");
		fc.setDialogTitle("Save Configuration");
		File file = new File("Programas académicos/");
		fc.setCurrentDirectory(file);
		int respuesta = fc.showSaveDialog(null);

		if (respuesta == JFileChooser.APPROVE_OPTION) {
			try {
				writeSelectedSerialFile(fc.getSelectedFile());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null,
						e.getMessage(),
						"Error al guardar el archivo",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void writeSelectedSerialFile(File file) throws Exception {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(file));
			oos.writeObject(programa);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"No se pudo salvar el archivo.",
					"Error al guardar el archivo", JOptionPane.ERROR_MESSAGE);
		}
	}

	public Programa loadSerialFile() throws IOException {
		JFileChooser fc = new JFileChooser();
		fc.setDialogTitle("Load Configuration");
		File file = new File("Programas académicos/");
		fc.setCurrentDirectory(file);

		int respuesta = fc.showOpenDialog(null);

		if (respuesta == JFileChooser.APPROVE_OPTION) {
			try {
				ObjectInputStream ois = new ObjectInputStream(
						new FileInputStream(fc.getSelectedFile()));
				programa = (Programa) ois.readObject();
				ois.close();
			} catch (Exception e) {
				JOptionPane
						.showMessageDialog(null,
								"Error! Solo se permiten archivos serializados referentes al programa.");
				System.exit(0);
			}
		} else {
			System.exit(0);
		}
		return programa;
	}
}
