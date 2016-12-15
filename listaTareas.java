 import java.util.ArrayList;
/**
 *
 */
public class listaTareas
{
    //
    private ArrayList<Tarea> listaDeTareas;

    /**
     * Constructor de la lista de Tareas.
     */
    public listaTareas()
    {
        listaDeTareas = new ArrayList<Tarea>();
    }
    
    /**
     * Añadir una tarea.
     */
    public void añadirTarea(String descripcion){
        Tarea nuevaTarea = new Tarea(descripcion);
        listaDeTareas.add(nuevaTarea);
    }

}
