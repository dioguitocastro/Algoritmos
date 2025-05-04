package Fase2;

public class Contar_nodos {

	public static <T> int ContarNodos(Node<T> cabeza) { //cabeza = nodo inicial
        int contador = 0;
        Node<T> temp = cabeza; //asignamos el valor de cabeza a temp para trabajar en este metodo

        while (temp != null) {
            contador++;  // Incrementamos el contador por cada nodo
            temp = temp.next;  // Avanzamos al siguiente nodo
        }
        
        return contador;  // Devolvemos el número total de nodos
    }
}
