package PRO_7_1.coche;
public class fabrica {
    public static void main(String[] args) {
        System.out.println("\n");
        coche coche1 = new coche("Ford Transit", "Negro", false, "0001AAA", "Utilitario", 2024, "todo riesgo");
        coche1.imprimeCoche();
    }
    
}
