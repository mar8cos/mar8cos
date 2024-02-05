package PRO_7_1.punto;

import java.util.Scanner;

public class grafica {
    boolean[][] grafica = creargrafica();
    Scanner teclado = new Scanner(System.in);
    int cantidadpuntos = 0;

    fabrica punto0 = new fabrica(0, 0);
    fabrica punto1 = new fabrica(5, 3);
    fabrica punto2 = new fabrica(2, -1);
    fabrica punto3 = new fabrica(4, 3);

    public boolean[][] creargrafica() {
        grafica = new boolean[11][11];
        for (int f = 0; f < grafica.length; f++) {
            for (int c = 0; c < grafica[0].length; c++) {
                grafica[f][c] = false;
            }
        }
        return grafica;
    }

    public void mostrargrafica() {
        for (int f = 0; f < grafica.length; f++) {
            for (int c = 0; c < grafica[0].length; c++) {
                if (grafica[f][c] == false) {
                    System.out.print("[ ] ");
                } else {
                    System.out.print("[O] ");
                }
            }System.out.println("\n");
        }
        
    }
    
public void marcarpuntos(){
    int x = (grafica.length/2)+punto0.getX();
    int y = grafica.length/2-punto0.getY();
    grafica[y][x]=true;

    x = (grafica.length/2)+punto1.getX();
    y = grafica.length/2-punto1.getY();
    grafica[y][x]=true;

    x = (grafica.length/2)+punto2.getX();
    y = grafica.length/2-punto2.getY();
    grafica[y][x]=true;

    x = (grafica.length/2)+punto3.getX();
    y = grafica.length/2-punto3.getY();
    grafica[y][x]=true;
}

    public static void main(String[] args) {
        grafica m = new grafica();
        m.creargrafica();
        m.marcarpuntos();
        m.mostrargrafica();

    }
}
