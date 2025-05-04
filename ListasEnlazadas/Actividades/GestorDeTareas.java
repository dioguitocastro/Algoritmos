package Actividad;

import java.util.ArrayList;
import java.util.List;

public class GestorDeTareas<T> {
    private Node<T> head;
    private List<T> tareasCompletadas;

    public GestorDeTareas() {
        this.head = null;
        this.tareasCompletadas = new ArrayList<>();
    }

    public void agregarTarea(T tarea) {
        Node<T> nuevo = new Node<>(tarea);
        if (head == null) {
            head = nuevo;
        } else {
            Node<T> actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = nuevo;
        }
    }

    public boolean eliminarTarea(T tarea) {
        if (head == null) return false;

        if (head.contenido.equals(tarea)) {
            head = head.next;
            return true;
        }

        Node<T> actual = head;
        while (actual.next != null && !actual.next.contenido.equals(tarea)) {
            actual = actual.next;
        }

        if (actual.next != null) {
            actual.next = actual.next.next;
            return true;
        }

        return false;
    }

    public boolean contieneTarea(T tarea) {
        Node<T> actual = head;
        while (actual != null) {
            if (actual.contenido.equals(tarea)) return true;
            actual = actual.next;
        }
        return false;
    }

    public void imprimirTareas() {
        if (head == null) {
            System.out.println("No hay tareas pendientes.");
            return;
        }
        Node<T> actual = head;
        while (actual != null) {
            System.out.println(actual.contenido);
            actual = actual.next;
        }
    }

    public int contarTareas() {
        int contador = 0;
        Node<T> actual = head;
        while (actual != null) {
            contador++;
            actual = actual.next;
        }
        return contador;
    }

    public T obtenerTareaMasPrioritaria() {
        if (head == null || !(head.contenido instanceof Tarea)) return null;

        Node<T> actual = head;
        Tarea tareaMayor = (Tarea) actual.contenido;

        while (actual != null) {
            Tarea t = (Tarea) actual.contenido;
            if (t.getPrioridad() > tareaMayor.getPrioridad()) {
                tareaMayor = t;
            }
            actual = actual.next;
        }

        return (T) tareaMayor;
    }

    public void invertirTareas() {
        Node<T> prev = null;
        Node<T> actual = head;
        Node<T> siguiente;

        while (actual != null) {
            siguiente = actual.next;
            actual.next = prev;
            prev = actual;
            actual = siguiente;
        }

        head = prev;
    }

    public void transferirATareasCompletadas(T tarea) {
        if (eliminarTarea(tarea)) {
            tareasCompletadas.add(tarea);
        } else {
            System.out.println("No se encontró la tarea para completar.");
        }
    }

    public void mostrarTareasCompletadas() {
        if (tareasCompletadas.isEmpty()) {
            System.out.println("No hay tareas completadas.");
            return;
        }

        System.out.println("Tareas Completadas:");
        for (T t : tareasCompletadas) {
            System.out.println(t);
        }
    }
}
