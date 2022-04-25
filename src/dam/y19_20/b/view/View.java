package dam.y19_20.b.view;

import dam.y19_20.b.control.Controller;

import javax.swing.*;

public class View extends JFrame {
    private static String TITLE = "";
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
//        btnAddGameAdd.addActionListener(controller);
//        btnAddGameCancel.addActionListener(controller);
    }

    public void test() {
        System.out.println("Test");
    }
}
