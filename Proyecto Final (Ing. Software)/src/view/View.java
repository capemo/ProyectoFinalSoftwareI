package view;

import java.util.List;

import model.Materia;
import model.Model;
import controller.Controller;

public abstract class View {

	public static View getView() {
		return new StandardView();
	}

	public abstract void start(Controller c, Model m);

	public abstract void refresh();

	public abstract void setProgramTittle(String nombrePrograma);

	public abstract void refreshMaterias(List<Materia> materias);
	
	public abstract void saveProgram(Model model);
	
	public abstract void loadProgram();

}
