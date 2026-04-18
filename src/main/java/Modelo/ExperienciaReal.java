package Modelo;

public class ExperienciaReal extends ExperienciaTuristica {

    private int cupos;
    private String tipoTransporte;

    public ExperienciaReal() {
    }

    public ExperienciaReal(int cupos, String tipoTransporte, int id, String nombre, String destino, double precio) {
        super(id, nombre, destino, precio);
        this.cupos = cupos;
        this.tipoTransporte = tipoTransporte;
    }


    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }
    

    public String mostrarDatos() {
        return getId() + " - " + getNombre() + " - " + getDestino() +
               " - "+tipoTransporte+" - $" + getPrecio() + " - Cupos: " + cupos;
    }
}
