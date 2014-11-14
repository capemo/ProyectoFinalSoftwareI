package model;

import java.io.Serializable;
import java.util.List;

import view.View;

public abstract class Model implements Serializable{
	private static final long serialVersionUID = 4661669179019051113L;

	public static Model getPrograma() {
		return new Programa();
	}
	
	public abstract void start(View v);

	public abstract void refreshView();
	
	public abstract void changeProgramParameters(String nombrePrograma,
			List<Materia> materias, String descripcion);
	
	public abstract void saveProgram();
	
	public abstract void loadProgram();
}
