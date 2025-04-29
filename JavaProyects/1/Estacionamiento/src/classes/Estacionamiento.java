package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Estacionamiento {

    private int cantDeLugares;
    private ArrayList<Lugar> lugares;
    private ArrayList<Registro> registros;

    public Estacionamiento(int cantDeLugares) {
        this.cantDeLugares = cantDeLugares;
        this.lugares = new ArrayList<>(cantDeLugares);
        for (int i = 0; i < cantDeLugares; i++) {
            lugares.add(new Lugar(i + 1));
        }
        this.registros = new ArrayList<Registro>();
    }

    public void AsignarLugar(Vehiculo vehiculo) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Lugar> lugaresLibres = new HashMap<>();

        for (Lugar lugar : lugares) {
            if (!lugar.isOcupado()) {
                lugaresLibres.put(lugar.getId(), lugar);
            }
        }

        if (lugaresLibres.isEmpty()) {
            System.out.println("No hay lugares disponibles.");
            return;
        }

        try {

            System.out.print("Lugares disponibles: ");
            for (Lugar lugar : lugaresLibres.values()) {
                System.out.print(lugar.getId() + " ");
            }

            System.out.println("\nSelecciona un lugar");

            int lugarSeleccionado = scanner.nextInt();

            if (!lugaresLibres.containsKey(lugarSeleccionado)) {
                System.out.println("Lugar no disponible. Seleccione un lugar valido.");
                return;
            }
            scanner.nextLine();
            System.out.println("Ingrese la hora de ocupacion (0-23): ");
            int horaDeOcupacion = scanner.nextInt();
            if (horaDeOcupacion < 0 || horaDeOcupacion > 23) {
                System.out.println("Hora de ocupacion invalida. Debe ser entre 0 y 23.");
                return;
            }

            Lugar lugar = lugaresLibres.get(lugarSeleccionado);
            lugar.setOcupado(true);
            lugar.setVehiculo(vehiculo);
            registros.add(new Registro(horaDeOcupacion, vehiculo));
            System.out.println("Vehiculo " + vehiculo.getPatente() + " asignado al lugar " + lugarSeleccionado + " a las " + horaDeOcupacion + ":00.");

        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Debe ingresar un numero entre 0 y 23.");
            return;

        }
    }

    public void RetirarVehiculo(String patente) {
        Scanner scanner = new Scanner(System.in);
        boolean vehiculoEncontrado = false;

        for (Lugar lugar : lugares) {
            if (lugar.isOcupado() && lugar.getVehiculo().getPatente().equals(patente)) {
                System.out.println("Ingrese la hora de retiro (0-23): ");
                int horaDeRetiro = scanner.nextInt();
                if (horaDeRetiro < 0 || horaDeRetiro > 23) {
                    System.out.println("Hora de retiro invalida. Debe ser entre 0 y 23.");
                    return;
                }
                vehiculoEncontrado = true;
                lugar.setOcupado(false);
                lugar.setVehiculo(null);
                for (Registro r : registros) {
                    if (r.getVehiculo().equals(lugar.getVehiculo())) {
                        r.setHoraDeRetiro(horaDeRetiro);
                    }
                }
                System.out.println("Vehiculo " + patente + " retirado del lugar " + lugar.getId() + " a las " + horaDeRetiro + ":00.");
                break;
            }
        }

        if (!vehiculoEncontrado) {
            System.out.println("Vehiculo no encontrado.");
        }

    }

    public void ShowRegistros() {
        if (registros.isEmpty()) {
            System.out.println("No hay registros");
        } else {
            for (Registro r : registros) {
                System.out.println(r.toString());
            }
        }

    }

    public ArrayList<Lugar> getLugares() {
        return lugares;
    }
}
