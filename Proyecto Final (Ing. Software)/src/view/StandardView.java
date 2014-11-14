package view;

import view.Handler;
import view.LabelTransferHandler;
import view.MateriaLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import model.Materia;
import model.Model;
import model.Programa;
import controller.Controller;
import controller.StandardController;

public class StandardView extends View implements ActionListener, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9155756686110350212L;
	private StandardController controller;
	private Programa programa;
	private JFrame mainInterfaz;
	private FileManager fileManager;
	private ArrayList<Integer> periodoI;
	private ArrayList<Integer> periodoII;
	private ArrayList<JLabel> labelsPanelPrograma;
	private ArrayList<DragPanel> panelsPanelPrograma;
	private ArrayList<JScrollPane> scrollsPanelPrograma;

	private static final String CARGAR_PROGRAMA = "CARGAR PROGRAMA";
	private static final String CARGAR_CONFIG = "CARGAR CONFIG";
	private static final String GUARDAR_CONFIG = "GUARDAR CONFIG";
	private DragPanel panelListaMateriasVistas;
	private JPanel container;
	private JButton btnCargarPrograma;
	private JButton btnCargarConfig;
	private JButton btnGuardarConfig;
	private JLabel jLabel1;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JLabel lblMateriasVistas;
	private JLabel lblNombrePrograma;
	private JPanel panelBotones;
	private DragPanel panelL1;
	private DragPanel panelL10;
	private DragPanel panelL2;
	private DragPanel panelL3;
	private DragPanel panelL4;
	private DragPanel panelL5;
	private DragPanel panelL6;
	private DragPanel panelL7;
	private DragPanel panelL8;
	private DragPanel panelL9;
	private DragPanel panelMateriasPorVer;
	private DragPanel panelMateriasVistas;
	private JPanel panelPrograma;
	private JScrollPane jScrollPaneL1;
	private JScrollPane jScrollPaneL10;
	private JScrollPane jScrollPaneL2;
	private JScrollPane jScrollPaneL3;
	private JScrollPane jScrollPaneL4;
	private JScrollPane jScrollPaneL5;
	private JScrollPane jScrollPaneL6;
	private JScrollPane jScrollPaneL7;
	private JScrollPane jScrollPaneL8;
	private JScrollPane jScrollPaneL9;
	private JScrollPane jScrollPaneMateriasPorVer;
	private JScrollPane jScrollPaneMateriasVistas;
	private JScrollPane jScrollPanePrograma;

	private void initComponents() {
		mainInterfaz = new JFrame();
		fileManager = new FileManager(programa);
		container = new JPanel();
		panelMateriasVistas = new DragPanel();
		lblMateriasVistas = new JLabel();
		jScrollPaneMateriasVistas = new JScrollPane();
		panelListaMateriasVistas = new DragPanel();
		panelListaMateriasVistas.setName("vista");
		jScrollPanePrograma = new JScrollPane();
		panelPrograma = new JPanel();
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		jLabel5 = new JLabel();
		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		jLabel8 = new JLabel();
		jLabel9 = new JLabel();
		jLabel10 = new JLabel();
		jScrollPaneL1 = new JScrollPane();
		panelL1 = new DragPanel();
		jScrollPaneL2 = new JScrollPane();
		panelL2 = new DragPanel();
		panelL2.setName("p2");
		jScrollPaneL3 = new JScrollPane();
		panelL3 = new DragPanel();
		panelL3.setName("p3");
		jScrollPaneL4 = new JScrollPane();
		panelL4 = new DragPanel();
		panelL4.setName("p4");
		jScrollPaneL5 = new JScrollPane();
		panelL5 = new DragPanel();
		panelL5.setName("p5");
		jScrollPaneL6 = new JScrollPane();
		panelL6 = new DragPanel();
		panelL6.setName("p6");
		jScrollPaneL7 = new JScrollPane();
		panelL7 = new DragPanel();
		panelL7.setName("p7");
		jScrollPaneL8 = new JScrollPane();
		panelL8 = new DragPanel();
		panelL8.setName("p8");
		jScrollPaneL9 = new JScrollPane();
		panelL9 = new DragPanel();
		panelL9.setName("p9");
		jScrollPaneL10 = new JScrollPane();
		panelL10 = new DragPanel();
		panelL10.setName("p10");
		lblNombrePrograma = new JLabel();
		panelBotones = new JPanel();
		btnCargarPrograma = new JButton();
		btnCargarConfig = new JButton();
		btnGuardarConfig = new JButton();
		jScrollPaneMateriasPorVer = new JScrollPane();
		panelMateriasPorVer = new DragPanel();
		panelMateriasPorVer.setName("no");
		jLabel11 = new JLabel();

		labelsPanelPrograma = new ArrayList<JLabel>();
		labelsPanelPrograma.add(jLabel1);
		labelsPanelPrograma.add(jLabel2);
		labelsPanelPrograma.add(jLabel3);
		labelsPanelPrograma.add(jLabel4);
		labelsPanelPrograma.add(jLabel5);
		labelsPanelPrograma.add(jLabel6);
		labelsPanelPrograma.add(jLabel7);
		labelsPanelPrograma.add(jLabel8);
		labelsPanelPrograma.add(jLabel9);
		labelsPanelPrograma.add(jLabel10);

		panelsPanelPrograma = new ArrayList<DragPanel>();
		panelsPanelPrograma.add(panelL1);
		panelsPanelPrograma.add(panelL2);
		panelsPanelPrograma.add(panelL3);
		panelsPanelPrograma.add(panelL4);
		panelsPanelPrograma.add(panelL5);
		panelsPanelPrograma.add(panelL6);
		panelsPanelPrograma.add(panelL7);
		panelsPanelPrograma.add(panelL8);
		panelsPanelPrograma.add(panelL9);
		panelsPanelPrograma.add(panelL10);

		scrollsPanelPrograma = new ArrayList<JScrollPane>();
		scrollsPanelPrograma.add(jScrollPaneL1);
		scrollsPanelPrograma.add(jScrollPaneL2);
		scrollsPanelPrograma.add(jScrollPaneL3);
		scrollsPanelPrograma.add(jScrollPaneL4);
		scrollsPanelPrograma.add(jScrollPaneL5);
		scrollsPanelPrograma.add(jScrollPaneL6);
		scrollsPanelPrograma.add(jScrollPaneL7);
		scrollsPanelPrograma.add(jScrollPaneL8);
		scrollsPanelPrograma.add(jScrollPaneL9);
		scrollsPanelPrograma.add(jScrollPaneL10);
		/*--------------------------------------------------------------------------------------
			Configuration:
			- Panels: MouseListener - LabeltransferHandler - Panels Preferred size
			- Scrolls: setViewportView - balance HorizontalScrollBar - setHorizontalScrollBarPolicys
		*/
		MouseListener handler = new Handler();
		LabelTransferHandler th = new LabelTransferHandler();

		for (int i = 0; i < panelsPanelPrograma.size(); i++) {
			// Panel configuration
			panelsPanelPrograma.get(i).addMouseListener(handler);
			panelsPanelPrograma.get(i).setTransferHandler(th);
			panelsPanelPrograma.get(i).setPreferredSize(new Dimension(148, 1000));
			panelsPanelPrograma.get(i).setBackground(Color.WHITE);
			// Scrolls configuration
			scrollsPanelPrograma.get(i).setViewportView(panelsPanelPrograma.get(i));
			scrollsPanelPrograma.get(i).getHorizontalScrollBar().setValue(8);
			scrollsPanelPrograma.get(i).setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		}
		//--------------------------------------------------------------------------------------
		panelMateriasPorVer.addMouseListener(handler);
		panelListaMateriasVistas.addMouseListener(handler);

		panelMateriasPorVer.setTransferHandler(th);
		panelListaMateriasVistas.setTransferHandler(th);
		
		panelMateriasPorVer.setBackground(Color.WHITE);
		panelListaMateriasVistas.setBackground(Color.WHITE);
		
		jScrollPaneMateriasPorVer.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		jScrollPaneMateriasVistas.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		mainInterfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainInterfaz.setTitle("Program Manager 1.0");

		lblMateriasVistas.setHorizontalAlignment(SwingConstants.CENTER);
		lblMateriasVistas.setText("MATERIAS VISTAS");
		lblMateriasVistas.setHorizontalTextPosition(SwingConstants.CENTER);

		panelListaMateriasVistas.setPreferredSize(new Dimension(151, 10000));

		jScrollPaneMateriasVistas.setViewportView(panelListaMateriasVistas);

		GroupLayout panelMateriasVistasLayout = new GroupLayout(
				panelMateriasVistas);
		panelMateriasVistas.setLayout(panelMateriasVistasLayout);
		panelMateriasVistasLayout.setHorizontalGroup(panelMateriasVistasLayout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(lblMateriasVistas, GroupLayout.DEFAULT_SIZE,
						GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jScrollPaneMateriasVistas));
		panelMateriasVistasLayout.setVerticalGroup(panelMateriasVistasLayout
				.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
						panelMateriasVistasLayout
								.createSequentialGroup()
								.addComponent(lblMateriasVistas)
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPaneMateriasVistas,
										GroupLayout.PREFERRED_SIZE, 430,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		panelPrograma.setPreferredSize(new java.awt.Dimension(1692, 430));

		for (int i = 0; i < labelsPanelPrograma.size(); i++) {
			labelsPanelPrograma.get(i).setHorizontalAlignment(
					SwingConstants.CENTER);
		}

		configureProgramLabelsText(
				Integer.parseInt(configureTerms()[0].toString()),
				configureTerms()[1].toString());

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
																GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel1,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jScrollPaneL1))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel2,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jScrollPaneL2))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel3,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jScrollPaneL3))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel4,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jScrollPaneL4))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel5,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jScrollPaneL5))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel6,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jScrollPaneL6))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel7,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jScrollPaneL7))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel8,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jScrollPaneL8))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel9,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jScrollPaneL9))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel10,
																GroupLayout.PREFERRED_SIZE,
																150,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jScrollPaneL10,
																GroupLayout.DEFAULT_SIZE,
																150,
																Short.MAX_VALUE))
										.addGap(85, 85, 85)));
		panelProgramaLayout
				.setVerticalGroup(panelProgramaLayout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(
								panelProgramaLayout
										.createSequentialGroup()
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addGroup(
																panelProgramaLayout
																		.createParallelGroup(
																				GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel2)
																		.addComponent(
																				jLabel1))
														.addComponent(jLabel3)
														.addComponent(jLabel4)
														.addComponent(jLabel5)
														.addComponent(jLabel6)
														.addComponent(jLabel7)
														.addComponent(jLabel8)
														.addComponent(jLabel9)
														.addComponent(jLabel10))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panelProgramaLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPaneL1,
																GroupLayout.PREFERRED_SIZE,
																0,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPaneL2,
																GroupLayout.PREFERRED_SIZE,
																0,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPaneL3,
																GroupLayout.PREFERRED_SIZE,
																0,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPaneL4,
																GroupLayout.PREFERRED_SIZE,
																0,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPaneL5,
																GroupLayout.PREFERRED_SIZE,
																0,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPaneL6,
																GroupLayout.PREFERRED_SIZE,
																0,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPaneL7,
																GroupLayout.PREFERRED_SIZE,
																0,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPaneL8,
																GroupLayout.PREFERRED_SIZE,
																0,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPaneL9,
																GroupLayout.PREFERRED_SIZE,
																0,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPaneL10,
																GroupLayout.PREFERRED_SIZE,
																0,
																Short.MAX_VALUE))));

		jScrollPanePrograma.setViewportView(panelPrograma);

		lblNombrePrograma.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombrePrograma.setText("NOMBRE PROGRAMA");
		lblNombrePrograma.setHorizontalTextPosition(SwingConstants.CENTER);

		btnCargarPrograma.setText("CARGAR PROGRAMA");
		btnCargarPrograma.setActionCommand(CARGAR_PROGRAMA);
		btnCargarPrograma.addActionListener(this);

		btnCargarConfig.setText("CARGAR CONFIG.");
		btnCargarConfig.setActionCommand(CARGAR_CONFIG);
		btnCargarConfig.addActionListener(this);

		btnGuardarConfig.setText("GUARDAR CONFIG.");
		btnGuardarConfig.setActionCommand(GUARDAR_CONFIG);
		btnGuardarConfig.addActionListener(this);

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

		jScrollPaneMateriasPorVer.setViewportView(panelMateriasPorVer);

		jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel11.setText("MATERIAS POR VER");
		jLabel11.setHorizontalTextPosition(SwingConstants.CENTER);

		GroupLayout containerLayout = new GroupLayout(container);
		container.setLayout(containerLayout);
		containerLayout.setHorizontalGroup(containerLayout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				containerLayout
						.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(
								containerLayout
										.createParallelGroup(
												GroupLayout.Alignment.TRAILING)
										.addComponent(panelMateriasVistas,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(panelBotones,
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
										.addComponent(lblNombrePrograma,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jLabel11,
												GroupLayout.Alignment.LEADING,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												jScrollPaneMateriasPorVer,
												GroupLayout.DEFAULT_SIZE, 1138,
												Short.MAX_VALUE)
										.addComponent(jScrollPanePrograma,
												GroupLayout.PREFERRED_SIZE, 0,
												Short.MAX_VALUE))
						.addGap(559, 559, 559)));
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
																GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																panelMateriasVistas,
																GroupLayout.PREFERRED_SIZE,
																0,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPanePrograma,
																GroupLayout.DEFAULT_SIZE,
																452,
																Short.MAX_VALUE))
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel11)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												containerLayout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addComponent(
																panelBotones,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jScrollPaneMateriasPorVer,
																GroupLayout.PREFERRED_SIZE,
																91,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		GroupLayout layout = new GroupLayout(mainInterfaz.getContentPane());
		mainInterfaz.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(container, GroupLayout.PREFERRED_SIZE,
								1330, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(container, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		
		jScrollPaneMateriasVistas.getHorizontalScrollBar().setValue(7);
		
		mainInterfaz.pack();
		mainInterfaz.setSize(new Dimension(1362, 660));
		mainInterfaz.setLocationRelativeTo(null);
		mainInterfaz.setResizable(false);
		mainInterfaz.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(CARGAR_PROGRAMA)) {
			try {
				Programa programa = fileManager.readTxtFile();
				controller.changeProgramParameters(
						programa.getNombrePrograma(), programa.getMaterias(),
						programa.getDescripcion());
			} catch (Exception e1) {

			}
		}
		if (e.getActionCommand().equals(GUARDAR_CONFIG)) {
			controller.saveProgram();
		}
		if (e.getActionCommand().equals(CARGAR_CONFIG)) {
			controller.loadProgram();

		}
	}

	public Object[] configureTerms() {
		Object[] dummy = new Object[2];
		periodoI = new ArrayList<Integer>();
		periodoI.add(Calendar.JANUARY);
		periodoI.add(Calendar.FEBRUARY);
		periodoI.add(Calendar.MARCH);
		periodoI.add(Calendar.APRIL);
		periodoI.add(Calendar.MAY);
		periodoI.add(Calendar.JUNE);

		periodoII = new ArrayList<Integer>();
		periodoII.add(Calendar.JULY);
		periodoII.add(Calendar.AUGUST);
		periodoII.add(Calendar.SEPTEMBER);
		periodoII.add(Calendar.OCTOBER);
		periodoII.add(Calendar.NOVEMBER);
		periodoII.add(Calendar.DECEMBER);

		if (periodoI.contains(Calendar.getInstance().get(Calendar.MONTH))) {
			dummy[0] = Integer.toString(Calendar.getInstance().get(
					Calendar.YEAR));
			dummy[1] = "II";
		} else {
			dummy[0] = Integer.toString(Calendar.getInstance().get(
					Calendar.YEAR) + 1);
			dummy[1] = "I";
		}
		return dummy;
	}

	public void configureProgramLabelsText(int year, String term) {
		jLabel1.setText(year + " - " + term);
		panelL1.setName(year + " - " + term);
		String anoPeriodo[];
		for (int i = 1; i < labelsPanelPrograma.size(); i++) {
			anoPeriodo = labelsPanelPrograma.get(i - 1).getText().split(" - ");
			if (anoPeriodo[1].equals("I")) {
				labelsPanelPrograma.get(i)
						.setText(anoPeriodo[0] + " - " + "II");
				panelsPanelPrograma.get(i)
						.setName(anoPeriodo[0] + " - " + "II");
			} else if (anoPeriodo[1].equals("II")) {
				labelsPanelPrograma.get(i).setText(
						(Integer.parseInt(anoPeriodo[0]) + 1) + " - " + "I");
				panelsPanelPrograma.get(i).setName(
						(Integer.parseInt(anoPeriodo[0]) + 1) + " - " + "I");
			}
		}
	}

	public void setProgramTittle(String nombrePrograma) {
		lblNombrePrograma.setText(nombrePrograma);
	}

	public void start(Controller c, Model m) {
		this.controller = (StandardController) c;
		this.programa = (Programa) m;
		initComponents();
	}

	public void refresh() {
		repaintPanels();

	}

	public void refreshMaterias(List<Materia> materias) {
		repaintPanels();
		for (Materia materiaTemp : materias) {
			panelMateriasPorVer.add(new MateriaLabel(materiaTemp));
		}
	}

	public void repaintPanels() {
		for (int i = 0; i < panelsPanelPrograma.size(); i++) {
			panelsPanelPrograma.get(i).removeAll();
			panelsPanelPrograma.get(i).repaint();
		}
		panelMateriasPorVer.repaint();
		panelMateriasPorVer.removeAll();
		panelListaMateriasVistas.removeAll();
		panelListaMateriasVistas.repaint();
		panelMateriasPorVer.setVisible(false);
		panelMateriasPorVer.setVisible(true);
	}

	public void saveProgram(Model model) {
		fileManager = new FileManager(programa);
		try {
			fileManager.saveSerialFile();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void loadProgram() {
		fileManager = new FileManager(programa);
		try {
			Programa programa = fileManager.loadSerialFile();
			this.programa.setDescripcion(programa.getDescripcion());
			this.programa.setNombrePrograma(programa.getNombrePrograma());
			this.programa.setMaterias(programa.getMaterias());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		repaintPanels();
		/*--------------------------------------------------------------------------------------
			Labels configuration
		 */
		int year = 0;
		ArrayList<Integer> auxY = new ArrayList<Integer>();
		for (int i = 0; i < this.programa.getMaterias().size(); i++) {
			if (this.programa.getMaterias().get(i).getEstado().getAño() != 0) {
				auxY.add(this.programa.getMaterias().get(i).getEstado()
						.getAño());
			}
		}
		Collections.sort(auxY);
		year = auxY.get(0);

		ArrayList<String> auxT = new ArrayList<String>();
		for (int i = 0; i < this.programa.getMaterias().size(); i++) {
			if (this.programa.getMaterias().get(i).getEstado().getAño() == year) {
				if (this.programa.getMaterias().get(i).getEstado().getPeriodo()
						.toString().equals("I")) {
					auxT.add("I");
				} else if (this.programa.getMaterias().get(i).getEstado()
						.getPeriodo().toString().equals("II")) {
					auxT.add("II");
				}
			}
		}
		Collections.sort(auxT);
		configureProgramLabelsText(year, auxT.get(0));
		//--------------------------------------------------------------------------------------
		/*
			Reubicando Materias
		 */
		String anoPeriodo;
		Materia dummyMateria;
		for (int i = 0; i < this.programa.getMaterias().size(); i++) {
			dummyMateria = this.programa.getMaterias().get(i);
			if (dummyMateria.getEstado().getEstado().toString().equals("VISTA")) {
				panelListaMateriasVistas.add(new MateriaLabel(dummyMateria));
			} else if (dummyMateria.getEstado().getEstado().toString().equals("NO VISTA")) {
				panelMateriasPorVer.add(new MateriaLabel(dummyMateria));
			} else {
				for (int j = 0; j < panelsPanelPrograma.size(); j++) {
					anoPeriodo=""+dummyMateria.getEstado().getAño()+" - "+dummyMateria.getEstado().getPeriodo();
					if (anoPeriodo.equals(panelsPanelPrograma.get(j).getName())) {
						panelsPanelPrograma.get(j).add(new MateriaLabel(dummyMateria));
					}
				}
			}
		}
		//--------------------------------------------------------------------------------------
		/*
			Cambiando nombre del programa
		 */
		setProgramTittle(this.programa.getNombrePrograma());
		
	}

	public JFrame getMainInterfaz() {
		return mainInterfaz;
	}
}
