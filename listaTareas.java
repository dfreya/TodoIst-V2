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
    
    /**
     * Marca como completada una tarea.
     */
    public void completar(int numeroTarea){
        int posicion= numeroTarea - 1;
        listaDeTareas.get(posicion).completada();
    }
    
    /**
     * 
     */
     public void mostrarTareasCoincidentes(String textoABuscar)
     {
         int posicion = 1;
         int numeroDeCoincidencias = 0;
         String textoAMostrar ="";
         for (Tarea tareaAMostrar : listaDeTareas){
             
             
             if (tareaAMostrar.getDescripcion().contains(textoABuscar)){
                 textoAMostrar = (posicion + "-. " + tareaAMostrar.getDescripcion());
                 if (tareaAMostrar.getEstadoTarea()){
                     textoAMostrar += " HECHO.";
                 }
                 numeroDeCoincidencias ++;
             }   
             System.out.println(textoAMostrar);
             posicion ++;
         }
         
         if (numeroDeCoincidencias == 0){
             System.out.println("No hay tareas que contengan el texto " + textoABuscar + ".");
         }
         else{
              System.out.println("Hay " + numeroDeCoincidencias + " tareas encontradas con el texto " + textoABuscar + " .");
         }
     }
}
