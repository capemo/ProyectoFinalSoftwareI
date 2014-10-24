package model;

import java.util.List;

public class Materia {
	private String idMateria;
	private String nombreMateria;
	private List<Materia> preRequicitos;
	private int creditos;
	private EstadoMateria estado;
}
