package ejercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperacionesMat<Integer> operacionesInt = new OperacionesMat<>();
        OperacionesMat<Double> operacionesDouble = new OperacionesMat<>();

        while (true) {
            menuTipoDato();
            int tipoDato = sc.nextInt();

            if (tipoDato == 3) break;

            menuOperaciones();
            int operacion = sc.nextInt();

            if (tipoDato == 1) {
                System.out.println("Ingrese el primer número: ");
                int num1 = sc.nextInt();
                int num2 = (operacion <= 4) ? obtenerSegundoNumero(sc) : 0;
                realizarOperacion(operacionesInt, operacion, num1, num2);
            } else if (tipoDato == 2) {
                System.out.println("Ingrese el primer número: ");
                double num1 = sc.nextDouble();
                double num2 = (operacion <= 4) ? obtenerSegundoNumeroDouble(sc) : 0.0;
                realizarOperacion(operacionesDouble, operacion, num1, num2);
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }

    private static int obtenerSegundoNumero(Scanner sc) {
        System.out.println("Ingrese el segundo número: ");
        return sc.nextInt();
    }

    private static double obtenerSegundoNumeroDouble(Scanner sc) {
        System.out.println("Ingrese el segundo número: ");
        return sc.nextDouble();
    }

    private static <E extends Number> void realizarOperacion(OperacionesMat<E> op, int operacion, E num1, E num2) {
        switch (operacion) {
            case 1 -> System.out.println("Resultado: " + op.suma(num1, num2));
            case 2 -> System.out.println("Resultado: " + op.resta(num1, num2));
            case 3 -> System.out.println("Resultado: " + op.producto(num1, num2));
            case 4 -> System.out.println("Resultado: " + op.division(num1, num2));
            case 5 -> System.out.println("Resultado: " + op.potencia(num1, num2));
            case 6 -> System.out.println("Resultado: " + op.raizCuadrada(num1));
            case 7 -> System.out.println("Resultado: " + op.raizCubica(num1));
            default -> System.out.println("Opción no válida.");
        }
    }

    private static void menuOperaciones() {
        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma\n2. Resta\n3. Producto\n4. División\n5. Potencia\n6. Raíz Cuadrada\n7. Raíz Cúbica");
    }

    private static void menuTipoDato() {
        System.out.println("Seleccione el tipo de dato:");
        System.out.println("1. Entero\n2. Double\n3. Salir");
    }
}