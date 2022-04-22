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
    private JTextField txtfTitle;
    private JPanel jpPlatform;
    private JLabel lblPlatform;
    private JComboBox cmbPlatform;
    private JPanel jpPEGI;
    private JLabel lblPEGI;
    private JRadioButton rbtnPEGI3;
    private JRadioButton rbtnPEGI7;
    private JRadioButton rbtnPEGI12;
    private JRadioButton rbtnPEGI16;
    private JRadioButton rbtnPEGI18;
    private JPanel jpPrestado;
    private JLabel lblPrestado;
    private JTextField txtfPrestado;
    private JPanel jpAddGameControl;
    private JButton btnAddGameAdd;
    private JButton btnAddGameCancel;

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
