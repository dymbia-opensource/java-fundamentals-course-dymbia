# Lección 4: Bucles: repite sin cansarte

- **Duración objetivo:** 6 minutos
- **Editor en línea:** JDoodle o OnlineGDB (no usa `Scanner`)
- **Código:** `leccion-04-bucles`
- **Objetivos de aprendizaje:**
    1. Usar `for` cuando se conoce el número de repeticiones.
    2. Usar `while` cuando se repite mientras se cumpla una condición.
    3. Reconocer y evitar un bucle infinito.

| Tiempo | Pantalla | Narración |
|--------|----------|-----------|
| 0:00 | Personaje entrenando 5 veces, repetido | "Para subir de nivel, tu personaje entrena 5 veces. ¿Vas a escribir 5 `println` iguales? ¿Y si fueran 1000?" |
| 0:20 | Repaso de `if` | "En la lección 3 aprendiste a decidir. Hoy aprendes a repetir." |
| 0:40 | Diagrama de un `for`: inicio, condición, paso | "El `for` tiene tres partes: dónde empieza el contador, hasta cuándo sigue, y cómo avanza." |
| 1:30 | Editor: `for (int i = 1; i <= 5; i++)` | "`i++` significa 'suma 1 a i'. Esta vuelta se repite mientras `i` sea menor o igual que 5." |
| 2:20 | `experiencia += 10;` dentro del bucle | "`+=` es un atajo: suma 10 a lo que ya había. Al terminar, la experiencia total es 50." |
| 3:00 | Diagrama de un `while` | "El `while` repite mientras una condición sea verdadera. Es como 'sigue corriendo mientras tengas energía'." |
| 3:40 | `while (vida > 0) { vida -= 10; ... }` | "Cada vuelta resta 10 a la vida. Cuando llega a 0, la condición es falsa y el bucle termina." |
| 4:20 | Se borra `vida -= 10;` y se ejecuta (se detiene a mano) | "¡Cuidado! Si la condición nunca cambia, el bucle no termina: es un bucle infinito. Detén el programa con el botón de parar y corrige." |
| 5:00 | **PAUSA** | "Pausa y haz que el programa cuente de 10 a 1." |
| 5:20 | Solución con `for (int i = 10; i >= 1; i--)` | "Se puede contar hacia atrás usando `i--`." |
| 5:40 | Tip de oro | "Tip de oro: antes de ejecutar un `while`, pregúntate: ¿qué línea hará que se termine?" |
| 5:50 | Avance | "Tu código ya crece. Hay que ordenarlo en bloques reutilizables. Lección 5." |

## Pausa interactiva
"Pausa y haz que el programa cuente de 10 a 1."

## Descripción sugerida para YouTube
```
Lección 4 de 8: Bucles for y while.
Practica aquí (sin instalar nada): [ENLACE AL EDITOR EN LÍNEA PRECARGADO]
Código del curso: [ENLACE AL REPOSITORIO]
```

## Lista de verificación
- [ ] El bucle infinito se detiene en cámara sin congelar la grabación.
- [ ] Sin nombres de autores en pantalla.
