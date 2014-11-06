package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import model.Programa;

public class MainInterfaz extends JFrame implements ActionListener{

	private static final String CARGAR_PROGRAMA="CARGAR PROGRAMA";
	private JPanel container;
	private JButton btnCargarPrograma;
	private JButton btnCargarConfig;
	private JButton btnGuardarConfig;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JLabel jLabel10;
	private JList jList1;
	private JList jList2;
	private JList jList3;
	private JList jList4;
	private JList jList5;
	private JList jList6;
	private JList jList7;
	private JList jList8;
	private JList jList9;
	private JList jList10;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane10;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane3;
	private JScrollPane jScrollPane4;
	private JScrollPane jScrollPane5;
	private JScrollPane jScrollPane6;
	private JScrollPane jScrollPane7;
	private JScrollPane jScrollPane8;
	private JScrollPane jScrollPane9;
	private JScrollPane jScrollPaneMateriasPorVer;
	private JScrollPane jScrollPaneMateriasVistas;
	private JScrollPane jScrollPanePrograma;
	private JLabel lblMateriasVistas;
	private JLabel lblNombrePrograma;
	private JLabel lblMateriasPorVer;
	private JList lstMateriasVistas;
	private JList lstMateriasPorVer;
	private JPanel panelBotones;
	private JPanel panelMateriasVistas;
	private JPanel panelPrograma;
	
	private StandardView standardView;

	public MainInterfaz(StandardView standarView) {
		this.standardView=standarView;
		initComponents();
	}

	private void initComponents() {

		container = new JPanel();
		panelMateriasVistas = new JPanel();
		lblMateriasVistas = new JLabel();
		jScrollPaneMateriasVistas = new JScrollPane();
		lstMateriasVistas = new JList();
		jScrollPanePrograma = new JScrollPane();
		panelPrograma = new JPanel();
		jLabel1 = new JLabel();
		jScrollPane1 = new JScrollPane();
		jList1 = new JList();
		jScrollPane2 = new JScrollPane();
		jList2 = new JList();
		jLabel2 = new JLabel();
		jScrollPane3 = new JScrollPane();
		jList3 = new JList();
		jLabel3 = new JLabel();
		jScrollPane4 = new JScrollPane();
		jList4 = new JList();
		jLabel4 = new JLabel();
		jScrollPane5 = new JScrollPane();
		jList5 = new JList();
		jLabel5 = new JLabel();
		jLabel6 = new JLabel();
		jScrollPane6 = new JScrollPane();
		jList6 = new JList();
		jLabel7 = new JLabel();
		jScrollPane7 = new JScrollPane();
		jList7 = new JList();
		jLabel8 = new JLabel();
		jScrollPane8 = new JScrollPane();
		jList8 = new JList();
		jScrollPane9 = new JScrollPane();
		jList9 = new JList();
		jLabel9 = new JLabel();
		jScrollPane10 = new JScrollPane();
		jList10 = new JList();
		jLabel10 = new JLabel();
		lblNombrePrograma = new JLabel();
		panelBotones = new JPanel();
		btnCargarPrograma = new JButton();
		btnCargarConfig = new JButton();
		btnGuardarConfig = new JButton();
		jScrollPaneMateriasPorVer = new JScrollPane();
		lblMateriasPorVer = new JLabel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Program Manager 1.0");

		lblMateriasVistas.setHorizontalAlignment(SwingConstants.CENTER);
		lblMateriasVistas.setText("MATERIAS VISTAS");
		lblMateriasVistas.setHorizontalTextPosition(SwingConstants.CENTER);

		lstMateriasVistas.setModel(new AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPaneMateriasVistas.setViewportView(lstMateriasVistas);

		GroupLayout panelMateriasVistasLayout = new GroupLayout(
				panelMateriasVistas);
		panelMateriasVistas.setLayout(panelMateriasVistasLayout);
		panelMateriasVistasLayout.setHorizontalGroup(panelMateriasVistasLayout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(lblMateriasVistas, GroupLayout.DEFAULT_SIZE, 153,
						Short.MAX_VALUE)
				.addComponent(jScrollPaneMateriasVistas));
		panelMateriasVistasLayout.setVerticalGroup(panelMateriasVistasLayout
				.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
						panelMateriasVistasLayout
								.createSequentialGroup()
								.addComponent(lblMateriasVistas)
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPaneMateriasVistas,
										GroupLayout.DEFAULT_SIZE, 412,
										Short.MAX_VALUE)));

		panelPrograma.setPreferredSize(new java.awt.Dimension(1684, 430));

		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);

		jList1.setModel(new AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane1.setViewportView(jList1);

		jList2.setModel(new AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane2.setViewportView(jList2);

		jLabel2.setHorizontalAlignment(SwingConstants.CENTER);

		jList3.setModel(new AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane3.setViewportView(jList3);

		jLabel3.setHorizontalAlignment(SwingConstants.CENTER);

		jList4.setModel(new AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane4.setViewportView(jList4);

		jLabel4.setHorizontalAlignment(SwingConstants.CENTER);

		jList5.setModel(new AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane5.setViewportView(jList5);

		jLabel5.setHorizontalAlignment(SwingConstants.CENTER);

		jLabel6.setHorizontalAlignment(SwingConstants.CENTER);

		jList6.setModel(new AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane6.setViewportView(jList6);

		jLabel7.setHorizontalAlignment(SwingConstants.CENTER);

		jList7.setModel(new AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane7.setViewportView(jList7);

		jLabel8.setHorizontalAlignment(SwingConstants.CENTER);

		jList8.setModel(new AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane8.setViewportView(jList8);

		jList9.setModel(new AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane9.setViewportView(jList9);

		jLabel9.setHorizontalAlignment(SwingConstants.CENTER);

		jList10.setModel(new AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane10.setViewportView(jList10);

		jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
		configureProgramLabelsText();
		GroupLayout panelProgramaLayout = new GroupLayout(panelPrograma);
		panelPrograma.setLayout(panelProgramaLayout);
		panelProgramaLayout
				.setHorizontalGroup(panelProgramaLayout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(
								panelProgramaLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel1,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane1,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel2,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane2,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel3,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane3,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel4,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane4,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel5,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane5,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel6,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane6,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel7,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane7,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel8,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane8,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel9,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane9,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel10,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane10,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(85, Short.MAX_VALUE)));
		panelProgramaLayout
				.setVerticalGroup(panelProgramaLayout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(
								panelProgramaLayout.createSequentialGroup()
										.addGap(20, 20, 20)
										.addComponent(jScrollPane1))
						.addGroup(
								panelProgramaLayout
										.createSequentialGroup()
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(jLabel1))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane2,
												GroupLayout.DEFAULT_SIZE, 413,
												Short.MAX_VALUE))
						.addGroup(
								panelProgramaLayout
										.createSequentialGroup()
										.addComponent(jLabel3)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane3,
												GroupLayout.DEFAULT_SIZE, 413,
												Short.MAX_VALUE))
						.addGroup(
								panelProgramaLayout
										.createSequentialGroup()
										.addComponent(jLabel4)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane4,
												GroupLayout.DEFAULT_SIZE, 413,
												Short.MAX_VALUE))
						.addGroup(
								panelProgramaLayout
										.createSequentialGroup()
										.addComponent(jLabel5)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane5,
												GroupLayout.DEFAULT_SIZE, 413,
												Short.MAX_VALUE))
						.addGroup(
								panelProgramaLayout
										.createSequentialGroup()
										.addComponent(jLabel6)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane6,
												GroupLayout.DEFAULT_SIZE, 413,
												Short.MAX_VALUE))
						.addGroup(
								panelProgramaLayout
										.createSequentialGroup()
										.addComponent(jLabel7)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane7,
												GroupLayout.DEFAULT_SIZE, 413,
												Short.MAX_VALUE))
						.addGroup(
								panelProgramaLayout
										.createSequentialGroup()
										.addComponent(jLabel8)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane8,
												GroupLayout.DEFAULT_SIZE, 413,
												Short.MAX_VALUE))
						.addGroup(
								panelProgramaLayout
										.createSequentialGroup()
										.addComponent(jLabel9)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane9,
												GroupLayout.DEFAULT_SIZE, 413,
												Short.MAX_VALUE))
						.addGroup(
								panelProgramaLayout
										.createSequentialGroup()
										.addComponent(jLabel10)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane10,
												GroupLayout.DEFAULT_SIZE, 413,
												Short.MAX_VALUE)));

		jScrollPanePrograma.setViewportView(panelPrograma);

		lblNombrePrograma.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombrePrograma.setText("NOMBRE PROGRAMA");
		lblNombrePrograma.setHorizontalTextPosition(SwingConstants.CENTER);

		btnCargarPrograma.setText("CARGAR PROGRAMA");
		btnCargarPrograma.setActionCommand(CARGAR_PROGRAMA);
		btnCargarPrograma.addActionListener(this);

		btnCargarConfig.setText("CARGAR CONFIG.");

		btnGuardarConfig.setText("GUARDAR CONFIG.");

		GroupLayout panelBotonesLayout = new GroupLayout(panelBotones);
		panelBotones.setLayout(panelBotonesLayout);
		panelBotonesLayout.setHorizontalGroup(panelBotonesLayout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(btnCargarPrograma, GroupLayout.DEFAULT_SIZE, 153,
						Short.MAX_VALUE)
				.addComponent(btnCargarConfig, GroupLayout.DEFAULT_SIZE,
						GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(btnGuardarConfig, GroupLayout.DEFAULT_SIZE,
						GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		panelBotonesLayout.setVerticalGroup(panelBotonesLayout
				.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
						GroupLayout.Alignment.TRAILING,
						panelBotonesLayout
								.createSequentialGroup()
								.addGap(0, 0, Short.MAX_VALUE)
								.addComponent(btnCargarPrograma)
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnCargarConfig)
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnGuardarConfig)));

		String opciones[] = { "hola", "mundo", "32" };
		lstMateriasPorVer = new JList(opciones);
		lstMateriasPorVer.setVisibleRowCount(1);
		lstMateriasPorVer.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		jScrollPaneMateriasPorVer.setViewportView(lstMateriasPorVer);

		lblMateriasPorVer.setHorizontalAlignment(SwingConstants.CENTER);
		lblMateriasPorVer.setText("MATERIAS POR VER");
		lblMateriasPorVer.setHorizontalTextPosition(SwingConstants.CENTER);

		GroupLayout containerLayout = new GroupLayout(container);
		container.setLayout(containerLayout);
		containerLayout
				.setHorizontalGroup(containerLayout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(
								GroupLayout.Alignment.TRAILING,
								containerLayout
										.createSequentialGroup()
										.addContainerGap(
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												containerLayout
														.createParallelGroup(
																GroupLayout.Alignment.TRAILING)
														.addComponent(
																panelMateriasVistas,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																panelBotones,
																GroupLayout.Alignment.LEADING,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												containerLayout
														.createParallelGroup(
																GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																lblNombrePrograma,
																GroupLayout.DEFAULT_SIZE,
																1138,
																Short.MAX_VALUE)
														.addGroup(
																containerLayout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING,
																				false)
																		.addComponent(
																				jScrollPanePrograma,
																				GroupLayout.DEFAULT_SIZE,
																				1138,
																				Short.MAX_VALUE)
																		.addComponent(
																				jScrollPaneMateriasPorVer)
																		.addComponent(
																				lblMateriasPorVer,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)))
										.addContainerGap()));
		containerLayout
				.setVerticalGroup(containerLayout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(
								containerLayout
										.createSequentialGroup()
										.addComponent(lblNombrePrograma,
												GroupLayout.PREFERRED_SIZE, 23,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												containerLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addComponent(
																panelMateriasVistas,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jScrollPanePrograma,
																GroupLayout.PREFERRED_SIZE,
																452,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(lblMateriasPorVer)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												containerLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																panelBotones,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPaneMateriasPorVer))
										.addContainerGap(
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(container, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(container, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		this.pack();
		this.setSize(new Dimension(1366, 660));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void configureProgramLabelsText() {
		ArrayList<Integer> periodoI = new ArrayList<Integer>();
		periodoI.add(Calendar.JANUARY);
		periodoI.add(Calendar.FEBRUARY);
		periodoI.add(Calendar.MARCH);
		periodoI.add(Calendar.APRIL);
		periodoI.add(Calendar.MAY);
		periodoI.add(Calendar.JUNE);
		ArrayList<Integer> periodoII = new ArrayList<Integer>();
		periodoII.add(Calendar.JULY);
		periodoII.add(Calendar.AUGUST);
		periodoII.add(Calendar.SEPTEMBER);
		periodoII.add(Calendar.OCTOBER);
		periodoII.add(Calendar.NOVEMBER);
		periodoII.add(Calendar.DECEMBER);

		if (periodoI.contains(Calendar.getInstance().get(Calendar.MONTH))) {
			jLabel1.setText(Integer.toString(Calendar.getInstance().get(
					Calendar.YEAR))
					+ " - " + "II");
		} else if (periodoII.contains(Calendar.getInstance().get(Calendar.MONTH))) {
			jLabel1.setText(Integer.toString(Calendar.getInstance().get(
					Calendar.YEAR) + 1)
					+ " - " + "I");
		}
		ArrayList<JLabel> labels = new ArrayList<JLabel>();
		labels.add(jLabel1);
		labels.add(jLabel2);
		labels.add(jLabel3);
		labels.add(jLabel4);
		labels.add(jLabel5);
		labels.add(jLabel6);
		labels.add(jLabel7);
		labels.add(jLabel8);
		labels.add(jLabel9);
		labels.add(jLabel10);
		String anoPeriodo[];
		for (int i = 1; i < labels.size(); i++) {
			anoPeriodo = labels.get(i - 1).getText().split(" - ");
			if (anoPeriodo[1].equals("I")) {
				labels.get(i).setText(anoPeriodo[0] + " - " + "II");
			} else if (anoPeriodo[1].equals("II")) {
				labels.get(i).setText((Integer.parseInt(anoPeriodo[0])+1) + " - " + "I");
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(CARGAR_PROGRAMA)) {
			FileManager fileManager= new FileManager(this.standardView.getPrograma());
			try {
				fileManager.readTxtFile();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("Error en la lectura del archivo");
			}
		}
	}
	
	public void setProgramTittle(String nombrePrograma){
		this.lblNombrePrograma.setText(nombrePrograma);
	}

}
