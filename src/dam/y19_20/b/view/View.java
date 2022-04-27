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
        menuAdd = new AddReceta();
    }

    public void setControlador(Controller controller) {
        //addwindowListener(controller); // Map exit

//        menuiAdd.addActionListener(controller);
//        menuiConsultar.addActionListener(controller);

        // Menu Add
//        btnFormAdd.addActionListener(controller);
    }

    private void updateConsultTable() {
        // Fill table with 3 rows with 3 columns with numbers
//        tableConsult.
    }

    // SETTERS
    public void openAddMenu() {
        jspMenu.setViewportView(menuAdd.getJpMenu());
        menuAdd.resetForm();
    }

    public void openConsultMenu() {
    }

    public void resetForm() {
//        setFormError(null);
//        tfFormName.setText("");
//        txtaFormDesc.setText("");
//        cmbFormDificultad.setSelectedIndex(0);
//        spFormTime.setValue(0);
    }

    public void setFormError(String error) {
//        if (error == null || error.isEmpty()) {
//            lblFormError.setText("");
//        }
//        else {
//            lblFormError.setText("Error: " + error);
//        }
    }
}
