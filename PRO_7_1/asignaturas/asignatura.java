package PRO_7_1.asignaturas;

public class asignatura {
    private String nombre;
    private String codigo;
    private String curso;


    public asignatura(String nombre, String codigo, String curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCurso() {
        return curso;
    }

}
