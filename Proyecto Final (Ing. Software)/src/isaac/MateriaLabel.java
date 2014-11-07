package isaac;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import model.Materia;

public class MateriaLabel extends JLabel {
	
	private Materia materia;
	
	public MateriaLabel(){
		super();
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	public MateriaLabel(Materia materia){
		super();
		setText("<html>ID: "+materia.getIdMateria()+"<br>NOMBRE: "+materia.getNombreMateria()+
				"<br>CREDITOS: "+materia.getCreditos()+"</html>");
		this.materia=materia;
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

}
