/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package golosinaobjetos;

/**
 *
 * @author María Pilar Programación 6J
 */
public class Maquina {
    public static double ventas=0;
    Golosina[][] maq;

    public Maquina() {
        maq = new Golosina[4][4];
        inicializar();
    }

    public void inicializar() {
        String[][] nombresGolosinas = {
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}

        };

        double[][] precio = {
            {1.1, 0.8, 1.5, 0.9},
            {1.8, 1, 1.2, 1},
            {1.8, 1.3, 1.2, 0.8},
            {1.5, 1.1, 1.1, 1.1}};

        for (int f = 0; f < maq.length; f++) {
            for (int c = 0; c < maq[0].length; c++) {
                maq[f][c] = new Golosina(nombresGolosinas[f][c], precio[f][c], 5);
            }
        }

    }

    /**
     * El metodo da una golosina o no en función 
     * de si existe y hay existencias
     * @param numgolo numero de golosina
     * @return "Toma la golosina" , "No existe", "No hay existencias"
     */
    public String pedirGolosina(int numgolo) {
        int col = numgolo % 10;
        int fila = numgolo / 10;
        if (fila >= 0 && fila <= maq.length && col >= 0 && col <= maq[0].length) {
            if (maq[fila][col].getExist() > 0) {
                maq[fila][col].setExist();
                ventas=maq[fila][col].getPrecio()+ventas;
                return "Toma tu " + maq[fila][col].getNombre();

            } else {
                return "No hay existencias";
            }
        } else {
            return "No existe la golosina";
        }
    }

    public String mostrar() {
        String salida = "";
        
        for (int f = 0; f < maq.length; f++) {
            for (int c = 0; c < maq[0].length; c++) {
                salida += f + "" + c + ". " + maq[f][c].mostrarSinExist()+"\n";
            }
        }
        return salida;
    }

    public String reponer() {
        String salida="";
        for (int i = 0; i < maq.length; i++) {
            for (int j = 0; j < maq[0].length; j++) {
                maq[i][j].setExist(5);
            }
        }
        return salida;
    }
}
