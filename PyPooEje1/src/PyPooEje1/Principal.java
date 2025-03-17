package PyPooEje1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContainerRect contenedor = new ContainerRect(10);
        
        System.out.println("Ingrese coordenadas de A (x1, y1, x2, y2): ");
        Rectangulo A = new Rectangulo(new Coordenada(sc.nextDouble(), sc.nextDouble()),
                                      new Coordenada(sc.nextDouble(), sc.nextDouble()));
        contenedor.addRectangulo(A);
        
        System.out.println("Ingrese coordenadas de B (x1, y1, x2, y2): ");
        Rectangulo B = new Rectangulo(new Coordenada(sc.nextDouble(), sc.nextDouble()),
                                      new Coordenada(sc.nextDouble(), sc.nextDouble()));
        contenedor.addRectangulo(B);
        
        System.out.println("\nContenido del contenedor:");
        System.out.println(contenedor);
    }
}