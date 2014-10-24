package model;

import java.io.Serializable;
import java.util.List;

public class Programa implements Serializable {
	private String nombrePrograma;
	private List<Materia> materias;
	private String descripcion;
}
