package Actividad;

public class Main {

    public static void main(String[] args) {
        GestorDeTareas<Tarea> gestor = new GestorDeTareas<>();

        gestor.agregarTarea(new Tarea("Hacer cafe", 2));
        gestor.agregarTarea(new Tarea("Revisar correos", 1));
        gestor.agregarTarea(new Tarea("Planificar reunion", 3));

        System.out.println("\nTodas las tareas:");
        gestor.imprimirTareas();

        System.out.println("\n¿Contiene Hacer cafe? " + gestor.contieneTarea(new Tarea("Hacer café", 2)));
        gestor.eliminarTarea(new Tarea("Revisar correos", 1));

        System.out.println("\nDespues de eliminar una tarea:");
        gestor.imprimirTareas();

        System.out.println("\nTarea con mayor prioridad:");
        System.out.println(gestor.obtenerTareaMasPrioritaria());

        gestor.invertirTareas();
        System.out.println("\nTareas invertidas:");
        gestor.imprimirTareas();

        gestor.transferirATareasCompletadas(new Tarea("Hacer cafe", 2));
        System.out.println("\nTareas despues de completar una:");
        gestor.imprimirTareas();
        gestor.mostrarTareasCompletadas();
    }
}