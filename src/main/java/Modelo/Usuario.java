package Modelo;

public class Usuario extends Persona {

    public Usuario() {
    }

    public Usuario(int id, String nombre, String correo) {
        setId(id);
        setNombre(nombre);
        setCorreo(correo);
    }

    public String mostrarDatos() {
        return getId() + " - " + getNombre() + " - " + getCorreo();
    }
}
