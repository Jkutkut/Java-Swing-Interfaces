package dam.y21_22.e.view.addMenu;

import dam.exception.InvalidDataException;
import dam.y21_22.e.control.Controller;
import dam.y21_22.e.model.ListaCorredores;
import dam.y21_22.e.model.Corredor;

import javax.swing.*;

public class AddCorredor extends JFrame {
    private ListaCorredores listaCorredores;

    private JPanel jpMenu;
    private JPanel jpAddMenu;
    private JPanel jpConsultMenu;
    private JLabel lblAddMenuTitle;
    private JPanel jpForm;
    private JPanel jpFormName;
    private JLabel lblFormName;
    private JTextField tfFormName;
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
    private JPanel jpFormDorsal;
    private JLabel lblFormDorsal;
    private JTextField txtfFormDorsal;

    public AddCorredor(ListaCorredores listaCorredores) {
        setContentPane(jpMenu);
        pack();
        setSize(800, 600);
        setLocationRelativeTo(null);
        initComponents();

        this.listaCorredores = listaCorredores;
    }

    private void initComponents() {
        cmbFormSexo.setModel(new DefaultComboBoxModel<String>(Corredor.SEXOS));
        cmbFormModalidad.setModel(new DefaultComboBoxModel<String>(Corredor.MODALIDADES));
        spFormEdad.setModel(new SpinnerNumberModel(Corredor.MIN_EDAD, Corredor.MIN_EDAD, Corredor.MAX_EDAD, 1));

        resetForm();
    }

    public void setControlador(Controller controller) {
        btnFormAdd.addActionListener(controller);
    }

    public void submitForm() {
        if (tfFormName.getText().isEmpty()) {
            setFormError("El nombre no puede estar vacío");
            return;
        }
        int dorsal;
        try {
            dorsal = Integer.parseInt(txtfFormDorsal.getText());
        }
        catch (NumberFormatException e) {
            setFormError("El dorsal debe ser un número");
            return;
        }
        setFormError(null);
        Corredor r;
        try {
            r = new Corredor(
                tfFormName.getText(),
                dorsal,
                cmbFormSexo.getSelectedItem().toString(),
                (int) spFormEdad.getValue(),
                cmbFormModalidad.getSelectedItem().toString()
            );
        }
        catch (InvalidDataException e) {
            setFormError(e.getMessage());
            return;
        }
        listaCorredores.addCorredor(r);
        resetForm();
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
        lblFormError.setText("");
        tfFormName.setText("");
        spFormEdad.setValue(Corredor.MIN_EDAD);
        cmbFormSexo.setSelectedIndex(0);
        cmbFormModalidad.setSelectedIndex(0);
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
