import java.util.Random;
public class Mates {
    private static Random random = new Random();

    public static double aproximarPi(int totalPuntos) {
        int puntosDentro = 0;

        for (int i = 0; i < totalPuntos; i++) {
            double x = random.nextDouble() * 2 - 1;
            double y = random.nextDouble() * 2 - 1;

            if (x * x + y * y <= 1) {
                puntosDentro++;
            }
        }

        return 4.0 * puntosDentro / totalPuntos;
    }
}
