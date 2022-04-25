package dam.y19_20.b.view;

import dam.exception.InvalidDataException;
import dam.y19_20.b.control.Controller;
import dam.y19_20.b.model.ListaRecetas;
import dam.y19_20.b.model.Receta;

import javax.swing.*;

public class View extends JFrame {
    private static String TITLE = "Aplicación recetas";
    private ListaRecetas listaRecetas;

    private JPanel jpMenu;
    private JPanel jpAddMenu;
    private JPanel jpConsultMenu;
    private JLabel lblAddMenuTitle;
    private JPanel jpForm;
    private JPanel jpFormName;
    private JLabel lblFormName;
    private JTextField tfFormName;
    private JPanel jpFormTime;
    private JLabel lblFormTime;
    private JSpinner spFormTime;
    private JPanel jpFormDificultad;
    private JLabel lblFormDificultad;
    private JComboBox cmbFormDificultad;
    private JPanel jpFormDesc;
    private JTextArea txtaFormDesc;
    private JButton btnFormAdd;
    private JLabel lblFormError;
    private JMenuItem menuiAdd;
    private JMenuItem menuiConsultar;
    private JLabel lblConsultTitle;
    private JTable table1;
    private JLabel lblFormDesc;

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
        cmbFormDificultad.setModel(new DefaultComboBoxModel<>(Receta.DIFICULTADES));
        spFormTime.setModel(new SpinnerNumberModel(0, 0, 500, 1));

        resetForm();
    }

    public void setControlador(Controller controller) {
        menuiAdd.addActionListener(controller);
        menuiConsultar.addActionListener(controller);

        // Menu Add
        btnFormAdd.addActionListener(controller);
    }

    public void submitForm() {
        if (tfFormName.getText().isEmpty()) {
            setFormError("El nombre no puede estar vacío");
            return;
        }
        if (txtaFormDesc.getText().isEmpty()) {
            setFormError("La descripción no puede estar vacía");
            return;
        }
        setFormError(null);
        Receta r;
        try {
            r = new Receta(
                tfFormName.getText(),
                txtaFormDesc.getText(),
                (int) spFormTime.getValue(),
                cmbFormDificultad.getSelectedItem().toString()
            );
        }
        catch (InvalidDataException e) {
            setFormError(e.getMessage());
            return;
        }
        listaRecetas.addReceta(r);
    }

    // GETTERS
    public JMenuItem getMenuiAdd() {
        return menuiAdd;
    }

    public JMenuItem getMenuiConsultar() {
        return menuiConsultar;
    }

    public JButton getBtnFormAdd() {
        return btnFormAdd;
    }

    // SETTERS
    public void openAddMenu() {
        jpConsultMenu.setVisible(false);
        resetForm();
        jpAddMenu.setVisible(true);
    }

    public void openConsultMenu() {
        jpAddMenu.setVisible(false);
        jpConsultMenu.setVisible(true);
//        updateConsultTable();
    }

    public void resetForm() {
        setFormError(null);
        tfFormName.setText("");
        txtaFormDesc.setText("");
        cmbFormDificultad.setSelectedIndex(0);
        spFormTime.setValue(0);
    }

    public void setFormError(String error) {
        if (error == null || error.isEmpty()) {
            lblFormError.setText("");
        }
        else {
            lblFormError.setText("Error: " + error);
        }
    }
}
