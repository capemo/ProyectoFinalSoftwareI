package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

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
	private JPanel PanelListaMateriasVistas;
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
    private JPanel panelL1;
    private JPanel panelL10;
    private JPanel panelL2;
    private JPanel panelL3;
    private JPanel panelL4;
    private JPanel panelL5;
    private JPanel panelL6;
    private JPanel panelL7;
    private JPanel panelL8;
    private JPanel panelL9;
    private JPanel panelMateriasPorVer;
    private JPanel panelMateriasVistas;
    private JPanel panelPrograma;

	private void initComponents() {
		mainInterfaz=new JFrame();
        container = new JPanel();
        panelMateriasVistas = new JPanel();
        lblMateriasVistas = new JLabel();
        jScrollPaneMateriasVistas = new JScrollPane();
        PanelListaMateriasVistas = new JPanel();
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
        panelL1 = new JPanel();
        jScrollPaneL2 = new JScrollPane();
        panelL2 = new JPanel();
        jScrollPaneL3 = new JScrollPane();
        panelL3 = new JPanel();
        jScrollPaneL4 = new JScrollPane();
        panelL4 = new JPanel();
        jScrollPaneL5 = new JScrollPane();
        panelL5 = new JPanel();
        jScrollPaneL6 = new JScrollPane();
        panelL6 = new JPanel();
        jScrollPaneL7 = new JScrollPane();
        panelL7 = new JPanel();
        jScrollPaneL8 = new JScrollPane();
        panelL8 = new JPanel();
        jScrollPaneL9 = new JScrollPane();
        panelL9 = new JPanel();
        jScrollPaneL10 = new JScrollPane();
        panelL10 = new JPanel();
        lblNombrePrograma = new JLabel();
        panelBotones = new JPanel();
        btnCargarPrograma = new JButton();
        btnCargarConfig = new JButton();
        btnGuardarConfig = new JButton();
        jScrollPaneMateriasPorVer = new JScrollPane();
        panelMateriasPorVer = new JPanel();
        jLabel11 = new JLabel();
        
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

        mainInterfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainInterfaz.setTitle("Program Manager 1.0");

        lblMateriasVistas.setHorizontalAlignment(SwingConstants.CENTER);
        lblMateriasVistas.setText("MATERIAS VISTAS");
        lblMateriasVistas.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout PanelListaMateriasVistasLayout = new GroupLayout(PanelListaMateriasVistas);
        PanelListaMateriasVistas.setLayout(PanelListaMateriasVistasLayout);
        PanelListaMateriasVistasLayout.setHorizontalGroup(
            PanelListaMateriasVistasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
        );
        PanelListaMateriasVistasLayout.setVerticalGroup(
            PanelListaMateriasVistasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );

        jScrollPaneMateriasVistas.setViewportView(PanelListaMateriasVistas);

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
                .addComponent(jScrollPaneMateriasVistas, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE)
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
        
        GroupLayout panelL1Layout = new GroupLayout(panelL1);
        panelL1.setLayout(panelL1Layout);
        panelL1Layout.setHorizontalGroup(
            panelL1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        panelL1Layout.setVerticalGroup(
            panelL1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jScrollPaneL1.setViewportView(panelL1);

        GroupLayout panelL2Layout = new GroupLayout(panelL2);
        panelL2.setLayout(panelL2Layout);
        panelL2Layout.setHorizontalGroup(
            panelL2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        panelL2Layout.setVerticalGroup(
            panelL2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jScrollPaneL2.setViewportView(panelL2);

        GroupLayout panelL3Layout = new GroupLayout(panelL3);
        panelL3.setLayout(panelL3Layout);
        panelL3Layout.setHorizontalGroup(
            panelL3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        panelL3Layout.setVerticalGroup(
            panelL3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jScrollPaneL3.setViewportView(panelL3);

        GroupLayout panelL4Layout = new GroupLayout(panelL4);
        panelL4.setLayout(panelL4Layout);
        panelL4Layout.setHorizontalGroup(
            panelL4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        panelL4Layout.setVerticalGroup(
            panelL4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jScrollPaneL4.setViewportView(panelL4);

        GroupLayout panelL5Layout = new GroupLayout(panelL5);
        panelL5.setLayout(panelL5Layout);
        panelL5Layout.setHorizontalGroup(
            panelL5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        panelL5Layout.setVerticalGroup(
            panelL5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jScrollPaneL5.setViewportView(panelL5);

        GroupLayout panelL6Layout = new GroupLayout(panelL6);
        panelL6.setLayout(panelL6Layout);
        panelL6Layout.setHorizontalGroup(
            panelL6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        panelL6Layout.setVerticalGroup(
            panelL6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jScrollPaneL6.setViewportView(panelL6);

        GroupLayout panelL7Layout = new GroupLayout(panelL7);
        panelL7.setLayout(panelL7Layout);
        panelL7Layout.setHorizontalGroup(
            panelL7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        panelL7Layout.setVerticalGroup(
            panelL7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jScrollPaneL7.setViewportView(panelL7);

        GroupLayout panelL8Layout = new GroupLayout(panelL8);
        panelL8.setLayout(panelL8Layout);
        panelL8Layout.setHorizontalGroup(
            panelL8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        panelL8Layout.setVerticalGroup(
            panelL8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jScrollPaneL8.setViewportView(panelL8);

        GroupLayout panelL9Layout = new GroupLayout(panelL9);
        panelL9.setLayout(panelL9Layout);
        panelL9Layout.setHorizontalGroup(
            panelL9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        panelL9Layout.setVerticalGroup(
            panelL9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jScrollPaneL9.setViewportView(panelL9);

        GroupLayout panelL10Layout = new GroupLayout(panelL10);
        panelL10.setLayout(panelL10Layout);
        panelL10Layout.setHorizontalGroup(
            panelL10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        panelL10Layout.setVerticalGroup(
            panelL10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

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
                    .addComponent(jScrollPaneL1, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
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

        GroupLayout panelMateriasPorVerLayout = new GroupLayout(panelMateriasPorVer);
        panelMateriasPorVer.setLayout(panelMateriasPorVerLayout);
        panelMateriasPorVerLayout.setHorizontalGroup(
            panelMateriasPorVerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 2000, Short.MAX_VALUE)
        );
        panelMateriasPorVerLayout.setVerticalGroup(
            panelMateriasPorVerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
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
		mainInterfaz.setVisible(false);
		mainInterfaz.setVisible(true);
	}

}
