package dam.jdbc.loginScreen1.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dam.jdbc.loginScreen1.view.View;

public class Controller implements ActionListener {
    private View window;

    public Controller(View window) {
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() instanceof JButton) {
    }
}
