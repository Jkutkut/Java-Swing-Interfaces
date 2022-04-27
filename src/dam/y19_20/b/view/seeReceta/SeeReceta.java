package dam.y19_20.b.view.seeReceta;

import dam.y19_20.b.model.ListaRecetas;

import javax.swing.*;

public class SeeReceta extends JFrame {
    private ListaRecetas listaRecetas;

    private JPanel jpMenu;
    private JLabel lblTitle;
    private JTable table;

    public SeeReceta(ListaRecetas listaRecetas) {
        setSize(800, 600);
        setLocationRelativeTo(null);
        setContentPane(jpMenu);

        this.listaRecetas = listaRecetas;
    }

    public JPanel getMenu() {
        return jpMenu;
    }
}
