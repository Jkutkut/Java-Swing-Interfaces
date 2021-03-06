package dam.y19_20.b.control;

import dam.y19_20.b.view.View;
import dam.y19_20.b.view.addReceta.AddReceta;
import dam.y19_20.b.view.seeReceta.SeeReceta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private View window;
    private AddReceta addMenu;
    private SeeReceta seeMenu;

    public Controller(View window, AddReceta addMenu, SeeReceta seeMenu) {
        this.window = window;
        this.addMenu = addMenu;
        this.seeMenu = seeMenu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            if (e.getSource() == this.addMenu.getBtnFormAdd()) {
                this.addMenu.submitForm();
            }
            else if (e.getSource() == this.seeMenu.getBtnUpdate()) {
                this.seeMenu.updateTable();
            }
        }
        else if (e.getSource() instanceof JMenuItem) {
            if (e.getSource() == this.window.getMenuiAdd()) {
                this.window.loadMenu(this.addMenu.getMenu());
            }
            else if (e.getSource() == this.window.getMenuiConsultar()) {
                this.window.loadMenu(this.seeMenu.getMenu());
            }
        }
    }
}
