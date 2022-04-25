package dam.y19_20.b.view;

import dam.y19_20.b.control.Controller;

import javax.swing.*;

public class View extends JFrame {
    private static String TITLE = "";
    private JPanel jpMenu;

    public View() {
        setTitle(TITLE);
//        setContentPane(jpMenu);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
    }

    public void setControlador(Controller controller) {
//        btnAddGameAdd.addActionListener(controller);
//        btnAddGameCancel.addActionListener(controller);
    }

    public void test() {
        System.out.println("Test");
    }
}
