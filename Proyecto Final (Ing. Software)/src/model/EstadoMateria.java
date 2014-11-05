package model;

public class EstadoMateria {
	private Estado estado;
	private int año;
	private Periodo periodo;

	public EstadoMateria(Estado estado, int año, Periodo periodo) {
		super();
		this.estado = estado;
		this.año = año;
		this.periodo = periodo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
}
