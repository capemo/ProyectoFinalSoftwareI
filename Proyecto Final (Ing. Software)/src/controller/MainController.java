package controller;

import view.View;
import model.Model;

public class MainController {
	public static void main(String[] args) {
		Controller c = Controller.getControlador();
		Model m = Model.getPrograma();
		View v = View.getView();
		c.start(m);
		m.start(v);
		v.start(c, m);
	}
}