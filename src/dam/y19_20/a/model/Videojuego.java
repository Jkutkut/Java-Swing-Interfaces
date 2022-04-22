package dam.y19_20.a.model;

import dam.exception.InvalidDataException;

public class Videojuego {

    public static final String[] PLATAFORMAS = {"PS5", "XBOX", "PC", "Nintendo Switch", "Stream Deck"};
    public static final int[] PEGIS = {3, 7, 12, 16, 18};

    private String titulo;
    private String plataforma;
    private int pegi;
    private String prestado;

    public Videojuego(String titulo, String plataforma, int pegi, String prestado) {
        this.setTitulo(titulo);
        this.setPlataforma(plataforma);
        this.setPegi(pegi);
        this.setPrestado(prestado);
    }

    // GETTERS
    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getPegi() {
        return pegi;
    }

    public String getPrestado() {
        return prestado;
    }

    public static boolean isValidPlataforma(String plataforma) {
        for (String p : PLATAFORMAS)
            if (p.equals(plataforma))
                return true;
        return false;
    }

    public static boolean isValidPegi(int pegi) {
        for (int p : PEGIS)
            if (p == pegi)
                return true;
        return false;
    }

    // SETTERS
    private void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty())
            throw new InvalidDataException("El titulo no puede ser nulo o vacio");
        this.titulo = titulo;
    }

    private void setPlataforma(String plataforma) {
        if (plataforma == null || plataforma.isEmpty())
            throw new InvalidDataException("La plataforma no puede ser nula o vacia");
        if (!isValidPlataforma(plataforma))
            throw new InvalidDataException("La plataforma no es valida");
        this.plataforma = plataforma;
    }

    private void setPegi(int pegi) {
        if (!isValidPegi(pegi))
            throw new InvalidDataException("El pegi no es valido");
        this.pegi = pegi;
    }

    private void setPrestado(String prestado) {
        if (prestado == null)
            throw new InvalidDataException("El prestado no puede ser nulo");
        this.prestado = prestado;
    }
}
