package dam.y19_20.b.model;

import java.util.ArrayList;

public class ListaRecetas {
    private ArrayList<Receta> recetas;

    public ListaRecetas(){
        recetas = new ArrayList<>();
    }

    public void addReceta(Receta r){
        recetas.add(r);
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public String[] getAtributeNames() {
        return Receta.getAtributeNames();
    }
}
