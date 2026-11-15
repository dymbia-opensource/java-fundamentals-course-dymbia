// Lección 7: Encapsulación y arreglos (archivo base)
class Personaje {
    // TODO 1: cambia los atributos a private
    String nombre;
    int vida;

    Personaje(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
    }

    // TODO 2: crea public String getNombre() y public int getVida()

    // TODO 3: crea public void setVida(int vida)
    //         la vida nunca debe quedar menor que 0 ni mayor que 100
}

public class Main {
    public static void main(String[] args) {
        Personaje[] equipo = new Personaje[3];
        // TODO 4: llena el arreglo con 3 personajes usando new
        // TODO 5: recorre el arreglo con un for y muestra el nombre y la vida de cada uno
        // TODO 6 (reto): asigna vida 500 al primer personaje y comprueba que queda en 100
    }
}
