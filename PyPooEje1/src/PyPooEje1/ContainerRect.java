package PyPooEje1;

public class ContainerRect {
    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;
    private static int numRec = 0;

    public ContainerRect(int n) {
        this.n = n;
        rectangulos = new Rectangulo[n];
        distancias = new double[n];
        areas = new double[n];
    }

    public void addRectangulo(Rectangulo r) {
        if (numRec < n) {
            rectangulos[numRec] = r;
            distancias[numRec] = r.getEsquina1().distancia(r.getEsquina2());
            areas[numRec] = r.calculoArea();
            numRec++;
        } else {
            System.out.println("No es posible agregar más rectángulos.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Rectangulo         Coordenadas                          Distancia\n");
        for (int i = 0; i < numRec; i++) {
            sb.append(String.format("%d %s %.3f\n", i + 1, rectangulos[i], distancias[i]));
        }
        return sb.toString();
    }
}
