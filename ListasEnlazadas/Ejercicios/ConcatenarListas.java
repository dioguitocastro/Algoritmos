package Fase2;

public class ConcatenarListas {

    public static <T> Node<T> concatenarListas(Node<T> lista1, Node<T> lista2) {
        if (lista1 == null) return lista2; //si al concatenar las lsitas una de esas está vacia 
        if (lista2 == null) return lista1; //retornarnaría la lista que tiene elementos, asimilando que
                                           //se concatenaron
        
        Node<T> temp = lista1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = lista2; //recorrera toda la primera lista, y se añadira al final toda la lista

        return lista1;
    }
}
