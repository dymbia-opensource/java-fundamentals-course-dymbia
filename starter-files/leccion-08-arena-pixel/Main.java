// Lección 8: Proyecto final "Arena Pixel" (archivo base)
import java.util.Scanner;

class Jugador {
    private String nombre;
    private int nivel;
    private int vida;

    // TODO 1: crea el constructor Jugador(String nombre): nivel 1 y vida 100

    // TODO 2: crea los getters getNombre(), getNivel() y getVida()

    // TODO 3: crea setVida(int vida) con validación entre 0 y 100

    // TODO 4: crea boolean estaVivo() -> true si la vida es mayor que 0

    // TODO 5: crea int calcularAtaque() -> nivel * 15

    // TODO 6: crea void entrenar() -> sube 1 de nivel y recupera 10 de vida

    // TODO 7: crea void recibirDanio(int danio) usando setVida

    // TODO 8: crea void mostrarFicha() -> "Nombre | Nivel x | Vida y"
}

public class Main {

    // TODO 9: crea static int pedirJugador(Scanner entrada, Jugador[] jugadores)
    //         que repita con while hasta que el número esté entre 1 y jugadores.length
    //         y devuelva la posición (número - 1)

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Jugador[] jugadores = new Jugador[3];

        // TODO 10: con un for, pide el nombre de cada jugador (nextLine) y crea los objetos

        int opcion = 0;
        // TODO 11: con un while (opcion != 4) muestra el menú:
        //          1) Ver jugadores  2) Entrenar  3) Duelo  4) Salir
        //          y lee la opción con nextInt()
        // TODO 12: con if / else if, programa cada opción:
        //          1 -> recorrer el arreglo y mostrar las fichas
        //          2 -> elegir un jugador con pedirJugador y entrenarlo
        //          3 -> elegir dos jugadores distintos; si ambos están vivos,
        //               el primero ataca y, si el segundo sigue vivo, contraataca
        //          otra opción distinta de 4 -> "Opción no válida."

        System.out.println("¡Gracias por jugar!");
        entrada.close();
    }
}
