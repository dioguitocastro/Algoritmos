package ejercicio;

interface Operable<E extends Number> {
    E suma(E a, E b);
    E resta(E a, E b);
    E producto(E a, E b);
    E division(E a, E b);
    E potencia(E base, E exponente);
    E raizCuadrada(E a);
    E raizCubica(E a);
}