package controller;

import java.util.List;

import model.Materia;
import model.Model;

public class StandardController extends Controller {
	private Model model;

	public void start(Model model) {
		this.model = model;
	}

	@Override
	public void requestParameterChanges(String nombrePrograma,
			List<Materia> materias, String descripcion) {
		model.changeProgramParameters(nombrePrograma, materias, descripcion);		
	}

	@Override
	public void saveProgram() {
		model.saveProgram();
	}

	@Override
	public void loadProgram() {
		// TODO Auto-generated method stub
		
	}
}
