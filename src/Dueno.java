public class Dueno {
    private String colorPiel="";
    private int genero=0;
    private int edad=0;
    private int cedula=0;
    private String nacionalidad="";
    private double peso=0;
    private String tipoSangre="";
    private double altura=0;


    public Dueno(String colorPiel, int genero, int edad, int cedula, String nacionalidad, double peso, String tipoSangre) {
        this.colorPiel = colorPiel;
        this.genero = genero;
        this.edad = edad;
        this.cedula = cedula;
        this.nacionalidad = nacionalidad;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.altura = altura;
    }

    public String esMayorEdad(){
        String my="";
        if(edad>=18){
            my="Es mayor de edad";
            System.out.println("Es mayor de edad");
        }else{
            my="Es menor de edad";
            System.out.println("Es menor de edad");
        }
        return my;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void imprimirDueno() {
       // String numDueno = "";
        System.out.println("\nEl color de piel del ocupante es:\n"+colorPiel+"\nEl genero de esta persona es:\n"+genero+"\nSiendo mayor de edad teniendo:\n"+edad);
        System.out.println("\nSu nacionalidad es: \n"+nacionalidad+"\nY peso unos: "+peso+"kg");
    }
}
