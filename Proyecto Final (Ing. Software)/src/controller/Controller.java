package controller;

import java.util.List;

import model.Materia;
import model.Model;

public abstract class Controller {
	public static Controller getControlador() {
		return new StandardController();
	}

	public abstract void start(Model m);
	
	public abstract void solicitarCambioParametros(String nombrePrograma,
			List<Materia> materias, String descripcion);
}
