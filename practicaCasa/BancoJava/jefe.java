package practicaCasa.BancoJava;

import java.util.Scanner;

public class jefe {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        cajero cajero = new cajero();
        System.out.println("Bienvenido a nuestro banco");
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("0- Salir");
            System.out.println("1- Agregar cuenta");
            System.out.println("2- Listar cuentas que posee el cajero");
            System.out.println("3- Consultar saldo");
            System.out.println("4- Realizar transferencia");

            System.out.println("\n Introduce una opcion");
            opcion=teclado.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    System.out.println("Introduce el nombre titular de la cuenta");
                    String titular = teclado.next();
                    cajero.nuevacuenta(titular);
                    break;
                case 2:
                    System.out.println("Cuentas almacenadas:");
                    cajero.listarcuentas();
                    break;
                case 3:
                    System.out.println("Introduce el numero de cuenta a consultar");
                    int posicion = teclado.nextInt();
                    cajero.consultarsaldo(posicion);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Introduce una opcion correcta");
                    break;
            }
        }
    }
}