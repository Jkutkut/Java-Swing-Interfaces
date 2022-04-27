package dam.y19_20.b.view.seeReceta;

import dam.y19_20.b.control.Controller;
import dam.y19_20.b.model.ListaRecetas;
import dam.y19_20.b.model.Receta;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SeeReceta extends JFrame {
    private ListaRecetas listaRecetas;

    private JPanel jpMenu;
    private JLabel lblTitle;
    private JTable table;
    private JButton btnUpdate;

    public SeeReceta(ListaRecetas listaRecetas) {
        setSize(800, 600);
        setLocationRelativeTo(null);
        setContentPane(jpMenu);

        this.listaRecetas = listaRecetas;
        initComponents();
    }

    private void initComponents() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (String s : listaRecetas.getAtributeNames()) {
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

        Object rowData[];

        for (Receta c : listaRecetas.getRecetas()) {
            rowData = new Object[listaRecetas.getAtributeNames().length];
            rowData[0] = c.getNombre();
            rowData[1] = c.getDescripcion();
            rowData[2] = c.getTiempo();
            rowData[3] = c.getDificultad();

            model.addRow(rowData);
        }

    }
}
