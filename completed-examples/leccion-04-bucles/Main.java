// Lección 4: Bucles (solución)
public class Main {
    public static void main(String[] args) {
        int experiencia = 0;

        for (int i = 1; i <= 5; i++) {
            experiencia += 10;
            System.out.println("Entrenamiento " + i);
        }
        System.out.println("Experiencia total: " + experiencia);

        int vida = 30;
        while (vida > 0) {
            vida -= 10;
            System.out.println("Vida: " + vida);
        }
        // Reto: si quitas la línea "vida -= 10;", la condición nunca cambia
        // y el bucle while se repite para siempre (bucle infinito).
    }
}
