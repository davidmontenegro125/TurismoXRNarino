package Modelo;

public class Administrador extends Usuario {

    private String nivelAcceso;

    public Administrador() {
    }

    public Administrador(int id, String nombre, String correo, String nivelAcceso) {
        setId(id);
        setNombre(nombre);
        setCorreo(correo);
        this.nivelAcceso = nivelAcceso;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
}
