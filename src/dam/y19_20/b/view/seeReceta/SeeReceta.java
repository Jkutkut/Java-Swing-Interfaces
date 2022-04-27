package dam.y19_20.b.view.seeReceta;

import javax.swing.*;

public class SeeReceta extends JFrame {
    private JPanel jpMenu;
    private JLabel lblTitle;
    private JTable table;

    public SeeReceta() {
        setSize(800, 600);
        setLocationRelativeTo(null);
        setContentPane(jpMenu);
        setVisible(true);
    }

    public JPanel getMenu() {
        return jpMenu;
    }
}
