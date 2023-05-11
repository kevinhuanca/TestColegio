package entidades;

public class Colegio {

    public static void main(String[] args) {
        // a)
        Materia ingles = new Materia(1, "Inglés I", 1);
        Materia mate = new Materia(2, "Matematica", 1);
        Materia labo = new Materia(3, "Laboratorio I", 1);
        // b)
        Alumno a = new Alumno(1001, "López", "Martin");
        Alumno b = new Alumno(1002, "Martínez", "Brenda");
        // c)
        a.agregarMateria(ingles);
        a.agregarMateria(mate);
        a.agregarMateria(labo);
        // d)
        b.agregarMateria(ingles);
        b.agregarMateria(mate);
        b.agregarMateria(labo);
        b.agregarMateria(labo);
        // e)
        System.out.print(a.toString()+" esta inscrito en "+a.cantidadMaterias()+" materias: ");
        System.out.println(a.getMaterias());
        System.out.print(b.toString()+" esta inscrito en "+b.cantidadMaterias()+" materias: ");
        System.out.println(b.getMaterias());
    }

}
