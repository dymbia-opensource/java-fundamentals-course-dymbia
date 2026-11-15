// Lección 6: Clases y objetos (solución)
class Personaje {
    String nombre;
    int nivel;
    int vida;

    Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = 100;
    }

    void presentarse() {
        System.out.println("Soy " + nombre + ", nivel " + nivel);
    }

    void subirNivel() {
        nivel = nivel + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Personaje luna = new Personaje("Luna", 1);
        Personaje kai = new Personaje("Kai", 3);

        luna.presentarse();
        kai.presentarse();

        luna.subirNivel();
        luna.presentarse();
    }
}
