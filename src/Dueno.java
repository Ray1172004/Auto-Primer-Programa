public class Dueno {
    String colorPiel="";
    int genero=0;
    int edad=0;
    int cedula=0;
    String nacionalidad="";
    double peso=0;
    String tipoSangre="";
    double altura=0;

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

}
