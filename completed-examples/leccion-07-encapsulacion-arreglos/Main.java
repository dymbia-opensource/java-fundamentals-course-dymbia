// Lección 7: Encapsulación y arreglos (solución)
class Personaje {
    private String nombre;
    private int vida;

    Personaje(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else if (vida > 100) {
            this.vida = 100;
        } else {
            this.vida = vida;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Personaje[] equipo = new Personaje[3];
        equipo[0] = new Personaje("Luna");
        equipo[1] = new Personaje("Kai");
        equipo[2] = new Personaje("Nova");

        for (int i = 0; i < equipo.length; i++) {
            System.out.println(equipo[i].getNombre() + " tiene vida " + equipo[i].getVida());
        }

        // Reto: la vida nunca pasa de 100
        equipo[0].setVida(500);
        System.out.println("Vida de " + equipo[0].getNombre() + ": " + equipo[0].getVida());
    }
}
