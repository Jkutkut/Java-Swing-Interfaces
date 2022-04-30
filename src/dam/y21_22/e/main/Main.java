package dam.y21_22.e.main;

import dam.y21_22.e.control.Controller;
import dam.y21_22.e.model.Corredor;
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
                ListaCorredores listaCorredores = new ListaCorredores();
                cargaInicial(listaCorredores);

                View ventana = new View(listaCorredores);
                AddCorredor addMenu = new AddCorredor(listaCorredores);
                SeeCorredor seeMenu = new SeeCorredor(listaCorredores);

                Controller controlador = new Controller(ventana, addMenu, seeMenu);
                ventana.setControlador(controlador);
                addMenu.setControlador(controlador);
                seeMenu.setControlador(controlador);
                ventana.setVisible(true);
            }
        });
    }

    private static void cargaInicial(ListaCorredores listaCorredores) {
        listaCorredores.addCorredor(new Corredor(
                "Jose Luis",
                2321,
                "Hombre",
                21,
                "10000"
        ));
        listaCorredores.addCorredor(new Corredor(
                "Carlos",
                13245,
                "Hombre",
                21,
                "10000"
        ));
        listaCorredores.addCorredor(new Corredor(
                "Luis",
                54323,
                "Hombre",
                21,
                "10000"
        ));
        listaCorredores.addCorredor(new Corredor(
                "María",
                2321,
                "Mujer",
                21,
                "10000"
        ));
        listaCorredores.addCorredor(new Corredor(
                "Marta",
                13245,
                "Mujer",
                12,
                "10000"
        ));
        listaCorredores.addCorredor(new Corredor(
                "Paula",
                54323,
                "Mujer",
                32,
                "10000"
        ));
    }
}
