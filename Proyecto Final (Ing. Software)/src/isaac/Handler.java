package isaac;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;

class Handler extends MouseAdapter {
	@Override
	public void mousePressed(MouseEvent e) {
		DragPanel p = (DragPanel) e.getSource();
		Component c = SwingUtilities.getDeepestComponentAt(p, e.getX(),
				e.getY());
		if (c != null && c instanceof MateriaLabel) {
			p.draggingLabel = (MateriaLabel) c;
			p.getTransferHandler().exportAsDrag(p, e, TransferHandler.MOVE);
		}
	}
}