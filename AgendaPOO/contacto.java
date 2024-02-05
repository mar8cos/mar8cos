package AgendaPOO;

public class contacto {
    private String nombre;
    private String ap1;
    private String ap2;
    private String telf;

    public contacto(String nombre, String ap1, String ap2, String telf) {
        this.nombre = nombre;
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.telf = telf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp1() {
        return ap1;
    }

    public void setAp1(String ap1) {
        this.ap1 = ap1;
    }

    public String getAp2() {
        return ap2;
    }

    public void setAp2(String ap2) {
        this.ap2 = ap2;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }
    
    public String toString(){
    return this.nombre+" "+this.ap1+" "+this.ap2+" -- "+this.telf;
    }

}
