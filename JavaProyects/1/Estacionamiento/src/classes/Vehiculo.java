package classes;

public class Vehiculo {
    private String patente,telefono;


    public Vehiculo(String patente, String telefono) {
        this.patente = patente;
        this.telefono = telefono;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
