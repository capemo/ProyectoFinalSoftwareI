package persistence;

import java.io.*;

import javax.swing.*;

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

		int filename = chooser.showOpenDialog(null);

		if (filename == JFileChooser.APPROVE_OPTION) {
			File f = chooser.getSelectedFile();
			try {
				FileReader inputFile = new FileReader(f);

				BufferedReader bufferReader = new BufferedReader(inputFile);

				String line;

				while ((line = bufferReader.readLine()) != null) {
					System.out.println(line);
				}

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
