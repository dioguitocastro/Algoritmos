package PyPooEje1;

public class Rectangulo {
    private Coordenada esquina1, esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2) {
        double xMin = Math.min(c1.getX(), c2.getX());
        double yMin = Math.min(c1.getY(), c2.getY());
        double xMax = Math.max(c1.getX(), c2.getX());
        double yMax = Math.max(c1.getY(), c2.getY());
        
        this.esquina1 = new Coordenada(xMin, yMin);
        this.esquina2 = new Coordenada(xMax, yMax);
    }

    public Coordenada getEsquina1() { return esquina1; }
    public Coordenada getEsquina2() { return esquina2; }

    double calculoArea() {
        return Math.abs((esquina2.getX() - esquina1.getX()) * (esquina2.getY() - esquina1.getY()));
    }

    public String toString() {
        return String.format("Rectangulo[%s, %s] con area: %.2f", esquina1, esquina2, calculoArea());
    }
}