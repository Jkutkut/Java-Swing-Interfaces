package dam.y19_20.a.view;

import dam.t.control.Controller;

import javax.swing.*;

public class View extends JFrame {
    private static String TITLE = "";
    private JPanel v;
    private JPanel menu;

    public View() {
        setTitle(TITLE);
        setContentPane(v);
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
