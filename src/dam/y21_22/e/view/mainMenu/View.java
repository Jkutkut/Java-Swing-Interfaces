package dam.y21_22.e.view.mainMenu;

import dam.y21_22.e.control.Controller;
import dam.y21_22.e.model.ListaCorredores;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class View extends JFrame implements WindowListener {
    private static final String TITLE = "Madrid Rock & Roll";
    private ListaCorredores listaCorredores;

    private JPanel jpMenu;
    private JMenuItem menuiConsultar;
    private JMenuItem menuiAdd;
    private JScrollPane jspMenu;

    public View(ListaCorredores listaCorredores) {
        initComponents();
        this.listaCorredores = listaCorredores;
    }

    private void initComponents() {
        setTitle(TITLE);
        setContentPane(jpMenu);
        pack();
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);

        addWindowListener(this);
    }

    public void setControlador(Controller controller) {
        menuiAdd.addActionListener(controller);
        menuiConsultar.addActionListener(controller);
    }

    // SETTERS
    public void loadMenu(JPanel jpMenu) {
        jspMenu.setViewportView(jpMenu);
    }

    // GETTERS
    public JMenuItem getMenuiAdd() {
        return menuiAdd;
    }

    public JMenuItem getMenuiConsultar() {
        return menuiConsultar;
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        int i = JOptionPane.showConfirmDialog(
            this,
            "¿Estás seguro de que quieres salir?",
            "Salir",
            JOptionPane.YES_NO_OPTION
        );
        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
