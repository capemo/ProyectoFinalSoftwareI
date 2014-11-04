package view;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import view.MateriaCellRender;
import model.Materia;

/**
 * JList Custom Renderer Example
 *
 * @author wwww.codejava.net
 */
public class JListCustomRendererExample extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JListCustomRendererExample() {
        Materia us = new Materia("1", "us",null,3, null);
        Materia u = new Materia("2", "us",null,3, null);
       

        //create the model and add elements
        DefaultListModel<Materia> listModel = new DefaultListModel<>();
        listModel.addElement(us);
        listModel.addElement(u);

        //create the list
        JList<Materia> countryList = new JList<>(listModel);
        add(new JScrollPane(countryList));
        countryList.setCellRenderer(new MateriaCellRender());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JList Renderer Example");
        this.setSize(200, 200);
        this.setLocationRelativeTo(null);        
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JListCustomRendererExample();
            }
        });
    }
}