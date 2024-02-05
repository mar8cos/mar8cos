package PRO_7_1.coche;
public class coche {
        private String modelo;
        private String color;
        private boolean metalizado;
        private String matricula;
        private String tipo;
        private int año;
        public String getModelo() {
            return modelo;
        }
    
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    
        public String getColor() {
            return color;
        }
    
        public void setColor(String color) {
            this.color = color;
        }
    
        public boolean isMetalizado() {
            return metalizado;
        }
    
        public void setMetalizado(boolean metalizado) {
            this.metalizado = metalizado;
        }
    
        public String getMatricula() {
            return matricula;
        }
    
        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }
    
        public String getTipo() {
            return tipo;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        public int getAño() {
            return año;
        }
    
        public void setAño(int año) {
            this.año = año;
        }
    
        public String getSeguro() {
            return seguro;
        }
    
        public void setSeguro(String seguro) {
            this.seguro = seguro;
        }
    
        private String seguro;
        
        public coche(String modelo, String color, boolean metalizado, String matricula, String tipo, int año,
                String seguro) {
            this.modelo = modelo;
            this.color = color;
            this.metalizado = metalizado;
            this.matricula = matricula;
            this.tipo = tipo;
            this.año = año;
            this.seguro = seguro;
        }
        public void imprimeCoche(){
            System.out.println("Modelo: "+getModelo());
        System.out.println("Color: "+getColor());
        System.out.println("Metalizado: "+isMetalizado());
        System.out.println("Matricula: "+getMatricula());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Año: "+getAño());
        System.out.println("Seguro: "+getSeguro());
        System.out.println("\n");
        }
    }
    

