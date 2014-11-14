package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import model.Materia;

public class MateriaLabel extends JLabel {
	private static final long serialVersionUID = -1008760621795541983L;
	private Materia materia;

	public MateriaLabel() {
		super();
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	public MateriaLabel(Materia materia) {
		super();
		this.materia = materia;
		setText("<html><center><font size="+1+"> ID: " + materia.getIdMateria() + "</font><br><font size="+2+">"
				+ materia.getNombreMateria() + "</font><br><font size="+1+"> CREDITOS: "
				+ materia.getCreditos() + "</font></center></html>"); 
		setHorizontalAlignment(SwingConstants.CENTER);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setPreferredSize(new Dimension(130,60));
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

}
