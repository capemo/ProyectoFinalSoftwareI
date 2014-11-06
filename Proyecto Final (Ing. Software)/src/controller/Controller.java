package controller;

import model.Model;

public abstract class Controller {
	public static Controller getControlador() {
		return new StandardController();
	}

	public abstract void start(Model m);
}
