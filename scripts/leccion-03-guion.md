# Lección 3: Operadores y decisiones: ¿pasas de nivel?

- **Duración objetivo:** 7 minutos
- **Editor en línea:** JDoodle o OnlineGDB (no usa `Scanner`)
- **Código:** `leccion-03-decisiones`
- **Objetivos de aprendizaje:**
    1. Usar operadores aritméticos (`+ - * / %`).
    2. Usar operadores de comparación (`> < >= <= == !=`) y lógicos (`&& || !`).
    3. Escribir decisiones con `if / else if / else`.

| Tiempo | Pantalla | Narración |
|--------|----------|-----------|
| 0:00 | Puerta de mazmorra con un candado | "Para entrar a la mazmorra necesitas nivel 5 y una llave. El juego debe decidir. ¿Cómo lo hace?" |
| 0:20 | Ficha de la lección 2 | "Repaso rápido: ayer guardamos nombre, nivel y vida en variables. Hoy las usamos para calcular y decidir." |
| 0:40 | Calculadora animada | "Los operadores hacen cuentas: suma, resta, multiplicación con `*`, división con `/`. Y hay uno especial: `%`, que da el residuo de una división." |
| 1:40 | Editor: `int puntosTotales = nivel * 10 + monedas;` | "Java respeta el orden de las operaciones: primero se multiplica y luego se suma, igual que en matemáticas." |
| 2:30 | Tabla de comparaciones | "Para comparar usamos `>`, `<`, `>=`, `<=`, `==` y `!=`. Cuidado: para preguntar si dos valores son iguales se usa dos signos igual. Uno solo asigna." |
| 3:20 | `if (nivel >= 5 && tieneLlave)` | "El operador `&&` significa 'y': deben cumplirse las dos condiciones. `||` significa 'o': basta con una." |
| 4:10 | Se ejecuta; luego se cambia `tieneLlave = false` | "Mira cómo cambia el resultado al cambiar un dato. Así el programa 'decide'." |
| 4:50 | `if / else if / else` para Oro, Plata y Bronce | "Con `else if` revisamos varias opciones en orden. Java se queda con la primera que sea verdadera." |
| 5:40 | `nivel % 2 == 0` | "Con `%` podemos saber si un número es par: si el residuo al dividir entre 2 es cero." |
| 6:10 | **PAUSA** con código en pantalla | "Pausa: ¿qué imprime esto si `nivel = 4` y `tieneLlave = true`? Primero predice, luego ejecuta." |
| 6:30 | Solución | "Imprime 'Todavía no': aunque tienes la llave, 4 no es mayor o igual que 5, y con `&&` deben cumplirse las dos condiciones. ¿Acertaste?" |
| 6:45 | Tip de oro | "Tip de oro: siempre usa llaves `{ }` en tus `if`, aunque tengan una sola línea." |
| 6:55 | Avance | "Tu juego ya decide. Ahora necesita repetir acciones sin copiar y pegar. Lección 4." |

## Pausa interactiva
"Pausa: ¿qué imprime esto si `nivel = 4` y `tieneLlave = true`? Predice antes de ejecutar."

## Descripción sugerida para YouTube
```
Lección 3 de 8: Operadores y decisiones con if / else if / else.
Practica aquí (sin instalar nada): [ENLACE AL EDITOR EN LÍNEA PRECARGADO]
Código del curso: [ENLACE AL REPOSITORIO]
```

## Lista de verificación
- [ ] Se muestra el error `=` en lugar de `==` (el editor lo marca).
- [ ] Colores consistentes (rojo para el error).
- [ ] Sin nombres de autores en pantalla.
