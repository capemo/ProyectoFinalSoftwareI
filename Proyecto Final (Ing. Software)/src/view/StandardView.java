package view;

import java.util.Scanner;

import model.Model;
import model.Programa;
import controller.Controller;
import controller.StandardController;

public class StandardView extends View {
	private StandardController controller;
	private Programa programa;
	private MainInterfaz mainInterfaz;

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	public void start(Controller c, Model m) {
		this.controller = (StandardController) c;
		this.programa = (Programa) m;
		this.mainInterfaz=new MainInterfaz(this);
	}

	public void refresh() {

	}

	public void actualizarMensaje(String string) {
		System.out.println(string);
	}
	
	public MainInterfaz getMainInterfaz() {
		return mainInterfaz;
	}

	public void setMainInterfaz(MainInterfaz mainInterfaz) {
		this.mainInterfaz = mainInterfaz;
	}
}
