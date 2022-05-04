package dam.jdbc.loginScreen1.main;

import dam.jdbc.loginScreen1.controller.Controller;
import dam.jdbc.loginScreen1.view.View;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                View ventana = new View();

                Controller controlador = new Controller(ventana);
                ventana.setControlador(controlador);
                ventana.setVisible(true);
            }
        });
    }
}
