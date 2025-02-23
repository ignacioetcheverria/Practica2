public class Principal {
    public static void main(String[] args) {
        int totalPuntos = 10000; // Reducimos el número para evitar desbordamiento
        double piAproximado = Mates.aproximarPi(totalPuntos);

        System.out.println("Aproximación de Pi con " + totalPuntos + " puntos: " + piAproximado);
    }
}
