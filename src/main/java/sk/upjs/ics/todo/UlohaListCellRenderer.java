package sk.upjs.ics.todo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class UlohaListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> jlist, Object o, int i, boolean isSelected, boolean cellHasFocus) {
        Component component = super.getListCellRendererComponent(jlist, o, i, isSelected, cellHasFocus);
        Uloha uloha = (Uloha) o;
        if (jeSplnena(uloha) && !isSelected) {
            component.setBackground(Color.green);
        }
        return component;
    }

    private boolean jeSplnena(Uloha uloha) {
        return uloha.isSplnena();
    }

}
