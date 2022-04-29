package dam.y21_22.e.main;

import dam.y21_22.e.control.Controller;
import dam.y21_22.e.view.seeCorredor.SeeCorredor;
import dam.y21_22.e.model.ListaCorredores;
import dam.y21_22.e.view.addMenu.AddCorredor;
import dam.y21_22.e.view.mainMenu.View;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ListaCorredores listaRecetas = new ListaCorredores();

                View ventana = new View(listaRecetas);
                AddCorredor addMenu = new AddCorredor(listaRecetas);
                SeeCorredor seeMenu = new SeeCorredor(listaRecetas);

                Controller controlador = new Controller(ventana, addMenu, seeMenu);
                ventana.setControlador(controlador);
                addMenu.setControlador(controlador);
                seeMenu.setControlador(controlador);
                ventana.setVisible(true);
            }
        });
    }
}
