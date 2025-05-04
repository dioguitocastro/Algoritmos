package Fase2;

public class Main {

    public static void main(String[] args) {
        Node<Integer> lista1 = null; //creamos lista 1 con valores enteros
        Node<Integer> lista2 = null; //lista 2 con enteros
        Node<Integer> lista3 = null; //lista 3 con enteros

        // Insertar valores en lista1
        lista1 = Insert_final.insertLast(lista1, 1);
        lista1 = Insert_final.insertLast(lista1, 2);
        lista1 = Insert_final.insertLast(lista1, 3);

        // Insertar valores en lista2
        lista2 = Insert_final.insertLast(lista2, 4);
        lista2 = Insert_final.insertLast(lista2, 5);
        lista2 = Insert_final.insertLast(lista2, 6);

        // Crear una copia de lista1 para compararla más adelante
        lista3 = Insert_final.insertLast(lista3, 1);
        lista3 = Insert_final.insertLast(lista3, 2);
        lista3 = Insert_final.insertLast(lista3, 3);

        System.out.println("Lista 1:");
        imprimirLista(lista1); //imprimir lista 1

        System.out.println("Lista 2:");
        imprimirLista(lista2); //imprimi lista 2

        // Concatenar lista1 y lista2
        Node<Integer> listaConcatenada = ConcatenarListas.concatenarListas(lista1, lista2);
        System.out.println("Lista concatenada:");
        imprimirLista(listaConcatenada);

        // Buscar un valor
        System.out.println("Buscar 3 en la lista concatenada: " + Search.Search(listaConcatenada, 3));

        // Contar nodos
        System.out.println("Número de nodos en la lista concatenada: " + Contar_nodos.ContarNodos(listaConcatenada));

        // Invertir lista
        listaConcatenada = Invertir.Invertir(listaConcatenada);
        System.out.println("Lista invertida:");
        imprimirLista(listaConcatenada);

        // Comparar lista1 original con lista3 (deben ser iguales)
        CompareListas comparador = new CompareListas();
        boolean sonIguales = comparador.Comparar_dosListas(lista1, lista3);
        System.out.println("¿Lista 1 y Lista 3 son iguales? " + sonIguales);

        // Comparar lista1 con lista2 (deben ser diferentes)
        boolean sonIguales2 = comparador.Comparar_dosListas(lista1, lista2);
        System.out.println("¿Lista 1 y Lista 2 son iguales? " + sonIguales2);
        
        //Añade elemetno "1" al final de la lista 1
        lista1 = Insert_final.insertLast(lista1, 1);
        System.out.println("Lista 1:");
        imprimirLista(lista1);


    }

    public static <T> void imprimirLista(Node<T> cabeza) { //metodo que nos mostrará los elemetnos d ela listas
        Node<T> temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
