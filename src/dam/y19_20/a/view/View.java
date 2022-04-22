package dam.y19_20.a.view;

import dam.t.control.Controller;

import javax.swing.*;

public class View extends JFrame {
    private static String TITLE = "";
    private JPanel v;
    private JTable table1;
    private JPanel menu;
    private JMenu Menu1;
    private JMenu Menu2;

    public View() {
        setTitle(TITLE);
        setContentPane(v);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        // Setup the table with numbers
        table1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
                }
        ));
    }

    public void setControlador(Controller controller) {
//        .addActionListener(controller);
    }

}
