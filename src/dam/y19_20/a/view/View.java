package dam.y19_20.a.view;

import dam.y19_20.a.control.Controller;

import javax.swing.*;

public class View extends JFrame {
    private static String TITLE = "";
    private JPanel jpMenu;
    private JPanel jpAddGame;
    private JLabel lblAddGame;
    private JPanel jpForm;
    private JPanel jpTitle;
    private JLabel lblTitle;
    private JTextField textField1;

    public View() {
        setTitle(TITLE);
        setContentPane(jpMenu);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
    }

    public void setControlador(Controller controller) {
//        .addActionListener(controller);
    }

}
