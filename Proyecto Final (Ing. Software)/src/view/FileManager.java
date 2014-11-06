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
	private boolean approval;
	private File file;
	private JFileChooser chooser;

	public FileManager(Programa programa) {
		this.programa=programa;
		openFileChooser();
	}
	
	public FileManager(){
		openFileChooser();
	}

	public void openFileChooser() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {

		}
		this.chooser = new JFileChooser();
		File file = new File("Programas académicos/");
		chooser.setCurrentDirectory(file);

		int filename = chooser.showOpenDialog(null);
		this.approval = false;
		if (filename == JFileChooser.APPROVE_OPTION) {
			this.file = chooser.getSelectedFile();
			this.approval = true;
		}
	}

	public Programa readTxtFile() throws Exception {
		Programa programa=new Programa();
		if (this.approval) {
			this.file = chooser.getSelectedFile();
			try {
				FileReader inputFile = new FileReader(this.file);

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

				programa.setParametros(nombrePrograma, materias, "");
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
		if (this.approval) {
			try {
				writeSelectedSerialFile(chooser.getSelectedFile());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null,
						"No se pudo guardar el archivo.",
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
			JOptionPane.showMessageDialog(null,
					"No se pudo salvar el archivo.",
					"Error al guardar el archivo", JOptionPane.ERROR_MESSAGE);
		}
	}

	public Programa loadSerialFile() throws IOException {
		chooser.setDialogTitle("Cargar Configuracion");
		if (this.approval) {
			this.file = (chooser.getSelectedFile());
			try {
				ObjectInputStream ois = new ObjectInputStream(
						new FileInputStream(this.file));
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
