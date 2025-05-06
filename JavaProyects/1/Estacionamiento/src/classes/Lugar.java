package classes;


public class Lugar {
    private int id;
    private boolean ocupado;
    private Vehiculo vehiculo;

    public Lugar(int id) {
        this.id = id;
        this.ocupado = false;
        }

    public boolean isOcupado() {
        return ocupado;
    }


    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }




    public Vehiculo getVehiculo() {
        return vehiculo;
    }



    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getId() {
        return id;
    }
}
