package dam.y21_22.e.model;

import java.util.ArrayList;

public class ListaCorredores {
    private ArrayList<Corredor> corredores;

    public ListaCorredores(){
        corredores = new ArrayList<>();
    }

    public void addCorredor(Corredor r){
        corredores.add(r);
    }

    public ArrayList<Corredor> getCorredores() {
        return corredores;
    }

    public String[] getAtributeNames() {
        return Corredor.getAtributeNames();
    }
}
