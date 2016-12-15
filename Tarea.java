
/**
 * 
 */
public class Tarea
{
    // Nombre de la tarea
    private String descripcion;
    // Estado de la tarea , si esta completada o no.
    private boolean estadoTarea;
    

    /**
     * Constructor de la tarea con la descrepcion.
     * La tare se inicializa sin completar.
     */
    public Tarea(String describeTarea)
    {
         descripcion = describeTarea;
         estadoTarea = false;
    }
    
    /**
     * Devuelve el nombre de la tarea.
     */
    public String getDescripcion(){
        return descripcion;
    }
    
    /**
     * Devuelve sie sta acabada la tarea o no.
     */
    public boolean getEstadoTarea(){
        return estadoTarea;
    }
}
