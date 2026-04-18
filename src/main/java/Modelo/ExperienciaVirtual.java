package Modelo;

public class ExperienciaVirtual extends ExperienciaTuristica {

    private String tipoXR;

    public ExperienciaVirtual() {
    }

    public ExperienciaVirtual(String tipoXR, int id, String nombre, String destino, double precio) {
        super(id, nombre, destino, precio);
        this.tipoXR = tipoXR;
    }

    public String getTipoXR() {
        return tipoXR;
    }

    public void setTipoXR(String tipoXR) {
        this.tipoXR = tipoXR;
    }

    public String mostrarDatos() {
        return getId() + " - " + getNombre() + " - " + getDestino() +
               " - $" + getPrecio() + " - XR: " + tipoXR;
    }
}
