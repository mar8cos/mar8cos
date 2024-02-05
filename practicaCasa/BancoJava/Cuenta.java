package practicaCasa.BancoJava;

public class Cuenta {
    private String titular;
    private int saldo;


    public Cuenta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String toString(){
        return this.titular+" tiene un saldo de "+this.saldo;
    }
}
