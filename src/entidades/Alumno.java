package entidades;

import java.util.ArrayList;

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private ArrayList<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias = new ArrayList<>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    
    public void agregarMateria(Materia m) {
        materias.add(m);
    }
    
    public int cantidadMaterias() {
        return materias.size();
    }
    
}
