package controller;

import java.util.List;

import model.Materia;
import model.Model;

public class StandardController extends Controller {
	private Model m;

	public void start(Model m) {
		this.m = m;
	}

	@Override
	public void solicitarCambioParametros(String nombrePrograma,
			List<Materia> materias, String descripcion) {
		m.changeProgramParameters(nombrePrograma, materias, descripcion);		
	}
}
