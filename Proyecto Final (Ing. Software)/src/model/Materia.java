package model;

import java.io.Serializable;
import java.util.List;

public class Materia implements Serializable{
	private static final long serialVersionUID = -5366763128449698199L;
	private String idMateria;
	private String nombreMateria;
	private List<Materia> preRequicitos;
	private int creditos;
	private EstadoMateria estado;

	public Materia(String idMateria, String nombreMateria,
			List<Materia> preRequicitos, int creditos, EstadoMateria estado) {
		super();
		this.idMateria = idMateria;
		this.nombreMateria = nombreMateria;
		this.preRequicitos = preRequicitos;
		this.creditos = creditos;
		this.estado = estado;
	}

	public String getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public List<Materia> getPreRequicitos() {
		return preRequicitos;
	}

	public void setPreRequicitos(List<Materia> preRequicitos) {
		this.preRequicitos = preRequicitos;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public EstadoMateria getEstado() {
		return estado;
	}

	public void setEstado(EstadoMateria estado) {
		this.estado = estado;
	}
}
