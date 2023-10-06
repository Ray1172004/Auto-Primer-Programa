// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setPuertas(10);
        auto1.setColor("Azul");
        auto1.imprimirColorPuertas();

        Auto auto2 = new Auto( 4,  "Rojo ",  3);
        auto2.imprimirColorPuertas();

        Dueno dueno1 = new Dueno("Negro", 1,19, 172422674, "Ecuatoriano", 72.5, "O+", 1.80);
        dueno1.imprimirDueno();

        auto1.setMotor();
        auto1.getMotor().imprimirMotor();
        auto1.setDueno(dueno1);
        auto1.getDueno().imprimirDueno();

        System.out.println("");

        //Dueno dueno2 = new Dueno("Blanco", 1, 17, 28392183012, "Americano");
        //Motor motor2 = new Motor();





        

    }
}