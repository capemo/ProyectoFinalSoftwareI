package model;

import java.io.Serializable;
import java.util.List;

import view.View;

public class Programa extends Model implements Serializable {
	private String nombrePrograma;
	private List<Materia> materias;
	private String descripcion;
	private View v;

	public Programa() {

	}

	public void setParametros(String nombrePrograma, List<Materia> materias,
			String descripcion) {
		this.nombrePrograma = nombrePrograma;
		this.materias = materias;
		this.descripcion = descripcion;

	}

	public String getNombrePrograma() {
		return nombrePrograma;
	}

	public void setNombrePrograma(String nombrePrograma) {
		this.nombrePrograma = nombrePrograma;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void start(View v) {
		this.v = v;
	}

	public void refreshView() {
		v.refresh();
	}
}
