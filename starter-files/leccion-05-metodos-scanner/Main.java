// Lección 5: Métodos y Scanner (archivo base)
import java.util.Scanner;

public class Main {

    // TODO 1: crea static void saludar(String nombre) que imprima "¡Hola, <nombre>!"

    // TODO 2: crea static int calcularDanio(int nivel) que devuelva nivel * 5

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // TODO 3: pide el nombre con System.out.print y léelo con entrada.nextLine()
        // TODO 4: pide el nivel y léelo con entrada.nextInt()
        // TODO 5: llama a saludar(...) e imprime "Tu daño es " + el daño calculado

        entrada.close();
    }
}
