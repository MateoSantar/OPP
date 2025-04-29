package classes;


public class Registro {
    private int horadeRetiro,horadeEntrada;
    private Lugar lugar;
    private Vehiculo vehiculo;

    public Registro(int horadeEntrada, Vehiculo vehiculo,Lugar lugar) {
        this.lugar = lugar;
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

    public Lugar getLugar() {
        return lugar;
    }

    @Override
    public String toString() {
        if (horadeRetiro != 0) {
            return "Lugar: "+lugar.getId()+"\nVehiculo: " + vehiculo.getPatente() + " | "+ vehiculo.getTelefono() + " Hora de Entrada = " +horadeEntrada+" Hora de Retiro = "+horadeRetiro;
        }
            return "Lugar: "+lugar.getId()+"\nVehiculo: " + vehiculo.getPatente() + " | "+ vehiculo.getTelefono() + " Hora de Entrada = " +horadeEntrada+" Vehiculo no retirado";
    }
    
    
    
}
