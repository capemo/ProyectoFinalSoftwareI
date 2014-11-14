package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceMotionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.activation.ActivationDataFlavor;
import javax.activation.DataHandler;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;

import model.Materia;
import model.Estado;
import model.Periodo;

class LabelTransferHandler extends TransferHandler {
	private static final long serialVersionUID = 4446572656829372348L;
	private final DataFlavor localObjectFlavor;
	@SuppressWarnings("serial")
	private final MateriaLabel label = new MateriaLabel() {
		@Override
		public boolean contains(int x, int y) {
			return false;
		}
	};
	private final JWindow window = new JWindow();

	public LabelTransferHandler() {
		localObjectFlavor = new ActivationDataFlavor(DragPanel.class,
				DataFlavor.javaJVMLocalObjectMimeType, "JLabel");
		window.add(label);
		window.setAlwaysOnTop(true);
		window.setBackground(new Color(0, true));
		window.setPreferredSize(new Dimension(130,60));
		DragSource.getDefaultDragSource().addDragSourceMotionListener(
				new DragSourceMotionListener() {
					@Override
					public void dragMouseMoved(DragSourceDragEvent dsde) {
						Point pt = dsde.getLocation();
						pt.translate(5, 5);
						window.setLocation(pt);
					}
				});
	}

	@Override
	protected Transferable createTransferable(JComponent c) {
		System.out.println("createTransferable");
		DragPanel p = (DragPanel) c;
		MateriaLabel l = p.draggingLabel;
		String text = l.getText();

		final DataHandler dh = new DataHandler(c,
				localObjectFlavor.getMimeType());
		if (text == null)
			return dh;
		final StringSelection ss = new StringSelection(text + "\n");
		return new Transferable() {
			@Override
			public DataFlavor[] getTransferDataFlavors() {
				ArrayList<DataFlavor> list = new ArrayList<>();
				for (DataFlavor f : ss.getTransferDataFlavors()) {
					list.add(f);
				}
				for (DataFlavor f : dh.getTransferDataFlavors()) {
					list.add(f);
				}
				return list.toArray(dh.getTransferDataFlavors());
			}

			public boolean isDataFlavorSupported(DataFlavor flavor) {
				for (DataFlavor f : getTransferDataFlavors()) {
					if (flavor.equals(f)) {
						return true;
					}
				}
				return false;
			}

			public Object getTransferData(DataFlavor flavor)
					throws UnsupportedFlavorException, IOException {
				if (flavor.equals(localObjectFlavor)) {
					return dh.getTransferData(flavor);
				} else {
					return ss.getTransferData(flavor);
				}
			}
		};
	}

	@Override
	public boolean canImport(TransferSupport support) {
		if (!support.isDrop()) {
			return false;
		}
		return true;
	}

	@Override
	public int getSourceActions(JComponent c) {
		System.out.println("getSourceActions");
		DragPanel p = (DragPanel) c;
		label.setIcon(p.draggingLabel.getIcon());
		label.setText(p.draggingLabel.getText());
		label.setHorizontalAlignment(SwingConstants.CENTER);
		window.pack();
		Point pt = p.draggingLabel.getLocation();
		SwingUtilities.convertPointToScreen(pt, p);
		window.setLocation(pt);
		window.setVisible(true);
		return MOVE;
	}

	@Override
	public boolean importData(TransferSupport support) {
		System.out.println("importData");
		if (!canImport(support))
			return false;
		DragPanel target = (DragPanel) support.getComponent();
		try {
			DragPanel src = (DragPanel) support.getTransferable()
					.getTransferData(localObjectFlavor);
			MateriaLabel l = new MateriaLabel();
			l=src.draggingLabel;
			if(!target.getName().equals("vista")){
				if(!target.getName().equals("no")){
				if(invalido(l.getMateria(),target.getName())) return false;
				else{
					l.getMateria().getEstado().setAño(Integer.valueOf(target.getName().substring(0,target.getName().indexOf("-")).trim()));
					if(target.getName().substring(target.getName().indexOf("-")+1).trim().equals("I"))
					l.getMateria().getEstado().setPeriodo(Periodo.I);
					else
						l.getMateria().getEstado().setPeriodo(Periodo.II);
					l.getMateria().getEstado().setEstado(Estado.ASIGNADA);
				}
				}else{
					return false;
				}
			}else{
				l.getMateria().getEstado().setEstado(Estado.VISTA);
			}
			target.add(l);
			target.revalidate();
			target.repaint();
			return true;
		} catch (UnsupportedFlavorException ufe) {
			ufe.printStackTrace();
		} catch (java.io.IOException ioe) {
			ioe.printStackTrace();
		}
		return false;
	}

	@Override
	protected void exportDone(JComponent c, Transferable data, int action) {
		System.out.println("exportDone");
		DragPanel src = (DragPanel) c;
		if (action == TransferHandler.MOVE) {
			src.remove(src.draggingLabel);
			src.revalidate();
			src.repaint();
		}
		src.draggingLabel = null;
		window.setVisible(false);
	}
	
	private boolean invalido(Materia ma, String o){
		int ano=Integer.valueOf(o.substring(0,o.indexOf("-")).trim());
		String per=o.substring(o.indexOf("-")+1).trim();
		for(Materia mat:ma.getPreRequicitos()){
			if(mat.getEstado().getEstado().equals(Estado.NO_VISTA)){
				JOptionPane.showMessageDialog(null, "No se a visto la materia "+mat.getNombreMateria());
				return true;
				}
			if(mat.getEstado().getEstado().equals(Estado.ASIGNADA)){
				if(mat.getEstado().getAño()>ano){
					JOptionPane.showMessageDialog(null, "La materia "+mat.getNombreMateria()+" debe verse antes");
					return true;
				}else{
					if(mat.getEstado().getAño()==ano){
						if(!(mat.getEstado().getPeriodo().equals(Periodo.I)&&per.equals("II"))){
							JOptionPane.showMessageDialog(null, "La materia "+mat.getNombreMateria()+" debe verse antes");
							return true;}
					}
				}
			}
		}
		return false;
	}
}