package Actividad;

public class Node <T>{
	T contenido; // el tipo de dato que se va a asignar al arreglo
	Node<T> next; //esto hace que sea una lista enlazada y puede almacenar cualquier tipo
	//es un atributo de instancia por eso no se pone dentro de los () del constructor 

	public Node(T contenido) {
		this.contenido=contenido;
		this.next=null;//asignamos null, ya que no hay ningun dato al que haga referencia en el momento y nos mostraria un error
	}
}