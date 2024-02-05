package AgendaPOO;

import java.util.Scanner;

public class Main {
    Scanner teclado = new Scanner(System.in);

    public void menu() {
        agenda a = new agenda(5);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("0- Salir de la aplicación");
            System.out.println("1- Añadir nuevo contacto");
            System.out.println("2- Mostrar contactos");
            System.out.println("3- Eliminar contacto por nº de contacto");
            System.out.println("4- Buscar contacto por los apellidos");

            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    if (a.haySitio()) {
                        System.out.println("Nombre");
                        String nom = teclado.nextLine();

                        System.out.println("Apellido 1");
                        String ap1 = teclado.nextLine();

                        System.out.println("Apellido 2:");
                        String ap2 = teclado.nextLine();

                        System.out.println("Teléfono:");
                        String tlf = teclado.nextLine();

                        a.nuevocontacto(nom, ap1, ap2, tlf);
                    } else {
                        a.haySitio();
                    }
                    break;
                case 2:
                    a.mostrarContactos();
                    break;
                case 3:
                    a.mostrarContactos();
                    System.out.println("Nº de contacto a borrar:");
                    int borrar = teclado.nextInt();
                    a.borrar(borrar);
                    break;
                case 4:
                    System.out.println("Apellido 1");
                    String ap1 = teclado.nextLine();
                    System.out.println("Apellido 2:");
                    String ap2 = teclado.nextLine();
                    if (a.buscar(ap1, ap2) == -1) {
                        System.out.println("No existe ningun contacto con esos apellidos");
                    } else {
                        a.contactoXnumero(a.buscar(ap1, ap2));
                    }
                    break;
                default:
                    System.out.println("Numero no válido");
                    break;
            }
        }

    }

    public static void main(String[] args) {
        Main m = new Main();
        m.menu();
    }
}
