package ejercicio;

class OperacionesMat<E extends Number> implements Operable<E> {
    @Override
    public E suma(E a, E b) { return convertir(a.doubleValue() + b.doubleValue(), a); }

    @Override
    public E resta(E a, E b) { return convertir(a.doubleValue() - b.doubleValue(), a); }

    @Override
    public E producto(E a, E b) { return convertir(a.doubleValue() * b.doubleValue(), a); }

    @Override
    public E division(E a, E b) {
        if (b.doubleValue() == 0) throw new ArithmeticException("División por cero.");
        return convertir(a.doubleValue() / b.doubleValue(), a);
    }

    @Override
    public E potencia(E base, E exponente) {
        return convertir(Math.pow(base.doubleValue(), exponente.doubleValue()), base);
    }

    @Override
    public E raizCuadrada(E a) {
        return convertir(Math.sqrt(a.doubleValue()), a);
    }

    @Override
    public E raizCubica(E a) {
        return convertir(Math.cbrt(a.doubleValue()), a);
    }

    private E convertir(double valor, E referencia) {
        if (referencia instanceof Integer) return (E) Integer.valueOf((int) valor);
        if (referencia instanceof Double) return (E) Double.valueOf(valor);
        throw new UnsupportedOperationException("Tipo no soportado");
    }
}
