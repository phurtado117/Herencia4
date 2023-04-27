package Interfaces;

public class InterfacesApp {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
                "Pablo",
                "Hurtado",
                20,
                "TEG",
                "Informatica",
                "2do"
        );

        Empleado empleado = new Empleado(
                "Juan",
                "Dominguez",
                45,
                "Google",
                "junior Programmer",
                "200000"
        );

        EstudianteTrabajador estudianteTrabajador = new EstudianteTrabajador(
                "Alejandra",
                "Flores",
                28,
                "TEG",
                "Informatica",
                "9no",
                "Facebook",
                "Junior Programmer",
                "120000"
        );

        System.out.println(estudiante.toString());
        System.out.println("--------------------------");
        System.out.println(empleado.toString());
        System.out.println("--------------------------");
        System.out.println(estudianteTrabajador.toString());
    }
}
