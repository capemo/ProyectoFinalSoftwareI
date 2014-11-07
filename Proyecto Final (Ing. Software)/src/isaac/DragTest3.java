package isaac;

import java.awt.*;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

import model.Materia;

public class DragTest3 {
	public JComponent makeUI() {
		DragPanel p1 = new DragPanel();
		p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p1.add((new MateriaLabel(new Materia("1", "Materia 1", null, 3, null))));
		p1.add(new MateriaLabel(new Materia("2", "Materia 2", null, 2, null)));
		p1.add(new MateriaLabel(new Materia("3", "Materia 3", null, 3, null)));
		p1.add(new MateriaLabel(new Materia("4", "Materia 4", null, 3, null)));

		MouseListener handler = new Handler();
		p1.addMouseListener(handler);
		LabelTransferHandler th = new LabelTransferHandler();
		p1.setTransferHandler(th);
		JScrollPane panelPane = new JScrollPane(p1);
		JPanel p = new JPanel(new GridLayout(1, 2));

		p.add(panelPane);

		DragPanel p2 = new DragPanel();
		p2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p2.addMouseListener(handler);
		p2.setTransferHandler(th);
		p.add(new JScrollPane(p2));

		JPanel panel = new JPanel(new GridLayout(2, 2));
		panel.add(p);

		return panel;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				createAndShowGUI();
			}
		});
	}

	public static void createAndShowGUI() {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.add(new DragTest3().makeUI());
		f.setSize(320, 240);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}