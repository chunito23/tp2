import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Empresa {
    int idCliente = 0;
    int idAlquiler = 0;
    private Map<String,String> patentes = new HashMap<>();
    private Map<Integer,Clientes> Cliente = new HashMap<>();
    private Map<Integer,Alquiler> alquileres = new HashMap<>();


    public void prestar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("que vehiculo quiere 1-auto comun 2-auto vip 3-combi 4-flete 5-camion cargar");
        int opcion = sc.nextInt();
        sc.next();
        if (opcion == 1){

            System.out.println("ingrese patente: ");
            String patente = sc.nextLine();
            if (patentes.containsKey(patente)){
                System.out.println("patente usada");
            }
            AutosPasajeros auto = new AutosPasajeros(3000,3,"dawdaw23",true);
        }
    }
}
