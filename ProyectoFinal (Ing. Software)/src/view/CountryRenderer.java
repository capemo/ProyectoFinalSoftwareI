package view;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import model.Materia;

/**
 * Custom renderer to display a country's flag alongside its name
 *
 * @author wwww.codejava.net
 */
public class CountryRenderer extends JLabel implements ListCellRenderer<Materia> {

    public CountryRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Materia> list, Materia materia, int index,
            boolean isSelected, boolean cellHasFocus) {

        String code = materia.getIdMateria();
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/" + code + ".png"));

        setIcon(imageIcon);
        setText(materia.getNombreMateria());

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        return this;
    }
}
