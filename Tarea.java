
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
    
}
