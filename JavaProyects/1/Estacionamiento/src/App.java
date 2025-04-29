
import classes.Estacionamiento;
import classes.Vehiculo;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String option;
        Scanner s = new Scanner(System.in);

        System.out.println("Bienvenido a mi sistema de estacionamiento!");
        System.out.println("Cuantos lugares tiene su estacionamiento? ");
        try {
            int lugaresLibres = Integer.parseInt(s.nextLine());
            if (lugaresLibres <= 0) {
                System.out.println("No ha ingresado un valor valido");
                return;
            }
            Estacionamiento est = new Estacionamiento(lugaresLibres);
            do {
                System.out.println("1. Asignar lugar.");
                System.out.println("2. Retirar vehiculo.");
                System.out.println("3. Listar Registros.");
                System.out.println("0. Salir");
                System.out.print("Que desea hacer: ");
                option = s.nextLine();
                switch (option) {
                    case "1":
                        InsertVehicle(est);
                        break;
                    case "2":
                        RetireVehicle(est);
                        break;
                    case "3":
                        ShowRegisters(est);
                    case "0":
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida.");
                        break;
                }
                
            } while (!"0".equals(option));
        } catch (NumberFormatException e) {
            System.err.println("No ha ingresado un valor valido");
        }

    }

    private static void InsertVehicle(Estacionamiento est) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese la patente del vehiculo: ");
        String patente = s.nextLine();
        System.out.print("Ingrese el telefono del propietario: ");
        String telefono = s.nextLine();
        est.AsignarLugar(new Vehiculo(patente, telefono));
    }

    private static void RetireVehicle(Estacionamiento est) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese la patente del vehiculo: ");
        String patenteBuscada = s.nextLine();
        est.RetirarVehiculo(patenteBuscada);
    }
    
    private static void ShowRegisters(Estacionamiento est){
        est.ShowRegistros();
    }
}
