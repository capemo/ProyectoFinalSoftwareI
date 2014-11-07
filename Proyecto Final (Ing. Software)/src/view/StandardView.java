package view;

import view.Handler;
import view.LabelTransferHandler;
import view.MateriaLabel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.ScrollPaneLayout;
import javax.swing.SwingConstants;

import model.Materia;
import model.Model;
import model.Programa;
import controller.Controller;
import controller.StandardController;

public class StandardView extends View implements ActionListener{
	private StandardController controller;
	private Programa programa;
	private JFrame mainInterfaz;

	private static final String CARGAR_PROGRAMA="CARGAR PROGRAMA";
	private static final String CARGAR_CONFIG="CARGAR CONFIG";
	private static final String GUARDAR_CONFIG="GUARDAR CONFIG";
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
    private JPanel panelMateriasVistas; 
    private JPanel panelPrograma;

    
    
	private void initComponents() {
		mainInterfaz=new JFrame();
        container = new JPanel();
        panelMateriasVistas = new JPanel();
        lblMateriasVistas = new JLabel();
        jScrollPaneMateriasVistas = new JScrollPane();
        panelListaMateriasVistas = new DragPanel();
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
        jScrollPaneL3 = new JScrollPane();
        panelL3 = new DragPanel();
        jScrollPaneL4 = new JScrollPane();
        panelL4 = new DragPanel();
        jScrollPaneL5 = new JScrollPane();
        panelL5 = new DragPanel();
        jScrollPaneL6 = new JScrollPane();
        panelL6 = new DragPanel();
        jScrollPaneL7 = new JScrollPane();
        panelL7 = new DragPanel();
        jScrollPaneL8 = new JScrollPane();
        panelL8 = new DragPanel();
        jScrollPaneL9 = new JScrollPane();
        panelL9 = new DragPanel();
        jScrollPaneL10 = new JScrollPane();
        panelL10 = new DragPanel();
        lblNombrePrograma = new JLabel();
        panelBotones = new JPanel();
        btnCargarPrograma = new JButton();
        btnCargarConfig = new JButton();
        btnGuardarConfig = new JButton();
        jScrollPaneMateriasPorVer = new JScrollPane();
        panelMateriasPorVer = new DragPanel();
        jLabel11 = new JLabel();
        
        MouseListener handler = new Handler();
        LabelTransferHandler th = new LabelTransferHandler();
        panelL1.addMouseListener(handler);
        panelL10.addMouseListener(handler);
        panelL2.addMouseListener(handler);
        panelL3.addMouseListener(handler);
        panelL4.addMouseListener(handler);
        panelL5.addMouseListener(handler);
        panelL6.addMouseListener(handler);
        panelL7.addMouseListener(handler);
        panelL8.addMouseListener(handler);
        panelL9.addMouseListener(handler);
        panelMateriasPorVer.addMouseListener(handler);
        panelListaMateriasVistas.addMouseListener(handler); 

        panelL1.setTransferHandler(th);
        panelL10.setTransferHandler(th);
        panelL2.setTransferHandler(th);
        panelL3.setTransferHandler(th);
        panelL4.setTransferHandler(th);
        panelL5.setTransferHandler(th);
        panelL6.setTransferHandler(th);
        panelL7.setTransferHandler(th);
        panelL8.setTransferHandler(th);
        panelL9.setTransferHandler(th);
        panelMateriasPorVer.setTransferHandler(th);
        panelListaMateriasVistas.setTransferHandler(th); 

        mainInterfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainInterfaz.setTitle("Program Manager 1.0");

        lblMateriasVistas.setHorizontalAlignment(SwingConstants.CENTER);
        lblMateriasVistas.setText("MATERIAS VISTAS");
        lblMateriasVistas.setHorizontalTextPosition(SwingConstants.CENTER);

        panelListaMateriasVistas.setPreferredSize(new Dimension(151,2000));     

        jScrollPaneMateriasVistas.setViewportView(panelListaMateriasVistas);

        GroupLayout panelMateriasVistasLayout = new GroupLayout(panelMateriasVistas);
        panelMateriasVistas.setLayout(panelMateriasVistasLayout);
        panelMateriasVistasLayout.setHorizontalGroup(
            panelMateriasVistasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(lblMateriasVistas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPaneMateriasVistas)
        );
        panelMateriasVistasLayout.setVerticalGroup(
            panelMateriasVistasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriasVistasLayout.createSequentialGroup()
                .addComponent(lblMateriasVistas)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneMateriasVistas, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrograma.setPreferredSize(new java.awt.Dimension(1692, 430));

        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);

        configureProgramLabelsText();
        panelL1.setPreferredSize(new Dimension(148,1000));
        panelL2.setPreferredSize(new Dimension(148,1000));
        panelL2.setPreferredSize(new Dimension(148,1000));
        panelL3.setPreferredSize(new Dimension(148,1000));
        panelL4.setPreferredSize(new Dimension(148,1000));
        panelL5.setPreferredSize(new Dimension(148,1000));
        panelL6.setPreferredSize(new Dimension(148,1000));
        panelL7.setPreferredSize(new Dimension(148,1000));
        panelL8.setPreferredSize(new Dimension(148,1000));
        panelL9.setPreferredSize(new Dimension(148,1000));
        panelL10.setPreferredSize(new Dimension(148,1000));
        
        jScrollPaneL1.setViewportView(panelL1);
        jScrollPaneL2.setViewportView(panelL2);
        jScrollPaneL3.setViewportView(panelL3);
        jScrollPaneL4.setViewportView(panelL4);
        jScrollPaneL5.setViewportView(panelL5);
        jScrollPaneL6.setViewportView(panelL6);
        jScrollPaneL7.setViewportView(panelL7);
        jScrollPaneL8.setViewportView(panelL8);
        jScrollPaneL9.setViewportView(panelL9);
        jScrollPaneL10.setViewportView(panelL10);

        GroupLayout panelProgramaLayout = new GroupLayout(panelPrograma);
        panelPrograma.setLayout(panelProgramaLayout);
        panelProgramaLayout.setHorizontalGroup(
            panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelProgramaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneL1))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL3))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL4))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneL5))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL6))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL7))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL8))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL9))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL10, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(85, 85, 85))
        );
        panelProgramaLayout.setVerticalGroup(
            panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelProgramaLayout.createSequentialGroup()
                .addGroup(panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneL1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL3, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL4, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL5, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL6, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL7, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL8, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL9, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPaneL10, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

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
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(btnCargarPrograma, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
            .addComponent(btnCargarConfig, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGuardarConfig, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCargarPrograma)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCargarConfig)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarConfig))
        );
        
        jScrollPaneMateriasPorVer.setViewportView(panelMateriasPorVer);

        jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel11.setText("MATERIAS POR VER");
        jLabel11.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout containerLayout = new GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(panelMateriasVistas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBotones, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNombrePrograma, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneMateriasPorVer, GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
                    .addComponent(jScrollPanePrograma, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(559, 559, 559))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(lblNombrePrograma, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMateriasVistas, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPanePrograma, GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(panelBotones, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneMateriasPorVer, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(mainInterfaz.getContentPane());
        mainInterfaz.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container, GroupLayout.PREFERRED_SIZE, 1330, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        jScrollPaneL1.getHorizontalScrollBar().setValue(8);
        jScrollPaneL10.getHorizontalScrollBar().setValue(8);
        jScrollPaneL2.getHorizontalScrollBar().setValue(8);
        jScrollPaneL3.getHorizontalScrollBar().setValue(8);
        jScrollPaneL4.getHorizontalScrollBar().setValue(8);
        jScrollPaneL5.getHorizontalScrollBar().setValue(8);
        jScrollPaneL6.getHorizontalScrollBar().setValue(8);
        jScrollPaneL7.getHorizontalScrollBar().setValue(8);
        jScrollPaneL8.getHorizontalScrollBar().setValue(8);
        jScrollPaneL9.getHorizontalScrollBar().setValue(8);
        jScrollPaneMateriasVistas.getHorizontalScrollBar().setValue(7);
        
        jScrollPaneL1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneL2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneL3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneL4.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneL5.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneL6.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneL7.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneL8.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneL9.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneL10.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneMateriasPorVer.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        jScrollPaneMateriasVistas.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
		mainInterfaz.pack();
		mainInterfaz.setSize(new Dimension(1362, 660));
		mainInterfaz.setLocationRelativeTo(null);
		mainInterfaz.setResizable(false);
		mainInterfaz.setVisible(true);
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
			FileManager fileManager= new FileManager();
			try {
				Programa programa=fileManager.readTxtFile();
				controller.solicitarCambioParametros(programa.getNombrePrograma(), programa.getMaterias(), programa.getDescripcion());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("Error en la lectura del archivo");
			}
		}
	}
	
	public void setProgramTittle(String nombrePrograma){
		lblNombrePrograma.setText(nombrePrograma);
	}

	public void start(Controller c, Model m) {
		this.controller = (StandardController) c;
		this.programa = (Programa) m;
		initComponents();
	}

	public void refresh() {

	}

	public void refreshMaterias(List<Materia> materias) {
		panelL1.removeAll();
		panelL2.removeAll();
		panelL3.removeAll();
		panelL4.removeAll();
		panelL5.removeAll();
		panelL6.removeAll();
		panelL7.removeAll();
		panelL8.removeAll();
		panelL9.removeAll();
		panelL10.removeAll();
		panelL1.repaint();
		panelL2.repaint();
		panelL3.repaint();
		panelL4.repaint();
		panelL5.repaint();
		panelL6.repaint();
		panelL7.repaint();
		panelL8.repaint();
		panelL9.repaint();
		panelL10.repaint();
		panelMateriasPorVer.removeAll();
		panelListaMateriasVistas.removeAll();
		for (Materia materiaTemp:materias) {
			panelMateriasPorVer.add(new MateriaLabel(materiaTemp));
		}	
	}

}
