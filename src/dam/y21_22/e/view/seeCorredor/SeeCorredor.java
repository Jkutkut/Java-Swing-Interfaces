package dam.y21_22.e.view.seeCorredor;

import dam.y21_22.e.control.Controller;
import dam.y21_22.e.model.Corredor;
import dam.y21_22.e.model.ListaCorredores;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SeeCorredor extends JFrame {
    private ListaCorredores listaCorredores;

    private JPanel jpMenu;
    private JLabel lblTitle;
    private JTable table;
    private JButton btnUpdate;
    private JPanel jpFilter;
    private JRadioButton rbtnSexMale;
    private JRadioButton rbtnSexFemale;
    private JRadioButton rbtnSexAll;
    private ButtonGroup tableFilter;

    public SeeCorredor(ListaCorredores listaCorredores) {
        setSize(800, 600);
        setLocationRelativeTo(null);
        setContentPane(jpMenu);

        this.listaCorredores = listaCorredores;
        initComponents();
    }

    private void initComponents() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (String s : listaCorredores.getAtributeNames()) {
            model.addColumn(s);
            System.out.println(s);
        }
        table.setModel(model);
    }

    public void setControlador(Controller controller) {
        btnUpdate.addActionListener(controller);
    }

    public JPanel getMenu() {
        return jpMenu;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public void updateTable() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.getDataVector().clear();

        boolean[] wantedSex = {true, true};
        if (rbtnSexMale.isSelected())
            wantedSex[1] = false;
        else if (rbtnSexFemale.isSelected())
            wantedSex[0] = false;

        Object rowData[];
        int sex;
        for (Corredor c : listaCorredores.getCorredores()) {
            sex = (c.getSexo().equals("Hombre")) ? 0 : 1;
            if (!wantedSex[sex])
                continue;
            rowData = new Object[listaCorredores.getAtributeNames().length];
            rowData[0] = c.getNombre();
            rowData[1] = c.getDorsal();
            rowData[2] = c.getSexo();
            rowData[3] = c.getEdad();
            rowData[4] = c.getModalidad();

            model.addRow(rowData);
        }

    }
}
