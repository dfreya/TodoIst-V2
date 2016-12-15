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
    
    /**
     * Mostrar la lista de tareas con numero empezando en 1.
     * Muestra si esta terminada o no.
     */    
    public void mostrarTareas(){
        int posicion = 1;
        for (Tarea tareaAMostrar : listaDeTareas)
        {
            String textoAMostrar = "";
            textoAMostrar = posicion + "-. " + tareaAMostrar.getDescripcion() + ".";
            if (tareaAMostrar.getEstadoTarea())
            {
                textoAMostrar += " HECHO.";
            }
            System.out.println(textoAMostrar);
            posicion ++;
        }
    }
}
