package dam.y19_20.b.main;

import dam.y19_20.b.control.Controller;
import dam.y19_20.b.view.View;

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
