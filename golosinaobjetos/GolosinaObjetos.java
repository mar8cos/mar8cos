/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package golosinaobjetos;

import java.util.Scanner;

/**
 *
 * @author María Pilar Programación 6J
 */
public class GolosinaObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Maquina m = new Maquina();
        String[] menu = { "Salir", "Pedir golosina", "Mostrar golosinas" };
        int op, golo;
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoc = new Scanner(System.in);
        do {
            for (int i = 0; i < menu.length; i++) {
                System.out.println(i + ". " + menu[i]);
            }
            op = teclado.nextInt();
            switch (op) {
                case 0:
                System.out.println("Has vendido un total de: "+Maquina.ventas);
                    System.out.println("Adios");
                    break;
                case 1:
                    m.mostrar();
                    System.out.println("Golosina?");
                    golo = teclado.nextInt();
                    m.pedirGolosina(golo);
                    // m.muestra();
                    break;
                case 2:
                    m.mostrar();
                    break;
                case 3:
                    System.out.println("Introduce contraseña:");
                    String contra = tecladoc.nextLine();
                    if (contra.compareTo("1234") == 0) {
                        m.reponer();
                    } else {
                        System.out.println("Usuario no autorizado");
                    }

                    break;
                default:
                    System.out.println("Opción incorrecta");
                    throw new AssertionError();
            }
        } while (op != 0);

    }

}
