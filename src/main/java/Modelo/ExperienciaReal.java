package Modelo;

public class ExperienciaReal extends ExperienciaTuristica{
    
    private String tipoTransporte;
    
    
    //Contructores---------------------------------------------------------------
    public ExperienciaReal(){
        
    }

    public ExperienciaReal(int id, String nombre, String descripcion, String destino, String tipoTurismo, int disponiblidad) {
        super(id, nombre, descripcion, destino, tipoTurismo, disponiblidad);
        this.tipoTransporte = tipoTransporte;
    }
    
    @Override
    public String mostrarDetalle() {
        return "Tipo de turismo: Real | Destino: "+destino+" | Tipo de transporte: "+tipoTransporte;
    }
    
    
    //Métodos---------------------------------------------------------------------
    public String getTipoTransporte(){
        return tipoTransporte;
    }
    
    public void setTipoTransporte(String tipoTransporte){
        this.tipoTransporte = tipoTransporte;
    }
}
