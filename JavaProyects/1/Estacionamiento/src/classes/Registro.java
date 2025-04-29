package classes;


public class Registro {
    private int horadeRetiro,horadeEntrada;
    private Vehiculo vehiculo;

    public Registro(int horadeEntrada, Vehiculo vehiculo) {
        this.horadeEntrada = horadeEntrada;
        this.vehiculo = vehiculo;
    }

    public int getHoradeRetiro() {
        return horadeRetiro;
    }

    public int getHoradeEntrada() {
        return horadeEntrada;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setHoradeRetiro(int horaDeRetiro) {
        this.horadeRetiro = horaDeRetiro;
    }

    public void setHoradeEntrada(int horadeEntrada) {
        this.horadeEntrada = horadeEntrada;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        if (horadeRetiro != 0) {
            return "Vehiculo: " + vehiculo.getPatente() + " | "+ vehiculo.getTelefono() + "\nHora de Entrada = " +horadeEntrada+"\nHora de Retiro = "+horadeRetiro;
        }
            return "Vehiculo: " + vehiculo.getPatente() + " | "+ vehiculo.getTelefono() + "\nHora de Entrada = " +horadeEntrada+"\nVehiculo no retirado";
    }
    
    
    
}
