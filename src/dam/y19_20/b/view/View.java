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

    private AddReceta menuAdd;

    public View() {
        setTitle(TITLE);
        setContentPane(jpMenu);
        pack();
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();

        listaRecetas = new ListaRecetas();
    }

    private void initComponents() {
        menuAdd = new AddReceta(this.listaRecetas);
    }

    public void setControlador(Controller controller) {
//        addwindowListener(controller); // Map exit

        menuiAdd.addActionListener(controller);
        menuiConsultar.addActionListener(controller);

        menuAdd.setControlador(controller);

        openAddMenu(); // TODO
    }

    // SETTERS
    public void openAddMenu() {
        jspMenu.setViewportView(menuAdd.getJpMenu());
        menuAdd.resetForm();
    }

    public void openConsultMenu() {
    }

    // GETTERS

    public JMenuItem getMenuiAdd() {
        return menuiAdd;
    }

    public JMenuItem getMenuiConsultar() {
        return menuiConsultar;
    }

    public AddReceta getAddMenu() {
        return menuAdd;
    }
}
