package Fase2;

public class Invertir{

	public static <T> Node <T> Invertir(Node <T> cabeza){ // cabeza = nodo inicial

		Node <T> anterior = null;
		Node <T> actual = cabeza;
		Node <T> siguiente = null;
		
		while (actual!=null) {
			siguiente = actual.next;
			actual.next = anterior; //aqui hacemos que el nodo apunte a si mis, siendo una lista enlazada circular
			anterior = actual;//mover la referencia de anterior al nodo que está siendo procesado en este momento
			actual = siguiente;//mueve la referencia de actual al siguiente nodo 

		}

		return anterior;
	}
}
