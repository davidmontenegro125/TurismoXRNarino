package Modelo;

public class ExperienciaVirtual extends ExperienciaTuristica{
    
    private String tecnologiaXR;
    
    //Constructores---------------------------------------------------------------
    public ExperienciaVirtual(){
        
    }

    public ExperienciaVirtual(int id, String nombre, String descripcion, String destino, String tipoTurismo, int disponiblidad) {
        super(id, nombre, descripcion, destino, tipoTurismo, disponiblidad);
        this.tecnologiaXR = tecnologiaXR;
    }
    
    @Override
    public String mostrarDetalle() {
        return "Tipo de turismo: Virtual | Destino: "+destino+" | Tipo de experiencia: "+tecnologiaXR;
    }
    
    //Métodos---------------------------------------------------------------------
    public String getTecnologiaXR(){
        return tecnologiaXR;
    }
    
    public void setTecnologiaXR(String tecnologiaXR){
        this.tecnologiaXR = tecnologiaXR;
    }
}
