package example_JTable;

import java.awt.GridLayout;

import javax.swing.DropMode;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Test extends JFrame {
	public Test() {
		setSize(500, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pan = new JPanel();
		pan.setLayout(new GridLayout(1, 1, 5, 5));

		Object[][] data = new Object[][] { { "00", "10", null },
				{ "01", "11", null }, { "02", "20", null } , {"1","2","3"}};
		String[] name = new String[] { "a", "b", "c"};
		DefaultTableModel model = new DefaultTableModel(data, name);
		JTable jt = new JTable(model);
		pan.add(new JScrollPane(jt));
		
		jt.setAutoCreateRowSorter(true);
		jt.setRowHeight(24);
		jt.setRowSelectionAllowed(false);

		jt.setFillsViewportHeight(true);
		jt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jt.setDragEnabled(true);
		jt.setDropMode(DropMode.USE_SELECTION);
		jt.setTransferHandler(new MyTransferHandlerT());

		setContentPane(pan);
		setVisible(true);
	}
	public static void main(String[] args) {
		Test t=new Test();
	}
}