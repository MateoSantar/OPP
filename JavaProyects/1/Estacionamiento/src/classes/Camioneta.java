package classes;

public class Camioneta extends Vehiculo {

    private boolean cajaCerrada;

    public Camioneta(String patente, String telefono, boolean cajaCerrada) {
        super(patente, telefono);
        this.cajaCerrada = cajaCerrada;
    }

    public boolean isCajaCerrada() {
        return cajaCerrada;
    }

    public void setCajaCerrada(boolean cajaCerrada) {
        this.cajaCerrada = cajaCerrada;
    }

    @Override
    public String toString() {
        return "Camioneta [patente=" + getPatente() + ", telefono=" + getTelefono() + ", cajaCerrada=" + cajaCerrada + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Camioneta other = (Camioneta) obj;
        return cajaCerrada == other.cajaCerrada &&
                (getPatente() == null ? other.getPatente() == null : getPatente().equals(other.getPatente())) &&
                (getTelefono() == null ? other.getTelefono() == null : getTelefono().equals(other.getTelefono()));
    }
}

