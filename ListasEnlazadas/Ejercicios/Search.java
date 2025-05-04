package Fase2;

public class Search {

	public static <T> boolean Search(Node <T> cabeza, T valor) {

		Node <T> temp = cabeza; //temp recibe el primer valor del nodo de la lista, asignado por cabeza

		while (temp!=null) { //mientras el nodoo no este vacio hara eso...

			if (temp.dato.equals(valor)) {// si el dato (contenido) del nodo (temp) es igaul al valor (dato recibido)

				return true; //se envia true, ya que el metodo equals es booleano

			}

			

			temp =temp.next;//esto hace que el nodo apuynte al sigueinte, para que no sea bucle infinito

		}

		

		return false;

	}

}
