package dam.y19_20.b.view;

import dam.y19_20.b.control.Controller;
import dam.y19_20.b.model.ListaRecetas;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class View extends JFrame implements WindowListener {
    private static String TITLE = "Aplicación recetas";
    private ListaRecetas listaRecetas;

    private JPanel jpMenu;
    private JMenuItem menuiConsultar;
    private JMenuItem menuiAdd;
    private JScrollPane jspMenu;

    public View(ListaRecetas listaRecetas) {
        setTitle(TITLE);
        setContentPane(jpMenu);
        pack();
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();

        this.listaRecetas = listaRecetas;
    }

    private void initComponents() {
    }

    public void setControlador(Controller controller) {
        addWindowListener(this);
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
