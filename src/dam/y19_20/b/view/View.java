package dam.y19_20.b.view;

import dam.y19_20.b.control.Controller;
import dam.y19_20.b.model.ListaRecetas;
import dam.y19_20.b.view.addReceta.AddReceta;

import javax.swing.*;

public class View extends JFrame {
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
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();

        this.listaRecetas = listaRecetas;
    }

    private void initComponents() {
    }

    public void setControlador(Controller controller) {
//        addwindowListener(controller); // Map exit

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
}
