// Lección 3: Operadores y decisiones (solución)
public class Main {
    public static void main(String[] args) {
        int nivel = 7;
        int monedas = 40;
        boolean tieneLlave = true;

        int puntosTotales = nivel * 10 + monedas;
        System.out.println("Puntos totales: " + puntosTotales);

        if (nivel >= 5 && tieneLlave) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("Todavía no");
        }

        if (puntosTotales >= 100) {
            System.out.println("Rango: Oro");
        } else if (puntosTotales >= 50) {
            System.out.println("Rango: Plata");
        } else {
            System.out.println("Rango: Bronce");
        }

        // Reto: par o impar con el operador %
        if (nivel % 2 == 0) {
            System.out.println("Nivel par");
        } else {
            System.out.println("Nivel impar");
        }
    }
}
