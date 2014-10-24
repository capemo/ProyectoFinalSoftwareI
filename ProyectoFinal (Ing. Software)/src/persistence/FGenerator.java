package persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import model.Programa;
import view.MainInterfaz;

public class FGenerator {

	private Programa programa;
	private MainInterfaz pricipal;

	public FGenerator(Programa programa, MainInterfaz pricipal) {
		this.programa = programa;
		this.pricipal = pricipal;
	}

	public void guardar() throws Exception {

		JFileChooser fc = new JFileChooser(".");
		fc.setDialogTitle("Guardar programa");

		int respuesta = fc.showSaveDialog(pricipal);

		if (respuesta == JFileChooser.APPROVE_OPTION) {
			try {
				escribirListado(fc.getSelectedFile());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(pricipal,
						"No se pudo salvar el archivo.\n" + e.getMessage(),
						"Error salvando el archivo", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void escribirListado(File archivoPrograma) throws Exception {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(archivoPrograma));
			oos.writeObject(programa);
			oos.close();
		} catch (IOException e) {
			throw new Exception("Error al guardar el archivo");
		}
	}

	public Programa cargar() throws IOException {
		File arch;
		JFileChooser fc = new JFileChooser(".");
		fc.setDialogTitle("Cargar Listado");
		int respuesta = fc.showOpenDialog(pricipal);
		if (respuesta == JFileChooser.APPROVE_OPTION) {
			arch = (fc.getSelectedFile());
			try {
				ObjectInputStream ois = new ObjectInputStream(
						new FileInputStream(arch));
				programa = (Programa) ois.readObject();
				ois.close();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(pricipal,
						"Error! Solo se permiten archivos serializados referentes al programa.");
				System.exit(0);
			}
		} 
		else {
			System.exit(0);
		}
		return programa;
	}
}
