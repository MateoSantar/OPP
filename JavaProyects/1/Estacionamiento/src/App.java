import classes.Estacionamiento;
import classes.Vehiculo;

public class App {
    public static void main(String[] args) {
        Estacionamiento estacionamiento = new Estacionamiento(5);

        Vehiculo vehiculo1 = new Vehiculo("ABC123", "123456789");
        Vehiculo vehiculo2 = new Vehiculo("XYZ789", "987654321");

        estacionamiento.AsignarLugar(vehiculo1);
        estacionamiento.AsignarLugar(vehiculo2);
        
        estacionamiento.RetirarVehiculo("ABC123");
        estacionamiento.RetirarVehiculo("XYZ789");

        
    }
}
