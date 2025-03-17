package PyPooAct1;

public class Verificador {
    static boolean seSobreponen(Rectangulo r1, Rectangulo r2) {
        return !(r1.getEsquina2().getX() <= r2.getEsquina1().getX() ||
                 r2.getEsquina2().getX() <= r1.getEsquina1().getX() ||
                 r1.getEsquina2().getY() <= r2.getEsquina1().getY() ||
                 r2.getEsquina2().getY() <= r1.getEsquina1().getY());
    }

    static boolean estanJuntos(Rectangulo r1, Rectangulo r2) {
        return (r1.getEsquina2().getX() == r2.getEsquina1().getX() ||
                r2.getEsquina2().getX() == r1.getEsquina1().getX() ||
                r1.getEsquina2().getY() == r2.getEsquina1().getY() ||
                r2.getEsquina2().getY() == r1.getEsquina1().getY());
    }
}
