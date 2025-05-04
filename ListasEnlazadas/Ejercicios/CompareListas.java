package Fase2;

public class CompareListas {

	public <T> boolean Comparar_dosListas(Node<T> cabeza1, Node<T> cabeza2) {
        // Si ambas listas están vacías, son iguales
        if (cabeza1 == null && cabeza2 == null) {
            return true; // al estar vacias serian iguales
        }

        if (cabeza1==null && cabeza2!=null || cabeza1!=null && cabeza2==null) { //Si una esta vacia no son iguales
        	return false;
        }

        // Recorremos ambas listas simultáneamente
        Node<T> actual1 = cabeza1; //"punter" lista 1
        Node<T> actual2 = cabeza2; //"puntero" lsita 2

        while (actual1 != null && actual2 != null) { //mientras los dos aun no sean nulos
            if (!actual1.dato.equals(actual2.dato)) { // se usa "!" para decir esto: si es tru se convierte en false y viceversa
                return false; // en otras palabras si nos son igaules retorna false, sino se salta el "if"
            }
            // Avanzamos al siguiente nodo en ambas listas
            actual1 = actual1.next; //pasamos al siguiente nodo de la lista 1
            actual2 = actual2.next; //pasamos al siguiente nodo de la lista 2
        }

        return actual1 == null && actual2 == null; //Retornara true, ya que tienen mismoslargo, y lograron salir del bucle
    }

}
