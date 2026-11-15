# Lección 8: Proyecto final: Arena Pixel y errores comunes

- **Duración objetivo:** 12 minutos
- **Editor en línea:** OnlineGDB
- **Código:** `leccion-08-arena-pixel`
- **Objetivos de aprendizaje:**
    1. Integrar clases, encapsulación, constructores, `Scanner`, condicionales, bucles y arreglos de objetos.
    2. Reconocer y corregir 5 errores comunes de principiantes.
    3. Identificar próximos pasos para seguir aprendiendo.

| Tiempo | Pantalla | Narración |
|--------|----------|-----------|
| 0:00 | Demostración corta del juego terminado | "Hoy armas tu propio juego por consola: **Arena Pixel**. Tres jugadores, entrenamiento y duelos. Todo lo que aprendiste, en un solo programa." |
| 0:30 | Mapa del curso: lecciones 1 a 7 | "Usaremos todo: variables, decisiones, bucles, métodos, `Scanner`, clases, encapsulación y arreglos." |
| 1:00 | Diagrama: clase `Jugador`, arreglo, menú | "El plan: una clase `Jugador`, un arreglo de 3 jugadores y un menú que se repite hasta que elijas salir." |
| 1:45 | Clase `Jugador`: atributos `private` y constructor | "Empezamos por el molde. Nombre, nivel y vida son privados. El constructor deja nivel 1 y vida 100." |
| 2:45 | Getters, `setVida` con validación, `estaVivo` | "`setVida` mantiene la vida entre 0 y 100. `estaVivo` responde verdadero o falso." |
| 3:30 | `calcularAtaque`, `entrenar`, `recibirDanio`, `mostrarFicha` | "El ataque depende del nivel. Entrenar sube un nivel y recupera 10 de vida. Cada método hace una sola cosa." |
| 4:30 | Método `pedirJugador` | "Este método usa un `while` para repetir la pregunta hasta que el número sea válido. Así evitamos que el programa falle." |
| 5:15 | `main`: arreglo y `for` para pedir nombres | "En el `main` creamos el arreglo y, con un `for`, pedimos el nombre de cada jugador." |
| 6:00 | Menú con `while (opcion != 4)` | "El menú vive dentro de un `while`: se repite hasta que elijas la opción 4." |
| 6:45 | Opciones 1 y 2 | "Con `if / else if` decidimos qué hacer. La opción 1 recorre el arreglo. La opción 2 entrena a un jugador." |
| 7:30 | Opción 3: duelo | "En un duelo comprobamos tres cosas: que sean jugadores distintos, que ambos estén vivos, y luego uno ataca y el otro contraataca si sigue en pie." |
| 8:15 | Ejecución completa con entradas de ejemplo | "¡Vamos a jugar! Entrena a Luna, haz un duelo y mira cómo cambian los datos." |
| 9:00 | Pantalla dividida: 5 errores comunes (rojo) | "Ahora, los 5 errores que casi todos cometemos. Uno: olvidar `new`. Dos: usar `=` en lugar de `==`." |
| 9:45 | Errores 3, 4 y 5 en el editor | "Tres: bucle infinito. Cuatro: índice fuera del arreglo. Cinco: mezclar `nextInt` y `nextLine`. Lee siempre el mensaje del error: dice la línea y el problema." |
| 10:30 | **PAUSA** | "Pausa y agrega una opción nueva al menú. Por ejemplo, 'Descansar' para recuperar vida." |
| 10:50 | Retos finales en pantalla | "Retos: agrega un cuarto jugador, un ranking por nivel o una clase de personaje nueva. Si lees un nombre nuevo con `nextLine()` después de `nextInt()`, recuerda el error de la lección 5: agrega antes un `entrada.nextLine();` para limpiar el salto de línea pendiente." |
| 11:20 | Próximos pasos | "Para seguir: practica en la documentación oficial de Java, repite los ejercicios sin mirar la solución y comparte tu juego." |
| 11:45 | Cierre | "Hace 60 minutos no sabías programar. Hoy tienes tu propio juego. Esto recién empieza." |

## Pausa interactiva
"Pausa y agrega una opción nueva al menú."

## Descripción sugerida para YouTube
```
Lección 8 de 8: Proyecto final Arena Pixel y errores comunes.
Practica aquí (sin instalar nada): [ENLACE AL EDITOR EN LÍNEA PRECARGADO]
Código del curso: [ENLACE AL REPOSITORIO]
```

## Lista de verificación
- [ ] Las entradas de ejemplo para la demostración están preparadas (nombres y opciones).
- [ ] Se muestra el mensaje real de cada error.
- [ ] Sin nombres de autores en pantalla.
