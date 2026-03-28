package Modelo;


public class Usuario {
    int id;
    String nombre;
    String correo;
    String contrasena;
    
    //Constructores--------------------------------------------------------------------
    public Usuario(){
        
    }
    
    public Usuario(int id, String nombre, String correo, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    //getters y setters-----------------------------------------------------------------
    
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    //Métodos----------------------------------------------------------------------
    public boolean iniciarSesion(){
        return true;
    }
    
    public void cerrarSesion(){
        System.out.println("Sesión cerrada.");
    }
    
}
