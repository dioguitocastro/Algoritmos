package PyPooAct1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese coordenadas de A (x1, y1, x2, y2): ");
        Rectangulo A = new Rectangulo(new Coordenada(sc.nextDouble(), sc.nextDouble()),
                                      new Coordenada(sc.nextDouble(), sc.nextDouble()));
        
        System.out.println("Ingrese coordenadas de B (x1, y1, x2, y2): ");
        Rectangulo B = new Rectangulo(new Coordenada(sc.nextDouble(), sc.nextDouble()),
                                      new Coordenada(sc.nextDouble(), sc.nextDouble()));
        
        mostrarRectangulo(A);
        mostrarRectangulo(B);
        
        if (Verificador.seSobreponen(A, B)) {
            System.out.println("Los rectangulos se sobreponen.");
            Rectangulo sobreposicion = rectanguloSobre(A, B);
            mostrarRectangulo(sobreposicion);
        } else if (Verificador.estanJuntos(A, B)) {
            System.out.println("Los rectangulos están juntos.");
        } else {
            System.out.println("Los rectangulos son disjuntos.");
        }
    }

    static void mostrarRectangulo(Rectangulo r) {
        System.out.println(r);
    }

    static Rectangulo rectanguloSobre(Rectangulo r1, Rectangulo r2) {
        double x1 = Math.max(r1.getEsquina1().getX(), r2.getEsquina1().getX());
        double y1 = Math.max(r1.getEsquina1().getY(), r2.getEsquina1().getY());
        double x2 = Math.min(r1.getEsquina2().getX(), r2.getEsquina2().getX());
        double y2 = Math.min(r1.getEsquina2().getY(), r2.getEsquina2().getY());
        return new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
    }
}