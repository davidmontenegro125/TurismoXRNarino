package Modelo;

public class Administrador extends Usuario {
    
    private String nivelAcceso;
    
    //Contrsuctores---------------------------------------------------------------
    public Administrador(){
        
    }

    public Administrador(int id, String nombre, String correo, String contrasena) {
        super(id, nombre, correo, contrasena);
        this.nivelAcceso = nivelAcceso;
    }
    
    
    //getters y setters----------------------------------------------------------

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
    
    
    //Métodos--------------------------------------------------------------------
    public void registrarOperador(Operador o){
        System.out.println("operador registrado.");
    }
    
    public void eliminarOperador(int id){
        System.out.println("operador eliminado.");
    }
    
    public void aprobarExperiencia(ExperienciaTuristica e){
        System.out.println("Experiencia aprobada por Administrador.");
    }
    
    public void desactivarExperiencia(int id){
        System.out.println("Experiencia desactivada por Administrador.");
    }
    
}
