package function;

public class Comensal {
    String nombre;
    double cuenta;
    int mesa;

    public Comensal(String nombre, double cuenta, int mesa) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.mesa = mesa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
}
