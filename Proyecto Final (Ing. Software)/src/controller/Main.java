package controller;

import java.util.Calendar;

import persistence.FileManager;
import view.MainInterfaz;

public class Main {
	public static void main(String[] args) throws Exception {
//		MainInterfaz m=new MainInterfaz();
//		m.setVisible(true);
//		FileManager fm = new FileManager();
//		fm.readTxtFile();
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));
	}
}
