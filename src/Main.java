import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Dueno dueno1 = new Dueno("negro",2,19,17242657,"Ecuador",5.6,"0+");
        
        Motor motor1 = new Motor(2,"atun");
        Motor motor2 = new Motor(2,"arroz");
        
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();
        
        Map<String, Auto> mapAutos = new HashMap<>();

        mapAutos.put("Negro",auto1);
        mapAutos.put("rjo",auto1);
        mapAutos.put("azul",auto1);

        System.out.println("El auto es color negro tiene: "+mapAutos.get("Negro").getNumeroRuedas()+"de ruedas");
        System.out.println("El auto es color rjo tiene: "+mapAutos.get("rjo").getNumeroRuedas()+"de ruedas");

        mapAutos.remove("rjo");
//Conectores (buscar e invetigar para entender de una mejor manera)
        List<Auto> listaAutos =







    }
}