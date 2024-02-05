package practicaCasa.biblioteca;

public class libros {
    private String nombre;
    private String autor;
    private int anoSalida;
    private int hojas;
    private String editorial;

    /**
     * Crea un nuevo libro con estos parametros
     * @param nombre
     * @param autor
     * @param fechaSalida
     * @param hojas
     * @param editorial
     */
    public libros(String nombre, String autor, int fechaSalida, int hojas, String editorial) {
        this.nombre = nombre;
        this.autor = autor;
        this.anoSalida = fechaSalida;
        this.hojas = hojas;
        this.editorial = editorial;
    }

    public String toString() {
        return "Nombre: " + nombre + "\n Autor: " + this.autor + "\n fechaSalida: " + this.anoSalida + "\n Hojas: "
                + this.hojas + "\n Editorial: " + this.editorial;
    }

}
