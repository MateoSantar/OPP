package classes;


public class Registro {
    private int horaDeRetiro,horadeEntrada;
    private Vehiculo vehiculo;

    public Registro(int horadeEntrada, Vehiculo vehiculo) {
        this.horadeEntrada = horadeEntrada;
        this.vehiculo = vehiculo;
    }

    public int getHoraDeRetiro() {
        return horaDeRetiro;
    }

    public int getHoradeEntrada() {
        return horadeEntrada;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setHoraDeRetiro(int horaDeRetiro) {
        this.horaDeRetiro = horaDeRetiro;
    }

    public void setHoradeEntrada(int horadeEntrada) {
        this.horadeEntrada = horadeEntrada;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        if (horaDeRetiro != 0) {
            return "Vehiculo: " + vehiculo.getPatente() + " | "+ vehiculo.getTelefono() + "\nHora de Entrada = " +horadeEntrada+"\nHora de Retiro = "+horaDeRetiro;
        }
            return "Vehiculo: " + vehiculo.getPatente() + " | "+ vehiculo.getTelefono() + "\nHora de Entrada = " +horadeEntrada+"\nVehiculo no retirado";
    }
    
    
    
}
