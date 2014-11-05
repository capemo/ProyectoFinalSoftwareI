package model;

import java.io.Serializable;
import java.util.List;

public class Programa implements Serializable {
	private String nombrePrograma;
	private List<Materia> materias;
	private String descripcion;

	public Programa(String nombrePrograma, List<Materia> materias,
			String descripcion) {
		super();
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
}
