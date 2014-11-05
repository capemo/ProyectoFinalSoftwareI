package model;

public class EstadoMateria {
	private Estado estado;
	private int a�o;
	private Periodo periodo;

	public EstadoMateria(Estado estado, int a�o, Periodo periodo) {
		super();
		this.estado = estado;
		this.a�o = a�o;
		this.periodo = periodo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
}
