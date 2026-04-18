package Modelo;

public class Operador extends Usuario {

    private String telefono;

    public Operador() {
    }

    public Operador(int id, String nombre, String correo, String telefono) {
        setId(id);
        setNombre(nombre);
        setCorreo(correo);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}