package Modelo;

public abstract class ExperienciaTuristica {
    
    protected int id;
    protected String nombre;
    protected String descripcion;
    protected String destino;
    protected String tipoTurismo;
    protected int disponiblidad;
    
    //Constructores--------------------------------------------------------------
    public ExperienciaTuristica(){
        
    }

    public ExperienciaTuristica(int id, String nombre, String descripcion, String destino, String tipoTurismo, int disponiblidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.destino = destino;
        this.tipoTurismo = tipoTurismo;
        this.disponiblidad = disponiblidad;
    }
    
    
    //getters y setters

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTipoTurismo() {
        return tipoTurismo;
    }

    public void setTipoTurismo(String tipoTurismo) {
        this.tipoTurismo = tipoTurismo;
    }

    public int getDisponiblidad() {
        return disponiblidad;
    }

    public void setDisponiblidad(int disponiblidad) {
        this.disponiblidad = disponiblidad;
    }
    
    
    //Métodos--------------------------------------------------------------------
    public abstract String mostrarDetalle();
    
    public void actualizarDisponibilidad(int cantidad){
        this.disponiblidad = cantidad;
    }
}
