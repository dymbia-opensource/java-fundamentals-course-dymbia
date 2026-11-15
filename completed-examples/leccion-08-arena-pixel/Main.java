// Lección 8: Proyecto final "Arena Pixel" (solución)
import java.util.Scanner;

class Jugador {
    private String nombre;
    private int nivel;
    private int vida;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.vida = 100;
    }

    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public int getVida() { return vida; }

    // La vida siempre se mantiene entre 0 y 100
    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else if (vida > 100) {
            this.vida = 100;
        } else {
            this.vida = vida;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public int calcularAtaque() {
        return nivel * 15;
    }

    public void entrenar() {
        nivel++;
        setVida(vida + 10);
    }

    public void recibirDanio(int danio) {
        setVida(vida - danio);
    }

    public void mostrarFicha() {
        System.out.println(nombre + " | Nivel " + nivel + " | Vida " + vida);
    }
}

public class Main {

    // Pide un número de jugador y repite hasta que sea válido
    static int pedirJugador(Scanner entrada, Jugador[] jugadores) {
        int numero = 0;
        while (numero < 1 || numero > jugadores.length) {
            System.out.print("Elige un jugador (1-" + jugadores.length + "): ");
            numero = entrada.nextInt();
        }
        return numero - 1;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Jugador[] jugadores = new Jugador[3];

        for (int i = 0; i < jugadores.length; i++) {
            System.out.print("Nombre del jugador " + (i + 1) + ": ");
            jugadores[i] = new Jugador(entrada.nextLine());
        }

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n1) Ver jugadores  2) Entrenar  3) Duelo  4) Salir");
            opcion = entrada.nextInt();
            // Si agregas una opción que lea texto con nextLine() (por ejemplo, un jugador nuevo),
            // escribe antes entrada.nextLine(); para limpiar el salto de línea que dejó nextInt().

            if (opcion == 1) {
                for (int i = 0; i < jugadores.length; i++) {
                    System.out.print((i + 1) + ". ");
                    jugadores[i].mostrarFicha();
                }
            } else if (opcion == 2) {
                Jugador j = jugadores[pedirJugador(entrada, jugadores)];
                j.entrenar();
                System.out.println(j.getNombre() + " entrenó y ahora es nivel " + j.getNivel());
            } else if (opcion == 3) {
                Jugador a = jugadores[pedirJugador(entrada, jugadores)];
                Jugador b = jugadores[pedirJugador(entrada, jugadores)];
                if (a == b) {
                    System.out.println("Elige dos jugadores distintos.");
                } else if (!a.estaVivo() || !b.estaVivo()) {
                    System.out.println("Alguien está fuera de combate. ¡Entrénalo primero!");
                } else {
                    int danioA = a.calcularAtaque();
                    b.recibirDanio(danioA);
                    System.out.println(a.getNombre() + " ataca: " + danioA + " de daño.");
                    if (b.estaVivo()) {
                        int danioB = b.calcularAtaque();
                        a.recibirDanio(danioB);
                        System.out.println(b.getNombre() + " contraataca: " + danioB + " de daño.");
                    } else {
                        System.out.println(b.getNombre() + " cayó en combate.");
                    }
                }
            } else if (opcion != 4) {
                System.out.println("Opción no válida.");
            }
        }
        System.out.println("¡Gracias por jugar!");
        entrada.close();
    }
}
