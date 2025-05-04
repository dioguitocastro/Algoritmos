package Fase2;

public class Insert_final {

	 public static <T> Node<T> insertLast(Node<T> cabeza, T valor) { //cabeza = nodo inicial y valor = lo que insertaremos
	        Node<T> nuevoNodo = new Node<>(valor);  // Crear un nuevo nodo con el valor mandado

	        if (cabeza == null) { // Si la lista está vacía el nuevo nodo se convierte en el inicial
	            cabeza = nuevoNodo;  
	        } 
	        else {
	            Node<T> temp = cabeza; //asignamos cabeza como el "puntero"
	            
	            while (temp.next != null) {
	                temp = temp.next;  // Avanzamos hasta el último nodo
	            }

	            temp.next = nuevoNodo; // Enlazamos el nuevo nodo al final de la lista
	            //se pone primero temp.next, para que apunte al nuevo valor , xq si lo ponemos al reves
	            //se asignaria el valor de null a nuevoNodo
	        }

	        return cabeza;  // Devolvemos la cabeza de la lista
	    }
}
