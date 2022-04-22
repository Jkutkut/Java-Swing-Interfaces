package dam.y19_20.a.view;

import dam.y19_20.a.control.Controller;
import dam.y19_20.a.model.Videojuego;

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
    private JPanel jpMainMenu;
    private JPanel jpMainMenuBtns;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public View() {
        setTitle(TITLE);
        setContentPane(jpMenu);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        // Init add game
        cmbPlatform.setModel(new DefaultComboBoxModel<>(Videojuego.PLATAFORMAS));
    }

    public void setControlador(Controller controller) {
        btnAddGameAdd.addActionListener(controller);
//        btnAddGameCancel.addActionListener(controller);
    }

    public void test() {
        jpAddGame.setVisible(false);
    }
}
