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
            System.out.println(listaDeTareas.get(posicion -1).toString());
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
     * Mustra las tareas con Coincidencias.
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

    /**
     * Elimina una tarea seleccionada.
     */
    public void eliminarTarea (int numeroTarea){
        int posicion = numeroTarea -1;
        if (posicion >= 0 && posicion < listaDeTareas.size()){
            listaDeTareas.remove(posicion);
        }        
    }

    /**
     * Metodo que fija la prioridad de la tarea.
     */
    public void cambiarPrioridad(int numeroTarea, int numeroPrioridad){
        int posicion = numeroTarea - 1;
        if (posicion >= 0 && posicion < listaDeTareas.size()){
            if (numeroPrioridad >=0 && numeroPrioridad <=5){
                listaDeTareas.get(posicion).setPrioridad(numeroPrioridad);
            }           
        }        
    }

    /**
     * Metodo que fija la fecha final de la tarea.
     */
    public void setFecha(int posicion,int dia, int mes, int year){
        posicion = posicion - 1;
        if (posicion >= 0 && posicion < listaDeTareas.size()){
            listaDeTareas.get(posicion).setFecha(year, mes, dia);   
        }
    }
}

