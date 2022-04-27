package dam.y19_20.b.main;

import dam.y19_20.b.control.Controller;
import dam.y19_20.b.model.ListaRecetas;
import dam.y19_20.b.view.View;
import dam.y19_20.b.view.addReceta.AddReceta;
import dam.y19_20.b.view.seeReceta.SeeReceta;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ListaRecetas listaRecetas = new ListaRecetas();

                View ventana = new View(listaRecetas);
                AddReceta addMenu = new AddReceta(listaRecetas);
                SeeReceta seeMenu = new SeeReceta(listaRecetas);

                Controller controlador = new Controller(ventana, addMenu, seeMenu);
                ventana.setControlador(controlador);
                addMenu.setControlador(controlador);
                seeMenu.setControlador(controlador);
                ventana.setVisible(true);
            }
        });
    }
}
