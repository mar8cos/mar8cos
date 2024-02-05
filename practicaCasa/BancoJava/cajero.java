package practicaCasa.BancoJava;

public class cajero {
    private Cuenta[] cajero;
    private int maxcuentas;
    private int activos;

    public cajero() {
        this.maxcuentas = 10;
        cajero = new Cuenta[maxcuentas];
        this.activos = 0;
    }

    public void nuevacuenta(String titular) {
        if (activos < maxcuentas) {
            Cuenta c = new Cuenta(titular);
            cajero[activos] = c;
            activos++;
            System.out.println("\n" + c.toString() + "\n");
        } else {
            System.out.println("Disculpa, no caben mas cuentas en este cajero");
        }
    }

    public void listarcuentas() {
        for (int i = 0; i < activos; i++) {
            System.out.println(i + "- " + cajero[i].toString());
        }
    }

    public void consultarsaldo(int posicion) {
        if (posicion > activos) {
            System.out.println("No existe ninguna cuenta asignada a esa posicion");
        } else {
            System.out.println(cajero[posicion].getSaldo());
        }
    }
}
