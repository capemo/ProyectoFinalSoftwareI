package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;

import model.Materia;

public class MateriaCellRender extends JLabel implements ListCellRenderer<Materia>{

	private static final long serialVersionUID = 1L;

	@Override
	public Component getListCellRendererComponent(
			JList<? extends Materia> list, Materia materia, int index,
			boolean isSelected, boolean cellHasFocus) {
		 setText("<html>"+materia.getIdMateria()+"<br>"+materia.getNombreMateria()+"<br>"+materia.getCreditos()+"</html>");
		 setHorizontalAlignment(SwingConstants.CENTER);
		 setBorder(BorderFactory.createLineBorder(Color.BLACK));
		 
		 setPreferredSize(new Dimension(100,100));
         Color background;
         Color foreground;

         // check if this cell represents the current DnD drop location
         JList.DropLocation dropLocation = list.getDropLocation();
         if (dropLocation != null
                 && !dropLocation.isInsert()
                 && dropLocation.getIndex() == index) {

             background = Color.BLUE;
             foreground = Color.WHITE;

         // check if this cell is selected
         } else if (isSelected) {
             background = Color.RED;
             foreground = Color.RED;

         // unselected, and not the DnD drop location
         } else {
             background = Color.WHITE;
             foreground = Color.BLACK;
         };

         setBackground(background);
         setForeground(foreground);

         return this;
	}

}
