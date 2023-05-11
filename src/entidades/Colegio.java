package entidades;

public class Colegio {

    public static void main(String[] args) {
        Alumno a = new Alumno(1,"huanca","kevin");
        Materia mate = new Materia(1001, "mate", 2009);
        Materia lengua = new Materia(1002, "lengua", 2029);
        Materia cs = new Materia(1003, "cs", 2019);
        
        a.agregarMateria(mate);
        a.agregarMateria(lengua);
        a.agregarMateria(cs);
        
        System.out.println(a.cantidadMaterias());
    }

}
