
import classes.*;
import java.util.ArrayList;
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
                        break;
                    case "0":
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida.");
                        break;
                }
                s.nextLine();
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
        System.out.println("Es una camioneta? (y/n): ");
        String esCamioneta = s.nextLine();
        if (esCamioneta.equalsIgnoreCase("y")) {
            System.out.println("La camioneta tiene caja cerrada? (y/n): ");
            String cajaCerrada = s.nextLine();
            boolean caja = false;
            if (cajaCerrada.equalsIgnoreCase("y")) {
                caja = true;
            }
            est.AsignarLugar(new Camioneta(patente, telefono, caja));
            return;
        }
        est.AsignarLugar(new Vehiculo(patente, telefono));
    }

    private static void RetireVehicle(Estacionamiento est) {
        boolean registersExist = false;
        ArrayList<Registro> lugaresARetirar = new ArrayList<>();
        for (Registro r : est.getRegistros()) {
            if (r.getHoradeRetiro() == 0) {
                registersExist = true;
                lugaresARetirar.add(r);
            }
        }
        if (registersExist) {
            Scanner s = new Scanner(System.in);
            for (Registro r : lugaresARetirar) {
                System.out.println(r);
            }
            System.out.print("Ingrese la patente del vehiculo: ");
            String patenteBuscada = s.nextLine();
            est.RetirarVehiculo(patenteBuscada);
        }else{
            System.out.println("No hay vehiculos para retirar");
        }
    }
    
    private static void ShowRegisters(Estacionamiento est){
        est.ShowRegistros();
    }
}
