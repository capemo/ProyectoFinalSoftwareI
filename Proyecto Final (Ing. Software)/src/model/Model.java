package model;

import view.View;

public abstract class Model {
// revisar*****
	public static Model getPrograma() {
		return new Programa();
	}

	// metodos abstractos
	public abstract void start(View v);

	public abstract void refreshView();
}
