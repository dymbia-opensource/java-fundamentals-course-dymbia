// Lección 5: Métodos y Scanner (solución)
import java.util.Scanner;

public class Main {

    static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    static int calcularDanio(int nivel) {
        return nivel * 5;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = entrada.nextLine();

        System.out.print("¿Qué nivel tienes? ");
        int nivel = entrada.nextInt();

        saludar(nombre);
        System.out.println("Tu daño es " + calcularDanio(nivel));

        entrada.close();
    }
}
