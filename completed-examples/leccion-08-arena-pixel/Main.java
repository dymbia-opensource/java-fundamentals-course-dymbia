// Lección 8: Proyecto final "Arena Pixel" (versión automática sin Scanner)
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

    static void mostrarEquipo(Jugador[] jugadores) {
        for (int i = 0; i < jugadores.length; i++) {
            System.out.print((i + 1) + ". ");
            jugadores[i].mostrarFicha();
        }
    }

    static void realizarDuelo(Jugador a, Jugador b) {
        System.out.println("\n--- DUELO: " + a.getNombre() + " vs " + b.getNombre() + " ---");
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
    }

    public static void main(String[] args) {
        // 1. Creamos el arreglo con 3 jugadores listos
        Jugador[] jugadores = new Jugador[3];
        jugadores[0] = new Jugador("Luna");
        jugadores[1] = new Jugador("Kai");
        jugadores[2] = new Jugador("Nova");

        System.out.println("=== EQUIPO INICIAL ===");
        mostrarEquipo(jugadores);

        // 2. Entrenamos a Luna (sube a nivel 2)
        System.out.println("\n=== ENTRENAMIENTO ===");
        jugadores[0].entrenar();
        System.out.println(jugadores[0].getNombre() + " entrenó y ahora es nivel " + jugadores[0].getNivel());

        // 3. Simulamos un duelo entre Luna (nivel 2) y Kai (nivel 1)
        realizarDuelo(jugadores[0], jugadores[1]);

        // 4. Mostramos el estado final de todos
        System.out.println("\n=== ESTADO FINAL ===");
        mostrarEquipo(jugadores);
        System.out.println("\n¡Gracias por jugar!");
    }
}