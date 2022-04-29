package dam.y21_22.e.view.addMenu;

import dam.exception.InvalidDataException;
import dam.y21_22.e.control.Controller;
import dam.y21_22.e.model.ListaCorredores;
import dam.y21_22.e.model.Corredor;

import javax.swing.*;

public class AddCorredor extends JFrame {
    private ListaCorredores listaRecetas;

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
    private JPanel jpFormEdad;
    private JPanel jpFormSexo;
    private JLabel lblFormSexo;
    private JComboBox cmbFormSexo;
    private JPanel jpFormModalidad;
    private JLabel lblFormModalidad;
    private JComboBox cmbFormModalidad;
    private JLabel lblFormEdad;
    private JSpinner spFormEdad;
    private JMenuItem menuiAdd;
    private JMenuItem menuiConsultar;
    private JLabel lblConsultTitle;
    private JTable tableConsult;
    private JLabel lblFormDesc;

    public AddCorredor(ListaCorredores listaRecetas) {
        setContentPane(jpMenu);
        pack();
        setSize(800, 600);
        setLocationRelativeTo(null);
        initComponents();

        this.listaRecetas = listaRecetas;
    }

    private void initComponents() {
        cmbFormSexo.setModel(new DefaultComboBoxModel<String>(Corredor.SEXOS));
        spFormEdad.setModel(new SpinnerNumberModel(Corredor.MIN_EDAD, Corredor.MIN_EDAD, Corredor.MAX_EDAD, 1));

        resetForm();
    }

    public void setControlador(Controller controller) {
        btnFormAdd.addActionListener(controller);
    }

    public void submitForm() {
//        if (tfFormName.getText().isEmpty()) {
//            setFormError("El nombre no puede estar vacío");
//            return;
//        }
//        if (txtaFormDesc.getText().isEmpty()) {
//            setFormError("La descripción no puede estar vacía");
//            return;
//        }
//        setFormError(null);
//        Corredor r;
//        try {
//            r = new Corredor(
//                tfFormName.getText(),
//                txtaFormDesc.getText(),
//                (int) spFormTime.getValue(),
//                cmbFormDificultad.getSelectedItem().toString()
//            );
//        }
//        catch (InvalidDataException e) {
//            setFormError(e.getMessage());
//            return;
//        }
//        listaRecetas.addReceta(r);
//        resetForm();
    }

    // GETTERS
    public JPanel getMenu() {
        return jpMenu;
    }

    public JButton getBtnFormAdd() {
        return btnFormAdd;
    }

    // SETTERS
    public void resetForm() {
//        setFormError(null);
//        tfFormName.setText("");
//        txtaFormDesc.setText("");
//        cmbFormDificultad.setSelectedIndex(0);
//        spFormTime.setValue(0);
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
