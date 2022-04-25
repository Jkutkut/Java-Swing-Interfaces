package dam.y19_20.b.control;

import dam.y19_20.b.view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private View window;

    public Controller(View window) {
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            this.window.test();
        }
        else if (e.getSource() instanceof JMenuItem) {
            if (e.getSource() == this.window.getMenuiAdd()) {
                this.window.openAddMenu();
            }
            else if (e.getSource() == this.window.getMenuiConsultar()) {
                this.window.openConsultMenu();
            }
        }
    }
}
