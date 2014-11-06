package view;

import model.Model;
import controller.Controller;

public abstract class View {

	public static View getView() {
		return new StandardView();
	}

	public abstract void start(Controller c, Model m);

	public abstract void refresh();

}
