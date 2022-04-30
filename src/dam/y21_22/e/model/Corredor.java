package dam.y21_22.e.model;

import dam.exception.InvalidDataException;

public class Corredor {

    public static final int MAX_DORSAL_LEN = 5;
    public static final int MAX_EDAD = 150;
    public static final int MIN_EDAD = 5;
    public static final String[] SEXOS = {"Hombre", "Mujer"};
    public static final String[] MODALIDADES = {"10000", "Medio maratón", "Maratón"};

    private String nombre;
    private int dorsal;
    private String sexo;
    private int edad;
    private String modalidad;

    public Corredor(String nombre, int dorsal, String sexo, int edad, String modalidad) {
        setNombre(nombre);
        setDorsal(dorsal);
        setSexo(sexo);
        setEdad(edad);
        setModalidad(modalidad);
    }

    public static String[] getAtributeNames() {
        return new String[]{"Nombre", "Dorsal", "Sexo", "Edad", "Modalidad"};
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getModalidad() {
        return modalidad;
    }

    private boolean esSexoValido(String sexo) {
        if (sexo == null || sexo.isEmpty())
            return false;
        for (String s : SEXOS)
            if (s.equals(sexo))
                return true;
        return false;
    }

    public boolean esModalidadValida(String modalidad) {
        if (modalidad == null || modalidad.isEmpty())
            return false;
        for (String s : MODALIDADES)
            if (s.equals(modalidad))
                return true;
        return false;
    }

    // SETTERS
    private void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty())
            throw new InvalidDataException("Nombre no válido");
        this.nombre = nombre;
    }

    public void setDorsal(int dorsal) {
        if (dorsal < 0 || dorsal > Math.pow(10, MAX_DORSAL_LEN))
            throw new InvalidDataException("Dorsal no puede ser negativo ni tener más de %d dígitos", MAX_DORSAL_LEN);
        this.dorsal = dorsal;
    }

    public void setSexo(String sexo) {
        if (!esSexoValido(sexo))
            throw new InvalidDataException("Sexo no válido");
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        if (edad < MIN_EDAD || edad > MAX_EDAD)
            throw new InvalidDataException("La edad tiene que estar en el intervalo [%d, %d]", MIN_EDAD, MAX_EDAD);
        this.edad = edad;
    }

    public void setModalidad(String modalidad) {
        if (!esModalidadValida(modalidad))
            throw new InvalidDataException("Modalidad no válida");
        this.modalidad = modalidad;
    }
}
