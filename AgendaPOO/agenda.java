package AgendaPOO;

public class agenda {
    private contacto[] ag;
    private int maxcontactos;
    private int activos;

    public agenda(int maxcontactos) {
        this.maxcontactos = maxcontactos;
        ag = new contacto[maxcontactos];
        this.activos = 0;
    }

    /**
     * Añade un contacto al final de la agenda si cabe
     * 
     * @param nom nombre del contacto
     * @param ap1 apellido 1 del contacto
     * @param ap2 apellido 2 del contacto
     * @param tlf Teléfono del contacto
     *            "añade un contacto o aviso de que no cabe"
     */

    public void nuevocontacto(String nom, String ap1, String ap2, String tlf) {
        if (this.activos < this.maxcontactos) {
            contacto c = new contacto(nom, ap1, ap2, tlf);
            ag[activos] = c;
            activos++;
            System.out.println("Contacto añadido\n");
            System.out.println(c.toString());
        } else {
            System.out.println("No hay hueco para mas contactos");
        }
    }

    public boolean haySitio() {
        return this.activos < this.maxcontactos;
    }

    public void mostrarContactos() {
        if (activos <= 0) {
            System.out.println("No hay contactos en la agenda");

        } else {
            for (int i = 0; i < this.activos; i++) {
                System.out.println(i + "- " + ag[i].toString());

            }
        }
    }

    public void borrar(int pos) {
        if (posValida(pos)) {
            System.out.println("Eliminando contacto:" + ag[pos].toString());
            for (int i = 0; i < activos - 1; i++) {
                ag[i] = ag[i + 1];
            }
            activos--;
            System.out.println("Contacto eliminado");
        } else {
            System.out.println("No existe contacto en esa posición");
        }
    };

    public boolean posValida(int pos) {
        return pos >= 0 && pos < this.activos;
    }

    /***
     * Returnea -1 si no existe o la posicion del contacto a buscar
     * @param ap1
     * @param ap2
     * @return
     */
    public int buscar(String ap1, String ap2) {
        int pos = -1;
        contacto c;
        String apellidos = ap1 + " " + ap2;
        String apellidos2;
        for (int i = 0; i < this.activos; i++) {
            c = ag[i];
            apellidos2 = c.getAp1() + " " + c.getAp2();
            if (apellidos.equals(apellidos2)) {
                pos=i;
            }
        }
        return pos;
    }
    public void contactoXnumero(int pos){
        if (posValida(pos)) {
            System.out.println(ag[pos].toString());
        }else{
            System.out.println("No existe");
        }
    }
}
