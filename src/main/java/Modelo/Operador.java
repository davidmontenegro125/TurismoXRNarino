package Modelo;

public class Operador extends Usuario {
     
    private String telefono;
    
    
    //Constructores----------------------------------------------------------------
    public Operador(){
        
    }

    public Operador(int id, String nombre, String correo, String contrasena) {
        super(id, nombre, correo, contrasena);
        this.telefono = telefono;
    }
    
    //getters y setters------------------------------------------------------------

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    //Métodos----------------------------------------------------------------------
    public void registrarExperiencia(ExperienciaTuristica e){
        System.out.println("Experiencia registrada por Operador.");
    }
    
    public void actualizarExperiencia(ExperienciaTuristica e){
        System.out.println("Experiencia actualizada por Operador.");
    }
    
    public void eliminarExperiencia(ExperienciaTuristica e){
        System.out.println("Experiencia eliminada por Operador.");
    }
}
