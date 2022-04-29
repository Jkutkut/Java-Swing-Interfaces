package dam.y21_22.e.control;

import dam.y21_22.e.view.mainMenu.View;
import dam.y21_22.e.view.addMenu.AddCorredor;
import dam.y21_22.e.view.seeCorredor.SeeCorredor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private View window;
    private AddCorredor addMenu;
    private SeeCorredor seeMenu;

    public Controller(View window, AddCorredor addMenu, SeeCorredor seeMenu) {
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
                System.out.println("Add");
                this.window.loadMenu(this.addMenu.getMenu());
            }
            else if (e.getSource() == this.window.getMenuiConsultar()) {
                this.window.loadMenu(this.seeMenu.getMenu());
            }
        }
    }
}
