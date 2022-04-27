package dam.y19_20.b.model;

import dam.exception.InvalidDataException;

public class Receta {

    public static final String[] DIFICULTADES = {"BAJA", "MEDIA", "ALTA"};

    private String nombre;
    private String descripcion;
    private int tiempo;
    private String dificultad;

    public Receta(String nombre, String descripcion, int tiempo, String dificultad) {
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setTiempo(tiempo);
        this.setDificultad(dificultad);
    }

    public static String[] getAtributeNames() {
        return new String[]{"Nombre", "Descripción", "Tiempo", "Dificultad"};
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public String getDificultad() {
        return dificultad;
    }

    private boolean esDificultadValida(String dificultad) {
        if (dificultad == null || dificultad.isEmpty())
            return false;
        for (String d : DIFICULTADES)
            if (d.equals(dificultad))
                return true;
        return false;
    }

    // SETTERS
    private void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty())
            throw new InvalidDataException("Nombre no válido");
        this.nombre = nombre;
    }

    private void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.isEmpty())
            throw new InvalidDataException("Descripción no válida");
        this.descripcion = descripcion;
    }

    private void setTiempo(int tiempo) {
        if (tiempo < 0)
            throw new InvalidDataException("Tiempo no válido");
        this.tiempo = tiempo;
    }

    private void setDificultad(String dificultad) {
        dificultad = dificultad.toUpperCase();
        if (!esDificultadValida(dificultad))
            throw new InvalidDataException("Dificultad no válida");
        this.dificultad = dificultad;
    }
}
