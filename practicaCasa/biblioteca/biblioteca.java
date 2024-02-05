package practicaCasa.biblioteca;

import java.util.Scanner;

public class biblioteca {
    // Esta clase va a almacenar los libros y los usuarios en vectores y va a
    // decidir que es lo que se puede hacer con estos
    /*
     * Agregar libros, Eliminar libros, buscar libros (por autor,editorialhojas
     * etc),alquilar libros a usuarios, devolver libros de usuarios
     */

    Scanner teclados = new Scanner(System.in);
    Scanner tecladoi = new Scanner(System.in);
    private static int lactivos = 0;
    private static int uactivos = 0;
    libros[] l = new libros[5]; // Vector de la clase libros que almacenara libros.
    usuarios[] u = new usuarios[5]; // Vector de la clase usuarios que almacenara usuarios.

    public void AddBook(){
        System.out.println("\n Nombre: ");
        String nombre=teclados.nextLine();
        System.out.println("\n Autor: ");
        String autor=teclados.nextLine();
        System.out.println("\n Fecha de salida: ");
        int anoSalida=tecladoi.nextInt();
        System.out.println("\n N de hojas: ");
        int hojas=tecladoi.nextInt();
        System.out.println("\n Editorial: ");
        String editorial=teclados.nextLine();

        l[lactivos]= new libros(nombre, autor, anoSalida, hojas, editorial);
        System.out.println("\n Libro agregado a la libreria");
        System.out.println(l[lactivos].toString());
        lactivos++;
    }

    public void AddUser(){
        System.out.println("\n Introduce el dni del nuevo usuario");
        String dni=teclados.nextLine();
        u[uactivos]= new usuarios(dni);

        System.out.println("\n Usuario agregado a la libreria");
        System.out.println(u[uactivos].toString());
        uactivos++;
    }


}
