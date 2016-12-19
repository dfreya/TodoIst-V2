import java.time.LocalDate;
/**
 * 
 */
public class Tarea
{
    // Nombre de la tarea
    private String descripcion;
    // Estado de la tarea , si esta completada o no.
    private boolean estadoTarea;
    //almacena la prioridad de al tarea.
    private int prioridad;
    //guarda la fecha de vencimiendo.
    private LocalDate fecha;
        
    /**
     * Constructor de la tarea con la descrepcion.
     * La tare se inicializa sin completar.
     */
    public Tarea(String describeTarea)
    {
         descripcion = describeTarea;
         estadoTarea = false;
         prioridad = 0;
         fecha = null;
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
    
    /**
     * Metodo que cambia la tarea ha realizada.
     */
    public void completada(){
        estadoTarea = true;
    }
    
    /**
     * 
     */
      public String toString(){
        String textoADevolver = "";
        if (estadoTarea) {
            textoADevolver = textoADevolver + "HECHA ";
        }
        textoADevolver += fecha + " " + descripcion + "(" + prioridad + ")." ;
        return textoADevolver;
    }
    
    /**
     * 
     */
    public int getPrioridad (){
        return prioridad;
    }
    
    
     /**
     * 
     */
    public void setPrioridad (int nuevaPrioridad){
        if (nuevaPrioridad >= 0 && nuevaPrioridad <= 5){
            prioridad = nuevaPrioridad;
        }        
    }
    
    /**
     * Metodo para fijar la fecha.
     */
    public void setFecha(int dia, int mes, int year){
        fecha = fecha.of(year, mes, dia);
    }
    
}
    
    
    