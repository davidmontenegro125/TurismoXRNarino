package Modelo;

public class ExperienciaTuristica {

    private int id;
    private String nombre;
    private String destino;
    private double precio;

    public ExperienciaTuristica() {
    }

    public ExperienciaTuristica(int id, String nombre, String destino, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
