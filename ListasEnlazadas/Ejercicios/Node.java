package Fase2;

public class Node <T> {

	T dato; //variable que se almacenarar de tipo generico

	Node<T> next;// creamos el "puntero" que nos ayudara a trabajar con nodos

	

	public Node (T valor) { //constructor

		this.dato=valor;

		this.next=null;

	}

}
