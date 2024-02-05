package PRO_7_1.asignaturas;

import java.util.Scanner;

public class fabrica {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        asignatura[] asignaturas = new asignatura[5];
        int cuantos = 0;

        int opcion = 0;

        int asignatura = 0;
        while (opcion != 5) {

            System.out.println("1- Crear asignatura");
            System.out.println("2- Ver nombre");
            System.out.println("3- Ver codigo");
            System.out.println("4- Ver curso");
            System.out.println("5- Salir");

            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:
                    String nombre;
                    String codigo;
                    String curso;
                    System.out.println("Introduce el nombre");
                    nombre = teclado.next();
                    System.out.println("Introduce el codigo");
                    codigo = teclado.next();
                    System.out.println("Introduce el curso");
                    curso = teclado.next();
                    asignaturas[cuantos] = new asignatura(nombre, codigo, curso);
                    cuantos++;
                    break;
                case 2:
                    System.out.println("De que asignatura? Ahora tienes " + cuantos + " asignaturas");
                    asignatura = teclado.nextInt();
                    System.out.println(asignaturas[asignatura].getNombre());
                    break;

                case 3:
                    System.out.println("De que asignatura? Ahora tienes " + cuantos + " asignaturas");
                    asignatura = teclado.nextInt();
                    System.out.println(asignaturas[asignatura].getCodigo());
                    break;

                case 4:
                    System.out.println("De que asignatura? Ahora tienes " + cuantos + " asignaturas");
                    asignatura = teclado.nextInt();
                    System.out.println(asignaturas[asignatura].getCurso());
                    break;

                case 5:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Introduce un numero valido");
                    break;
            }
        }
    }
}
